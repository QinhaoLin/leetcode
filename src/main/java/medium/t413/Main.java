package medium.t413;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-26 10:03
 */
public class Main {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        System.out.println("new Main().numberOfArithmeticSlices() = " + new Main().numberOfArithmeticSlices(A));

    }


    public int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length < 2) {
            return 0;
        }
        // dp[i] 表示以 A[i] 为结尾的等差递增子区间的个数
        int[] dp = new int[A.length];
        for (int i = 2; i < A.length; i++) {
            // 当 A[i] - A[i-1] == A[i-1] - A[i-2]，那么 [A[i-2], A[i-1], A[i]] 构成一个等差递增子区间
            // 在以 A[i-1] 为结尾的递增子区间的后面再加上一个 A[i]，一样可以构成新的递增子区间
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                dp[i] = dp[i - 1] + 1;
            }
        }
        int count = 0;
        for (int n : dp) {
            count += n;
        }
        return count;
    }
}
