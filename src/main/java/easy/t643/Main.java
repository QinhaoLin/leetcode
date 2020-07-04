package easy.t643;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-07-04 10:05
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println("new Main().findMaxAverage() = " + new Main().findMaxAverage(nums, k));
    }

    public double findMaxAverage(int[] nums, int k) {
        double avg = Double.MIN_VALUE;
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = nums[i - 1] + nums[i];
        }
        for (int i = k; i < sum.length; i++) {
            avg = Math.max(avg, (sum[i] - sum[i - k]) * 1.0 / k);
        }
        return avg;
    }
}
