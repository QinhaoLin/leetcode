package easy.t53;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-09 17:32
 */
public class Main {
    public static void main(String[] args) {
        int[] test = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("new Main().maxSubArray(test) = " + new Main().maxSubArray(test));
    }

    /**
     * ̰��
     * ʹ�õ���������Ϊ������������󣨻���С��Ԫ�أ����ܺͣ������⣬̰���㷨�ǿ���������ʱ�����ķ���֮һ��
     * ÿһ����ѡ����ѷ�������������ȫ�����ŵķ�����
     * <p>
     * ��ǰԪ��
     * ��ǰԪ��λ�õ�����
     * ����Ϊֹ������
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSum = nums[0], maxSum = nums[0];
        for (int i = 1; i < n; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    /**
     * ��̬�滮-�����
     * @param nums
     * @return
     */
    public int maxSubArray2(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        for (int i = 1; i < n; ++i) {
            if (nums[i - 1] > 0) {
                nums[i] += nums[i - 1];
            }
            maxSum = Math.max(nums[i], maxSum);
        }
        return maxSum;
    }


}
