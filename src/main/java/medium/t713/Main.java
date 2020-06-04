package medium.t713;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-04 15:05
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        System.out.println("new Main().numSubarrayProductLessThanK() = " + new Main().numSubarrayProductLessThanK(nums, k));
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int res = 0;
        int ride = 1;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            ride *= nums[right];
            // ʼ�ձ�֤��ǰ�����г˻�С�� k
            while (ride >= k) {
                ride /= nums[left++];
            }
            // ����������[10, 5, 2, 6]����ʼ���������ֻ��10������ res + 1��
            // ֮�󴰿��м�����5�����[10,5],
            // ���������������У�{{10},{5},{10,5}}��֮ǰ��10�Ѿ��ӹ��ˣ�
            // ���ÿ�μӽ�ȥ���������������Ե�ǰ right ��Ӧ����Ϊ�׵����������飬
            // ����[10,5,2]����2Ϊ�׾���{2,25,2510},��ӦΪ right - left + 1
            // ��������е����Ϊ n!
            res += right - left + 1;
        }
        return res;
    }
}
