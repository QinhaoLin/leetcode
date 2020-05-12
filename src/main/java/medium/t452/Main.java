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
        // �����䰴 end �� value ��������
        // �������е�2��ֵ��С��������
        Arrays.sort(points, (o1, o2) -> o1[1] - o2[1]);
        int cnt = 1;
        // ÿ�������֤��������һ��
        // ��������ֱ����ĩ���Ѿ���С��������ֻҪ��֤ÿ��������ֱ����ĩ���������
        int end = points[0][1];
        for (int i = 0; i < points.length; i++) {
            // �������ֱ���Ŀ�ʼλ��С�ڵ��ڼ�����Ľ���λ��
            // ��˵�����Խ����������ƣ���������Ҫ+1
            if (points[i][0] <= end) {
                continue;
            }
            cnt++;
            end = points[i][1];
        }
        return cnt;
    }
}
