package hard.t42;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-24 10:04
 */
public class Main {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("new Main().trap() = " + new Main().trap3(height));
    }

    /**
     * dp
     * 1. 首先用两个数组，max_left [i] 代表第 i 列左边最高的墙的高度，max_right[i] 代表第 i 列右边最高的墙的高度。
     * 2. 获取到相对每列的左右两边的最大高度后，再遍历一遍，获取相对于当前列的左右最高墙的最低高度，
     * 如果当前列高度低于此墙的高度，则用次墙的高度减去当前列高度就是当前列的结果值。
     *
     * @param height
     * @return
     */
    public int trap(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int sum = 0;
        // 相对于当前列左边最高的墙
        int[] max_left = new int[height.length];
        // 相对于当前列右边自高的墙
        int[] max_right = new int[height.length];

        for (int i = 1; i < height.length - 1; i++) {
            max_left[i] = Math.max(max_left[i - 1], height[i - 1]);
        }
        for (int i = height.length - 2; i >= 0; i--) {
            max_right[i] = Math.max(max_right[i + 1], height[i + 1]);
        }
        for (int i = 1; i < height.length - 1; i++) {
            int min = Math.min(max_left[i], max_right[i]);
            if (min > height[i]) {
                sum = sum + (min - height[i]);
            }
        }
        return sum;
    }

    /**
     * dp-优化，去除 max_left 数组
     * 不能同时把 max_right 的数组去掉，因为最后的 for 循环是从左到右遍历的，而 max_right 的更新是从右向左的。
     *
     * @param height
     * @return
     */
    public int trap2(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int sum = 0;
        // 相对于当前列左边最高的墙
        int max_left = 0;
        // 相对于当前列右边自高的墙
        int[] max_right = new int[height.length];

        for (int i = height.length - 2; i >= 0; i--) {
            max_right[i] = Math.max(max_right[i + 1], height[i + 1]);
        }

        for (int i = 1; i < height.length - 1; i++) {
            // 往右遍历的过程，记录左边的最大高度
            max_left = Math.max(max_left, height[i - 1]);
            int min = Math.min(max_left, max_right[i]);
            if (min > height[i]) {
                sum = sum + (min - height[i]);
            }
        }
        return sum;
    }

    /**
     * 双指针
     * 同时将 max_left、max_right 数组去掉，用两个指针，left 和 right，从两个方向去遍历。
     * max_left = Math.max(max_left, height[i - 1]);
     * height [ left - 1] 是可能成为 max_left 的变量，
     * 同理，height [ right + 1 ] 是可能成为 right_max 的变量。
     * <p>
     * 只要保证 height [ left - 1 ] < height [ right + 1 ] ，那么 max_left 就一定小于 max_right。
     * 因为 max_left 是由 height [ left - 1] 更新过来的，而 height [ left - 1 ] 是小于 height [ right + 1] 的，
     * 而 height [ right + 1 ] 会更新 max_right，所以间接的得出 max_left 一定小于 max_right。
     * 反之，我们就从右到左更。
     *
     * @param height
     * @return
     */
    public int trap3(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int sum = 0;
        int max_left = 0;
        int max_right = 0;
        // 左指针
        int left = 0 + 1;
        // 右指针
        int right = height.length - 1 - 1;
        while (left <= right) {
            // 从左到右更
            if (height[left - 1] < height[right + 1]) {
                max_left = Math.max(max_left, height[left - 1]);
                int min = max_left;
                if (min > height[left]) {
                    sum = sum + (min - height[left]);
                }
                left++;
            } else { // 从右到左更
                max_right = Math.max(max_right, height[right + 1]);
                int min = max_right;
                if (min > height[right]) {
                    sum = sum + (min - height[right]);
                }
                right--;
            }
        }
        return sum;
    }
}
