package medium.t55;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-07-22 17:44
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 0, 1, 0};
        System.out.println("new Main().canJump(nums) = " + new Main().canJump(nums));
    }


    public boolean canJump(int[] nums) {
        // ÿ���жϵ�ǰ����Ӳ����Ƿ��������
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        for (int i = 0; i < length - 1; i++) {
            // ��¼��ǰ�±���Զ·��
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (maxPosition <= i) {
                return false;
            }
            // System.out.println("i = " + i + " maxPosition = " + maxPosition);
            if (i == end) {
                end = maxPosition;
            }
        }
        // ��Զ�����Ƿ�С�����鳤��
        return maxPosition < nums.length - 1 ? false : true;
    }
}
