package easy.t26;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-16 20:04
 */
public class Main {
    public static void main(String[] args) {
        // int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums = {1, 1, 2};
        System.out.println("new Main().removeDuplicates() = " + new Main().removeDuplicates(nums));
        System.out.println("Arrays.toString() = " + Arrays.toString(nums));
    }

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums.length;
        }
        int pos = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                pos++;
            } else {
                nums[i - pos] = nums[i];
            }
        }
        return nums.length - pos;
    }
}
