package medium.t540;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-15 09:30
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println("new Main().singleNonDuplicate() = " + new Main().singleNonDuplicate3(nums));
    }

    public int singleNonDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public int singleNonDuplicate2(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp ^= nums[i];
        }
        return temp;
    }

    /**
     * ���ַ�
     * ֻ��������ż��λ
     *
     * @param nums
     * @return
     */
    public int singleNonDuplicate3(int[] nums) {
        // �����俪ʼ
        int left = 0;
        // ���������
        int right = nums.length - 1;

        while (left < right) {
            // int mid = (left + right) / 2
            // ��ֹ���
            int mid = left + (right - left) / 2;
            if (mid % 2 == 1) mid--;
            // ����ż��λ �� ����ż��λ+1 �Ա�
            if (nums[mid] == nums[mid + 1]) {
                // �����ȣ�˵����һԪ�����ұ�
                // mid = 2��5 5 6 6 7
                left = mid + 2;
            } else {
                // ����ȣ���˵����һԪ�������
                // mid = 2��5 6 6 7 7
                right = mid;
            }
        }
        return nums[left];
    }
}
