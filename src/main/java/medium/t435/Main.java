package medium.t435;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-07 16:29
 */
public class Main {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println("new Main().eraseOverlapIntervals() = " + new Main().eraseOverlapIntervals(intervals));
    }

    /**
     * 计算让一组区间不重叠所需要移除的区间个数。
     * 1、先计算最多能组成的不重叠区间个数，然后用区间总个数减去不重叠区间的个数。
     * 2、在每次选择中，区间的结尾最为重要，选择的区间结尾越小，留给后面的区间的空间越大，那么后面能够选择的区间个数也就越大。
     * 3、按区间的结尾进行排序，每次选择结尾最小，并且和前一个区间不重叠的区间。
     *
     * @param intervals
     * @return
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        // 让区间按 end 端 value 升序排列
        // 按数组中第2个值大小升序排序
        Arrays.sort(intervals, (o1, o2) -> o1[1] - o2[1]);
        int cnt = 1;
        // end 越靠前，留给后面区间的空间越多
        int end = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            // 遍历 intervals 中每个数组的开始值是否小于结束值
            // satrt = intervals[i][0]
            // 如果满足 start 大于等于 end，则满足数+1，end 重新赋值
            if (intervals[i][0] < end) {
                continue;
            }
            end = intervals[i][1];
            cnt++;
        }
        return intervals.length - cnt;
    }
}
