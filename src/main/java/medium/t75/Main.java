package medium.t75;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        new Main().sortColors(nums);
        System.out.println("nums = " + Arrays.toString(nums));
    }

    public void sortColors(int[] nums) {
        int[] temp = new int[3];

        for (int num : nums) {
            temp[num]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp[0] != 0) {
                temp[0]--;
                nums[i] = 0;
            } else if (temp[1] != 0) {
                temp[1]--;
                nums[i] = 1;
            } else if (temp[2] != 0) {
                temp[2]--;
                nums[i] = 2;
            }
        }
    }

    /**
     * ������ɫ�������
     *
     * @param nums
     */
    public void sortColors2(int[] nums) {
        // �������� idx < i : nums[idx < i] = 0
        // j �ǵ�ǰ����Ԫ�ص��±�
        int p0 = 0;
        int curr = 0;
        // �������� idx > k : nums[idx > k] = 2
        int p2 = nums.length - 1;

        int tmp;
        while (curr <= p2) {
            if (nums[curr] == 0) {
                // ������ p0���͵�curr��Ԫ��
                // i++��j++
                tmp = nums[p0];
                nums[p0++] = nums[curr];
                nums[curr++] = tmp;
            } else if (nums[curr] == 2) {
                // ������k���͵�curr��Ԫ��
                // p2--
                tmp = nums[curr];
                nums[curr] = nums[p2];
                nums[p2--] = tmp;
            } else curr++;
        }
    }

}
