package issue.demo._4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findMedianSortedArrays() {
        int[] a = {1};
        int[] b = {2,3,4};
        System.out.println(Solution.findMedianSortedArrays(a,b));
    }
}