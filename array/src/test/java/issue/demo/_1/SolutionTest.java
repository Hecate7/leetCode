package issue.demo._1;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int result = 10;
        Assert.assertArrayEquals(new int[]{-1,-1}, Solution.twoSum(nums, result));
    }
}