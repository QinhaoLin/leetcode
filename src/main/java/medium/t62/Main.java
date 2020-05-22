package medium.t62;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-22 14:38
 */
public class Main {
    public static void main(String[] args) {
        int m = 7;
        int n = 3;
        System.out.println("new Main().uniquePaths() = " + new Main().uniquePaths(m, n));
    }

    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }
        return dp[n - 1];
    }

    /**
     * 从终点反推看,到达当前可以是当前行的前一个格子，或者当前列的前一个格子。
     *
     * @param m 列 column
     * @param n 行 row
     * @return
     */
    public int uniquePaths2(int m, int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0) {
                    dp[j] += dp[j - 1];
                }
            }
        }
        return dp[n - 1];
    }
}
