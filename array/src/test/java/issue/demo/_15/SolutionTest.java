package issue.demo._15;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void threeSum() {
        Solution solution = new Solution();
        int[] sum = {0,-4,-1,-4,-2,-3,2};
        System.out.println(solution.threeSum(sum));
    }
}