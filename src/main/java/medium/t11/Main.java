package medium.t11;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-30 14:23
 */
public class Main {

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("new Main().maxArea() = " + new Main().maxArea(height));
    }

    public int maxArea(int[] height) {
        // 左指针
        int left = 0;
        // 右指针
        int right = height.length - 1;
        // 返回结果
        int res = 0;
        while (left < right) {
            // 盛水量 = （右指针-左指针） *  最低高度
            // 每次遍历取最优结果，移动索引值小的指针
            if (height[left] < height[right]) {
                // 左指针往前移动
                res = Math.max(res, (right - left) * height[left++]);
            } else {
                // 右指针往后移动
                res = Math.max(res, (right - left) * height[right--]);
            }
        }
        return res;
    }
}

