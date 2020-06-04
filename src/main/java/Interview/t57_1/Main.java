package Interview.t57_1;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-04 16:29
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 15};
        int target = 9;
        System.out.println("new Main().twoSum() = " + Arrays.toString(new Main().twoSum(nums, target)));
    }

    /**
     * nums 是有序数组，使用双指针
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[right] + nums[left];
            if (sum == target) {
                return new int[]{nums[left], nums[right]};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{};
    }
}
