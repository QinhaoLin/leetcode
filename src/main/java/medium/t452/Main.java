package medium.t452;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-12 12:22
 */
public class Main {
    public static void main(String[] args) {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println("new Main().findMinArrowShots() = " + new Main().findMinArrowShots(points));
    }

    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        // 让区间按 end 端 value 升序排列
        // 按数组中第2个值大小升序排序
        Arrays.sort(points, (o1, o2) -> o1[1] - o2[1]);
        int cnt = 1;
        // 每次射箭保证最少射中一个
        // 由于气球直径的末端已经从小到大排序，只要保证每次往气球直径的末端射出即可
        int end = points[0][1];
        for (int i = 0; i < points.length; i++) {
            // 如果气球直径的开始位置小于等于箭射出的结束位置
            // 则说明可以将此气球射破，箭数不需要+1
            if (points[i][0] <= end) {
                continue;
            }
            cnt++;
            end = points[i][1];
        }
        return cnt;
    }
}
