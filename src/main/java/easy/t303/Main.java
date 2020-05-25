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

    // ������ i ~ j �ĺͣ�����ת��Ϊ sum[j + 1] - sum[i]������ sum[i] Ϊ 0 ~ i - 1 �ĺ͡�
    public NumArray(int[] nums) {
        sums = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            // ��ǰ����ĺ� = ��һ������ĺ� + ��ǰ����λ�õ�ֵ
            sums[i] = sums[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return sums[j + 1] - sums[i];
    }
}
