package Interview.t16_17;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-19 13:56
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("new Main().maxSubArray() = " + new Main().maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= 0) {
                nums[i] += nums[i - 1];
            }
            max = Math.max(max, nums[i]);
        }
        return max;
    }

}
