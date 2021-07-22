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
        // 每次判断当前坐标加步长是否大于数组
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        for (int i = 0; i < length - 1; i++) {
            // 记录当前下标最远路径
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (maxPosition <= i) {
                return false;
            }
            // System.out.println("i = " + i + " maxPosition = " + maxPosition);
            if (i == end) {
                end = maxPosition;
            }
        }
        // 最远距离是否小于数组长度
        return maxPosition < nums.length - 1 ? false : true;
    }
}
