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
     * 贪心
     * 使用单个数组作为输入来查找最大（或最小）元素（或总和）的问题，贪心算法是可以在线性时间解决的方法之一。
     * 每一步都选择最佳方案，到最后就是全局最优的方案。
     * <p>
     * 当前元素
     * 当前元素位置的最大和
     * 迄今为止的最大和
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
     * 动态规划-不理解
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
