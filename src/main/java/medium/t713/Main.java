package medium.t713;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-04 15:05
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        System.out.println("new Main().numSubarrayProductLessThanK() = " + new Main().numSubarrayProductLessThanK(nums, k));
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int res = 0;
        int ride = 1;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            ride *= nums[right];
            // 始终保证当前窗口中乘积小于 k
            while (ride >= k) {
                ride /= nums[left++];
            }
            // 比如例子中[10, 5, 2, 6]，初始情况窗口中只有10，所以 res + 1，
            // 之后窗口中加上了5，变成[10,5],
            // 其中连续子数组有：{{10},{5},{10,5}}，之前的10已经加过了，
            // 因此每次加进去的连续子数组是以当前 right 对应的数为首的连续子数组，
            // 再以[10,5,2]，以2为首就是{2,25,2510},对应为 right - left + 1
            // 最长子数组中的组合为 n!
            res += right - left + 1;
        }
        return res;
    }
}
