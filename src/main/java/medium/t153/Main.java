package medium.t153;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-15 11:17
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 4, 1, 2, 3};
        System.out.println("new Main().findMin(nums) = " + new Main().findMin(nums));
    }

    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            // 中位数小于等于右区间结束值，说明旋转排序数组中的最小值在左区间
            if (nums[mid] <= nums[end]) {
                // mid = 1; [8, 9, 0, 1], 2, 3, 4
                end = mid;
            } else {
                // mid = 7; 4, 5, 6, 7, [8, 2, 3]
                start = mid + 1;
            }
        }
        return nums[start];
    }
}
