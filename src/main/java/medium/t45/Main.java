package medium.t45;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-07-22 09:04
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 2, 4, 2, 3};
        System.out.println("new Main().jump(nums) = " + new Main().jump(nums));
    }

    public int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            // 记录当前下标最远路径
            maxPosition = Math.max(maxPosition, i + nums[i]);
            System.out.println("i = " + i + " maxPosition = " + maxPosition);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}
