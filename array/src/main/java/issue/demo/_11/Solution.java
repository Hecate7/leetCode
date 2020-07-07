package issue.demo._11;

public class Solution {

    /**
     * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
     * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
     * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     *
     * 说明：你不能倾斜容器，且 n 的值至少为 2。
     *
     * @param height
     * @return
     */
    public static int maxArea(int[] height){
        int i=0, j=height.length-1, res=0;

        //两根柱子i，j
        while (i<j){
            //i或j移动过程中均会导致底边变短，面积受到值较小的指针的限制
            //必须使高边长，面积才会变大，因此移动值较小的指针
            if (height[i]<=height[j]){
                //指针i的值较小，移动i
                res = Math.max(res, (j-i)*height[i]);
                i++;
            } else {
                //指针j的值较小，移动j
                res = Math.max(res, (j-i)*height[j]);
                j++;
            }
        }
        return res;
    }
}
