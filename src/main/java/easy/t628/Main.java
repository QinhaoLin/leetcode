package easy.t628;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-21 11:15
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("new Main().maximumProduct() = " + new Main().maximumProduct(nums));
    }

    public int maximumProduct(int[] nums) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int cur : nums) {
            if (cur <= min1) {
                min2 = min1;
                min1 = cur;
            } else if (cur <= min2) {
                min2 = cur;
            }

            if (cur >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = cur;
            } else if (cur >= max2) {
                max3 = max2;
                max2 = cur;
            } else if (cur >= max3) {
                max3 = cur;
            }
        }
        return Math.max(max1 * max2 * max3, max1 * min1 * min2);
    }
}
