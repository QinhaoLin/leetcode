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
        // ��ǰ��
        int row = 0;
        // �������
        int maxRow = matrix.length;
        // ��ǰ��
        int col = 0;
        // �������
        int maxCol = matrix[0].length;
        // �������ĵ�ǰ����
        int idx = 0;
        // �������
        int maxIdx = maxRow * maxCol;
        List<Integer> res = new ArrayList<>(maxIdx);
        while (row <= maxRow && col <= maxCol) {
            // ����
            for (int i = col; i < maxCol; i++) {
                res.add(matrix[row][i]);
                idx++;
                if (idx == maxIdx) {
                    return res;
                }
            }

            // ����
            for (int i = row + 1; i < maxRow; i++) {
                res.add(matrix[i][maxCol - 1]);
                idx++;
                if (idx == maxIdx) {
                    return res;
                }
            }

            // ����
            // (maxCol - 1) - 1�����Ҳ�����һ��ѭ������
            for (int i = (maxCol - 1) - 1; i > col; i--) {
                res.add(matrix[maxRow - 1][i]);
                idx++;
                if (idx == maxIdx) {
                    return res;
                }
            }

            // ����
            for (int i = maxRow - 1; i > row; i--) {
                res.add(matrix[i][col]);
                idx++;
                if (idx == maxIdx) {
                    return res;
                }
            }
            // ת��һȦ�ˣ��ѵ�ǰ��������������1
            row++;
            col++;
            // �����������������1
            maxRow--;
            maxCol--;
        }
        return res;
    }
}
