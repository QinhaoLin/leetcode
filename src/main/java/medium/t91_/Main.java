package medium.t91_;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-26 10:29
 */
public class Main {
    public static void main(String[] args) {
        String s = "1234";
        System.out.println("new Main().numDecodings() = " + new Main().numDecodings(s));
    }

    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        // dp[i] ��ʾ�ӵ�i��������n���������з�����
        int[] dp = new int[n + 1];
        dp[0] = 1;
        // dp[1] ��ʾ��һ�����ķ���
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        // ������i��������n���������з�����
        for (int i = 2; i <= n; i++) {
            int one = Integer.valueOf(s.substring(i - 1, i));
            if (one != 0) {
                dp[i] += dp[i - 1];
            }
            if (s.charAt(i - 2) == '0') {
                continue;
            }
            int two = Integer.valueOf(s.substring(i - 2, i));
            if (two <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }
}
