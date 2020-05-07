package easy.t455;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-07 16:07
 */
public class Main {
    public static void main(String[] args) {
        int[] grid = {1, 4, 3};
        int[] size = {1, 2};
        System.out.println("new Main().findContentChildren() = " + new Main().findContentChildren(grid, size));
    }

    /**
     * �������
     * ̰���㷨
     * 1����һ�����ӵı���Ӧ������С������������ú��ӣ���������ɲ�������������ȱȽϴ�ĺ��ӡ�
     * 2����Ϊ�������С�ĺ��������׵õ����㣬�����������������С�ĺ��ӡ�
     *
     * @param grid �����
     * @param size ���ɴ�С
     * @return
     */
    public int findContentChildren(int[] grid, int[] size) {
        if (grid == null || size == null) return 0;
        Arrays.sort(grid);
        Arrays.sort(size);
        int gi = 0;
        int si = 0;
        while (gi < grid.length && si < size.length) {
            if (grid[gi] <= size[si]) {
                // ����θ��С�ڵ��ڱ�����ʱ�����㺢������1
                gi++;
            }
            // ��������һֱ�ӵ�
            si++;
        }
        return gi;
    }
}
