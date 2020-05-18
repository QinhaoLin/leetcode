package medium.t34;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-15 12:44
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10, 10, 10};
        int target = 8;
        System.out.println("new Main().searchRange(nums, target) = " + Arrays.toString(new Main().searchRange(nums, target)));
    }

    /**
     * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
     * 你的算法时间复杂度必须是 O(log n) 级别。
     * 如果数组中不存在目标值，返回[-1, -1]。
     * <p>
     * 示例 1:
     * 输入: nums = [5,7,7,8,8,10], target = 8
     * 输出: [3,4]
     * <p>
     * 示例 2:
     * 输入: nums = [5,7,7,8,8,10], target = 6
     * 输出: [-1,-1]
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        } else {
            int last = findFirst(nums, target + 1) - 1;
            return new int[]{first, last};
        }
    }

    /**
     * 查找 target 在数组 nums 中首次出现的位置
     *
     * @param nums
     * @param target
     * @return
     */
    private int findFirst(int[] nums, int target) {
        int left = 0;
        // 注意 right 的初始值
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            // 如果中位数大于等于目标值，则说明搜索区间在左边
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
