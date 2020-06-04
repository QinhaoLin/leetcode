package medium.t238;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-04 09:19
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("new Main().productExceptSelf() = " + Arrays.toString(new Main().productExceptSelf(nums)));
    }

    public int[] productExceptSelf(int[] nums) {
        int left = 1;
        int right = 1;
        int len = nums.length;
        int[] output = new int[len];
        for (int i = 0; i < len; i++) {
            output[i] = left;
            left *= nums[i];
        }
        for (int j = len - 1; j >= 0; j--) {
            output[j] *= right;
            right *= nums[j];
        }
        return output;
    }
}
