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
     * 分配饼干
     * 贪心算法
     * 1、给一个孩子的饼干应当尽量小并且又能满足该孩子，这样大饼干才能拿来给满足度比较大的孩子。
     * 2、因为满足度最小的孩子最容易得到满足，所以先满足满足度最小的孩子。
     *
     * @param grid 满足度
     * @param size 饼干大小
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
                // 孩子胃口小于等于饼干数时，满足孩子数加1
                gi++;
            }
            // 饼干数是一直加的
            si++;
        }
        return gi;
    }
}
