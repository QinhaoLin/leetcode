package easy.t268;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-31 19:23
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("new Main().missingNumber() = " + new Main().missingNumber(nums));
    }

    /**
     * ����һ������ 0, 1, 2, ..., n �� n ���������У��ҳ� 0 .. n ��û�г����������е��Ǹ�����
     * ע�⣺Ҫ�ҵ������� [0,n] �е���������ĳ����� n
     *
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}
