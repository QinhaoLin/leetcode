package easy.t665;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-16 14:53
 */
public class Main {

    /**
     * ��������������һ���ǵݼ����еģ� �������������е� i (1 <= i < n)������ array[i] <= array[i + 1]��
     * ����: [4,2,3]
     * ���: true
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] test = {3, 4, 2, 3};
        System.out.println("new Main().checkPossibility() = " + new Main().checkPossibility(test));
    }

    // a. [3,4,2,5] ��Ҫ��2���4��4���ܶ�����Ϊ��Ҫ���ڵ���ǰһ��3��
    // b. [1,3,2,2] ��Ҫ��3���1��2��2���ܶ�����Ϊ��ҪС�ڵ��ں�һ��2��
    public boolean checkPossibility(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] <= nums[i]) {
                continue;
            }
            count++;
            if (count > 1) {
                return false;
            }
            if (i >= 2 && nums[i - 2] > nums[i]) {
                nums[i] = nums[i - 1];
            } else {
                nums[i - 1] = nums[i];
            }
        }
        return true;
    }
}
