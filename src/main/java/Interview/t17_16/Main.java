package Interview.t17_16;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-24 15:07
 */
public class Main {
    public static void main(String[] args) {
        // int[] nums = {2, 7, 9, 3, 1};
        int[] nums = {7, 2, 1, 8, 3};
        System.out.println("new Main().massage() = " + new Main().massage2(nums));
    }

    /**
     * dp
     *
     * @param nums
     * @return
     */
    public int massage(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            // 递推方程：dp[i] = max(dp[i - 1], dp[i - 2] + nums[i])
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }

    public int massage2(int[] nums) {
        // 总时长
        int sum = 0;
        // 不选当前值的情况
        int unselected = 0;
        for (int i = 0; i < nums.length; i++) {
            // 得到最大值
            int c = Math.max(sum, unselected + nums[i]);
            unselected = sum;
            sum = c;
        }
        return sum;
    }
}
