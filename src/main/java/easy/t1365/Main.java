package easy.t1365;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-21 17:11
 */
public class Main {
    public static void main(String[] args) {
        /**
         * ���룺nums = [8,1,2,2,3]
         * �����[4,0,1,1,3]
         * ���ͣ�
         * ���� nums[0]=8 �����ĸ�����С�����֣���1��2��2 �� 3����
         * ���� nums[1]=1 �����ڱ���С�����֡�
         * ���� nums[2]=2 ����һ������С�����֣���1����
         * ���� nums[3]=2 ����һ������С�����֣���1����
         * ���� nums[4]=3 ������������С�����֣���1��2 �� 2����
         */
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println("new Main().smallerNumbersThanCurrent() = " + Arrays.toString(new Main().smallerNumbersThanCurrent(nums)));
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    res[i]++;
                } else if (nums[i] < nums[j]) {
                    res[j]++;
                }
            }
        }
        return res;
    }
}
