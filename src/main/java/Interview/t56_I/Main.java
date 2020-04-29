package Interview.t56_I;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-28 17:41
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 10, 4, 1, 4, 3, 3};
        System.out.println("new Main().singleNumbers() = " + Arrays.toString(new Main().singleNumbers(nums)));
    }

    /**
     * nums = [1,2,10,4,1,4,3,3]
     * a^a=0
     * a^0=a
     * a^b^c=a^c^b
     * a&(-a)=���λΪ1�Ķ����ƣ����ҵ���
     * ���е�������õ�sum=2^10=8
     * flag = -8 & 8 = 8
     * �ɷ�Ϊ���飬һ��Ϊ�� flag �������1��[10]����һ��Ϊ0��[1,2,4,1,4,3,3]
     * �������ֱ�õ���10����2��
     *
     * @param nums
     * @return
     */
    public int[] singleNumbers(int[] nums) {
        int sum = 0;
        // �õ����������Ϊ����ͬ������������� sum
        for (int num : nums) {
            sum ^= num;
        }
        int result[] = new int[2];
        // �õ� sum �Ķ����Ƶ�1�����λ
        int flag = (-sum) & sum;
        // �ֳ�������������ÿ������Ľ�����ǲ���ͬ������������֮һ
        for (int num : nums) {
            if ((flag & num) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }
        return result;
    }
}
