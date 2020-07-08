package issue.demo._16;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3) return -1;

        //nums排序
        Arrays.sort(nums);
        int result = Integer.MIN_VALUE;
        int minDiffer = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i!=0 && nums[i]==nums[i-1]) continue;

            int min = i+1;
            int max = nums.length-1;
            int sub = target-nums[i];


            while (min < max){
                int sum = nums[min]+nums[max];
                if (sub == sum){
                    return target;
                }

                int abs = Math.abs(sub - sum);
                if (abs < minDiffer){
                    minDiffer = abs;
                    result = nums[i]+sum;
                }
                if (sum < sub){
                    min++;
                } else if (sum > sub){
                    max--;
                }
            }
        }
        return result;
    }
}
