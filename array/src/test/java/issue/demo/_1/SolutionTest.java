package issue.demo._1;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void twoSum() {
        int[] nums = {3,3};
        int result = 6;
        Assert.assertArrayEquals(new int[]{0,1}, Solution.twoSum_2(nums, result));
    }
}