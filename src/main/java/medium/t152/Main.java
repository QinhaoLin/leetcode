package medium.t152;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-04 10:10
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("new Main().maxProduct() = " + new Main().maxProduct(nums));
    }


    public int maxProduct(int[] nums) {
        // 一个保存最大的，一个保存最小的。
        int max = Integer.MIN_VALUE;
        int iMax = 1;
        int iMin = 1;
        for (int i = 0; i < nums.length; i++) {
            // 如果数组的数是负数，那么会导致最大的变最小的，最小的变最大的。因此交换两个的值。
            if (nums[i] < 0) {
                int tmp = iMax;
                iMax = iMin;
                iMin = tmp;
            }
            iMax = Math.max(iMax * nums[i], nums[i]);
            iMin = Math.min(iMin * nums[i], nums[i]);

            max = Math.max(max, iMax);
        }
        return max;
    }
}
