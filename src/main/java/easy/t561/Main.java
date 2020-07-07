package easy.t561;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-07-07 17:23
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        System.out.println("new Main().arrayPairSum(nums) = " + new Main().arrayPairSum(nums));
    }

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
