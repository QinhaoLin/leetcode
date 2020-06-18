package easy.t189;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-16 10:08
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        new Main().rotate(nums, k);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }

    /**
     * 先分别对前n-k个元素和后k个元素翻转，然后再对整个数组翻转
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        int size = nums.length;
        k %= size;
        reverse(nums, 0, size - k - 1);
        reverse(nums, size - k, size - 1);
        reverse(nums, 0, size - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
