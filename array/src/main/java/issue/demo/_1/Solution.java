package issue.demo._1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Solution {

    /**
     * description:
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     */

    /**
     * 1.存在负数
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1,-1};
    }

    /**
     * 哈希+两次遍历
     * 将根据下标获取值转换为根据值获取数组下标
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum_1(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int sub = target - -nums[i];
            if (hash.containsKey(sub) && hash.get(sub)!=i){
                return new int[]{i, hash.get(sub)};
            }
        }
        throw new IllegalArgumentException("no two sum solution!");
    }

    public static int[] twoSum_2(int [] nums, int target){
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = nums.length-1; i >=0; i--) {
            int sub = target-nums[i];
            if (hash.containsKey(sub)){
                return new int[]{i, hash.get(sub)};
            }
            hash.put(nums[i], i);
        }
        throw new IllegalArgumentException("no two sum solution!");
    }
}
