package medium.t152;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-04 10:10
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("new Main().maxProduct() = " + new Main().maxProduct(nums));
    }


    public int maxProduct(int[] nums) {
        // һ���������ģ�һ��������С�ġ�
        int max = Integer.MIN_VALUE;
        int iMax = 1;
        int iMin = 1;
        for (int i = 0; i < nums.length; i++) {
            // �����������Ǹ�������ô�ᵼ�����ı���С�ģ���С�ı����ġ���˽���������ֵ��
            if (nums[i] < 0) {
                int tmp = iMax;
                iMax = iMin;
                iMin = tmp;
            }
            iMax = Math.max(iMax * nums[i], nums[i]);
            iMin = Math.min(iMin * nums[i], nums[i]);

            max = Math.max(max, iMax);
        }
        return max;
    }
}
