package issue.demo._4;

/**
 * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
 *
 * 请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 */
public class Solution {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /**
         * 获取中位数->获取第K位数
         * 通过二分法，每次去除K/2位数，直到K=1，取剩余数组首位数比较大小
         * 为了方便处理边界值，使nums1.length()<nums2.length
         */

        int n1 = nums1.length;
        int n2 = nums2.length;
        if (n1> n2){
            findMedianSortedArrays(nums2, nums1);
        }

        int k = (n1+n2+1)/2;
        if ((n1+n2)%2==1){
            return getKth(nums1, nums2, k);
        } else {
            return (getKth(nums1, nums2, k)+getKth(nums1, nums2, k+1))/2.0;
        }
    }

    /**
     * 获取第K个元素，要求nums1.length<nums2.length
     * @param nums1
     * @param nums2
     * @param k
     * @return
     */
    private static double getKth(int[] nums1, int[] nums2, int k){
        if (nums1.length == 0){
            return nums2[k-1];
        }


        int s1=0, s2=0;
        while (k>1){
            int index = Math.min(k/2, nums1.length);
            //节点哨兵值
            if (((s1+index-1)<nums1.length?nums1[s1+index-1]:Integer.MAX_VALUE)
                    >=((s2+index-1)<nums2.length?nums2[s2+index-1]:Integer.MAX_VALUE)){
                s2 = s2+index;
            } else {
                s1 = s1+index;
            }
            k = k-index;
        }

        return Math.min(s1<nums1.length?nums1[s1]:Integer.MAX_VALUE,
                s2<nums2.length?nums2[s2]:Integer.MAX_VALUE);
    }


    public static double findMedianSortedArrays_1(int[] nums1, int[] nums2) {
        //合并成一个数组
        int[] merge = new int[nums1.length+nums2.length];
        int i=0,j=0,index=0;
        while (i<=nums1.length || j<=nums2.length){
            if (i==nums1.length && j==nums2.length){
                break;
            }
            //从nums1[]中添加元素
            if (j==nums2.length || (i<nums1.length&&nums1[i]<=nums2[j])){
                merge[index++] = nums1[i++];
            } else if (i==nums1.length || (j<nums2.length&&nums2[j]<nums1[i])){
                merge[index++] = nums2[j++];
            }
        }

        int length = merge.length;
        if (length%2==0){
            return (merge[length/2]+merge[(length/2)-1])/2.0;
        } else {
            return merge[length/2];
        }
    }
}
