package easy.t283;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-16 18:34
 */
public class Main {
    public static void main(String[] args) {
        // int[] test = {0, 1, 0, 3, 12};
        int[] test = {1, 0};
        new Main().moveZeroes(test);
        System.out.println(Arrays.toString(test));
    }

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int moveLength = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == 0) {
                moveLength++;
            } else {
                nums[i - moveLength] = nums[i];
            }
        }
        while (moveLength > 0) {
            nums[size - moveLength] = 0;
            moveLength--;
        }
    }
}
