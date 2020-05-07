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
     * ������һ�����䲻�ص�����Ҫ�Ƴ������������
     * 1���ȼ����������ɵĲ��ص����������Ȼ���������ܸ�����ȥ���ص�����ĸ�����
     * 2����ÿ��ѡ���У�����Ľ�β��Ϊ��Ҫ��ѡ��������βԽС���������������Ŀռ�Խ����ô�����ܹ�ѡ����������Ҳ��Խ��
     * 3��������Ľ�β��������ÿ��ѡ���β��С�����Һ�ǰһ�����䲻�ص������䡣
     *
     * @param intervals
     * @return
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        // �����䰴 end �� value ��������
        // �������е�2��ֵ��С��������
        Arrays.sort(intervals, (o1, o2) -> o1[1] - o2[1]);
        int cnt = 1;
        // end Խ��ǰ��������������Ŀռ�Խ��
        int end = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            // ���� intervals ��ÿ������Ŀ�ʼֵ�Ƿ�С�ڽ���ֵ
            // satrt = intervals[i][0]
            // ������� start ���ڵ��� end����������+1��end ���¸�ֵ
            if (intervals[i][0] < end) {
                continue;
            }
            end = intervals[i][1];
            cnt++;
        }
        return intervals.length - cnt;
    }
}
