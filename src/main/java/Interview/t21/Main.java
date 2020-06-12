package Interview.t21;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-12 17:33
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("new Main().exchange() = " + Arrays.toString(new Main().exchange(nums)));
    }

    /**
     * ���Ƕ���˫ָ�� i , j ���������������ˣ�ѭ��ִ�У�
     * ָ�� i ��������Ѱ��ż����
     * ָ�� j ��������Ѱ��������
     * �� ż�� nums[i] �� ���� nums[j] ������
     * ��ʼ�ձ�֤�� ָ�� i ��߶���������ָ�� j �ұ߶���ż�� ��
     *
     * @param nums
     * @return
     */
    public int[] exchange(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int tmp;
        while (i < j) {
            while (i < j && (nums[i] % 2 != 0)) {
                i++;
            }
            while (i < j && (nums[j] % 2 == 0)) {
                j--;
            }
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}
