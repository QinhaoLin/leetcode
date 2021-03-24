package easy.t414;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-03-24 11:28
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 3, 1};
        System.out.println("new Main().thirdMax(nums) = " + new Main().thirdMax(nums));
    }

    public int thirdMax(int[] nums) {
        int size = nums.length;
        if (size == 1) {
            return nums[0];
        }
        if (size == 2) {
            return Math.max(nums[0], nums[1]);
        }
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for (int n : nums) {
            // 过滤重复的数
            if (firstMax == n || secondMax == n) {
                continue;
            }
            if (n > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = n;
            } else if (n > secondMax) {
                thirdMax = secondMax;
                secondMax = n;
            } else if (n > thirdMax) {
                thirdMax = n;
            }
        }
        return thirdMax == Long.MIN_VALUE ? (int) firstMax : (int) thirdMax;
    }
}
