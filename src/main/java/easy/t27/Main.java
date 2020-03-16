package easy.t27;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-16 16:27
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int val = 2;
        System.out.println("new Main().removeElement(nums, val) = " + new Main().removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }

    public int removeElement(int[] nums, int val) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[n] = nums[i];
                n++;
            }
        }
        return n;
    }
}
