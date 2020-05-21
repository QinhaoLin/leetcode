package medium.t213;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-27 12:25
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 1, 1, 2};
        System.out.println("new Main().rob() = " + new Main().rob2(nums));
    }

    /**
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        // Ҫ��� 0 �Һ͵� n-1 ����ԶҲ����ͬʱ��͵�����Կ��ǵ� 0 �ҵ�ʱ��Ҫ������ n-1 �ң����ǵ� n-1 �ҵ�ʱ��Ҫ������ 0 ��
        // �����������Ա�ֱ�ȥ��198��Ķ�̬�滮��ȡ��ļ���
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
            // ѡ��dp[i-1] + nums[i]
            dp_i_2 = dp_i_1;
            // ��ѡ��dp[i]
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

    public int rob2(int[] nums) {
        // Ҫ��� 0 �Һ͵� n-1 ����ԶҲ����ͬʱ��͵�����Կ��ǵ� 0 �ҵ�ʱ��Ҫ������ n-1 �ң����ǵ� n-1 �ҵ�ʱ��Ҫ������ 0 ��
        // �����������Ա�ֱ�ȥ��198��Ķ�̬�滮��ȡ��ļ���
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int size = nums.length;
        if (size == 1) {
            return nums[0];
        }
        if (size == 2) {
            return Math.max(nums[0], nums[1]);
        }

        // length > 2
        int[] dp1 = new int[size];
        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[0], nums[1]);

        int[] dp2 = new int[size];
        dp2[1] = nums[1];
        dp2[2] = Math.max(nums[1], nums[2]);
        // [0, n - 1]
        for (int i = 2; i < size - 1; i++) {
            dp1[i] = Math.max(dp1[i - 2] + nums[i], dp1[i - 1]);
        }
        // [1, n]
        for (int i = 3; i < size; i++) {
            dp2[i] = Math.max(dp2[i - 2] + nums[i], dp2[i - 1]);
        }
        return Math.max(dp1[size - 2], dp2[size - 1]);
    }
}
