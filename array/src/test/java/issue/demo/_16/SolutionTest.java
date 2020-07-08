package issue.demo._16;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void threeSumClosest() {
        Solution solution = new Solution();
        int[] nums = {1,1,1,0};
        Assert.assertEquals(2,solution.threeSumClosest(nums, -100));
    }
}