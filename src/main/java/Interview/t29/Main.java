package Interview.t29;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-05 09:13
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{3, 2, 1}};
        System.out.println("new Main().spiralOrder(matrix) = " + Arrays.toString(new Main().spiralOrder(matrix)));
    }

    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length < 1) {
            return new int[]{};
        }
        // 当前行
        int row = 0;
        // 最大行数
        int maxRow = matrix.length;
        // 当前列
        int col = 0;
        // 最大列数
        int maxCol = matrix[0].length;
        // 结果数组的当前索引
        int idx = 0;
        // 最大索引
        int maxIdx = maxRow * maxCol;
        int[] res = new int[maxIdx];
        while (row <= maxRow && col <= maxCol) {
            // 向右
            for (int i = col; i < maxCol; i++) {
                res[idx++] = matrix[row][i];
                if (idx == maxIdx) {
                    return res;
                }
            }

            // 向下
            for (int i = row + 1; i < maxRow; i++) {
                res[idx++] = matrix[i][maxCol - 1];
                if (idx == maxIdx) {
                    return res;
                }
            }

            // 向左
            // (maxCol - 1) - 1，最右侧由下一个循环遍历
            for (int i = (maxCol - 1) - 1; i > col; i--) {
                res[idx++] = matrix[maxRow - 1][i];
                if (idx == maxIdx) {
                    return res;
                }
            }

            // 向上
            for (int i = maxRow - 1; i > row; i--) {
                res[idx++] = matrix[i][col];
                if (idx == maxIdx) {
                    return res;
                }
            }
            // 转完一圈了，把当前行数，列数都加1
            row++;
            col++;
            // 最大行数，列数都减1
            maxRow--;
            maxCol--;
        }
        return res;
    }
}
