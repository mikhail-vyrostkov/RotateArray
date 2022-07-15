import java.util.Arrays;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        Solution.rotate(nums, k);
    }

    public static class Solution {
        public static void rotate(int[] nums, int k) {
//            for (int j = 0; j < k; j++) {
//                int cur = nums[0];
//                for (int i = 0; i < nums.length; i++) {
//                    int buff = nums[(i + 1) % nums.length];
//                    nums[(i + 1) % nums.length] = cur;
//                    cur = buff;
//                }
//            }
            k = k % nums.length;
            int[] buff = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                buff[i] = nums[(i + nums.length - k) % nums.length];
            }
            System.arraycopy(buff, 0, nums, 0, nums.length);
            System.out.println(Arrays.toString(nums));
        }
    }
}
