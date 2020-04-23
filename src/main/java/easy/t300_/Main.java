package easy.t300_;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-22 17:27
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("new Main().lengthOfLIS() = " + new Main().lengthOfLIS(nums));
    }

    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return len;
        }
        int[] dp = new int[len];
        // �Լ�һ����һ��������
        Arrays.fill(dp, 1);
        for (int i = 1; i < len; i++) {
            // ����ǰ�ģ�����С�ģ�˵�����Խ��ں����γ�һ��������������
            // int curMax = Integer.MIN_VALUE; ��������д����һǰ��û�б��Լ�С�ģ�
            // ���ֵ�͵ò�������
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }

        int res = dp[0];
        for (int i = 0; i < len; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
