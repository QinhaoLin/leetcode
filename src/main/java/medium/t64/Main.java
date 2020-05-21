package medium.t64;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-21 12:34
 */
public class Main {
    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}};
        System.out.println("new Main().minPathSum() = " + new Main().minPathSum(grid));
    }

    public int minPathSum(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length, n = grid[0].length;
        int[] dp = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    // 只能从上侧走到该位置
                    dp[j] = dp[j];
                } else if (i == 0) {
                    // 只能从左侧走到该位置
                    dp[j] = dp[j - 1];
                } else {
                    // 从左侧走到该位置或者从上侧走到该位置
                    dp[j] = Math.min(dp[j - 1], dp[j]);
                }
                // 当前位置 dp = 走到目前此位置前的路径和+此路径的值
                dp[j] += grid[i][j];
            }
        }
        return dp[n - 1];
    }
}
