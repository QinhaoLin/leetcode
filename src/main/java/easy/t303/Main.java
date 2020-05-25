package easy.t303;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-25 12:29
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        System.out.println("new Main().sumRange(0, 2) = " + new NumArray(nums).sumRange(0, 2));
    }
}

class NumArray {
    private int[] sums;

    // 求区间 i ~ j 的和，可以转换为 sum[j + 1] - sum[i]，其中 sum[i] 为 0 ~ i - 1 的和。
    public NumArray(int[] nums) {
        sums = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            // 当前区间的和 = 上一个区间的和 + 当前索引位置的值
            sums[i] = sums[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return sums[j + 1] - sums[i];
    }
}
