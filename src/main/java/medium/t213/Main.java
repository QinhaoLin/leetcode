package medium.t213;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-27 12:25
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, 2};
        System.out.println("new Main().rob() = " + new Main().rob(nums));
    }

    /**
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        // 要求第 0 家和第 n-1 家永远也不能同时被偷，所以考虑第 0 家的时候不要包含第 n-1 家，考虑第 n-1 家的时候不要包含第 0 家
        // 用这两个线性表分别去做198题的动态规划，取大的即可
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        // length >= 2
        // [0, n - 1]
        int dp_max1 = nums[0];
        int dp_i_1 = 0;
        int dp_i_2 = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            // 选，dp[i-1] + nums[i]
            dp_i_2 = dp_i_1;
            // 不选，dp[i]
            dp_i_1 = dp_max1;
            if (dp_i_2 + nums[i] > dp_i_1) {
                dp_max1 = dp_i_2 + nums[i];
            } else {
                dp_max1 = dp_i_1;
            }
        }
        // [1, n]
        int dp_max2 = nums[1];
        dp_i_1 = 0;
        dp_i_2 = 0;
        for (int i = 2; i < nums.length; i++) {
            dp_i_2 = dp_i_1;
            dp_i_1 = dp_max2;
            if (dp_i_2 + nums[i] > dp_i_1) {
                dp_max2 = dp_i_2 + nums[i];
            } else {
                dp_max2 = dp_i_1;
            }
        }
        return Math.max(dp_max1, dp_max2);
    }
}
