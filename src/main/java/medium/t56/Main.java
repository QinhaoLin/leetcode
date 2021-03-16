package medium.t56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-03-16 16:16
 */
public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merge = new Main().merge(arr);
        for (int[] ints : merge) {
            System.out.println("new Main().merge(arr) = " + Arrays.toString(ints));
        }
    }

    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        /*Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });*/
        int i = 0;
        int j = intervals.length;
        while (i < j) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            while (i < j - 1 && right >= intervals[i + 1][0]) {
                right = Math.max(right, intervals[i + 1][1]);
                i++;
            }
            list.add(new int[]{left, right});
            i++;
        }
        return list.toArray(new int[list.size()][2]);
    }
}
