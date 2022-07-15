import junit.framework.TestCase;

import java.util.Arrays;

public class RotateTest extends TestCase {

    public void testProfit1(){
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        Main.Solution.rotate(nums, k);
        int[] actualPrices = nums;
        int[] expectedPrices = {5, 6, 7, 1, 2, 3, 4};
        assertEquals(Arrays.toString(expectedPrices), Arrays.toString(actualPrices));
    }

    public void testProfit2(){
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int k = 7;
        Main.Solution.rotate(nums, k);
        int[] actualPrices = nums;
        int[] expectedPrices = {10, 11, 12, 13, 14, 15, 16, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(Arrays.toString(expectedPrices), Arrays.toString(actualPrices));
    }
}
