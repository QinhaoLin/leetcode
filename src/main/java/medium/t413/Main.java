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
        // dp[i] ��ʾ�� A[i] Ϊ��β�ĵȲ����������ĸ���
        int[] dp = new int[A.length];
        for (int i = 2; i < A.length; i++) {
            // �� A[i] - A[i-1] == A[i-1] - A[i-2]����ô [A[i-2], A[i-1], A[i]] ����һ���Ȳ����������
            // ���� A[i-1] Ϊ��β�ĵ���������ĺ����ټ���һ�� A[i]��һ�����Թ����µĵ���������
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
