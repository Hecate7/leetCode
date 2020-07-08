package issue.demo._15;

import common.sort.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    /**
     * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
     *
     * 注意：答案中不可以包含重复的三元组。
     *
     */

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3){
            return result;
        }

        //排序nums
        QuickSort.quickSort(nums, 0, nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            if (i>0 && nums[i]==nums[i-1]) continue;

            int p1 = i+1;
            int p2 = nums.length-1;
            while (p1<p2){
                if (nums[p1]+nums[p2]<-nums[i]){
                    p1++;
                } else if (nums[p1]+nums[p2]>-nums[i]){
                    p2--;
                } else {
                    //相等时也设定p1移动
                    result.add(Arrays.asList(nums[i], nums[p1], nums[p2]));
                    //当值相等时，跳过
                    p1++;
                    int preValue = nums[p1];
                    while (nums[p1]==preValue && p1<p2){
                        p1++;
                    }
                }
            }
        }
        return result;

    }


}
