package medium.t54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-05 10:34
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("new Main().spiralOrder(matrix) = " + new Main().spiralOrder(matrix).toString());
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length < 1) {
            return Collections.emptyList();
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
        List<Integer> res = new ArrayList<>(maxIdx);
        while (row <= maxRow && col <= maxCol) {
            // 向右
            for (int i = col; i < maxCol; i++) {
                res.add(matrix[row][i]);
                idx++;
                if (idx == maxIdx) {
                    return res;
                }
            }

            // 向下
            for (int i = row + 1; i < maxRow; i++) {
                res.add(matrix[i][maxCol - 1]);
                idx++;
                if (idx == maxIdx) {
                    return res;
                }
            }

            // 向左
            // (maxCol - 1) - 1，最右侧由下一个循环遍历
            for (int i = (maxCol - 1) - 1; i > col; i--) {
                res.add(matrix[maxRow - 1][i]);
                idx++;
                if (idx == maxIdx) {
                    return res;
                }
            }

            // 向上
            for (int i = maxRow - 1; i > row; i--) {
                res.add(matrix[i][col]);
                idx++;
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
