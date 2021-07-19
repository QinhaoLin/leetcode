package medium.t162;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-07-19 16:51
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1, 3, 5, 6, 4};
        System.out.println("new Main().findPeakElement(nums) = " + new Main().findPeakElement(nums));
    }

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                // 说明右侧可能存在峰值；
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

}
