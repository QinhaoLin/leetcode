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
        int[] res = new int[maxIdx];
        while (row <= maxRow && col <= maxCol) {
            // ����
            for (int i = col; i < maxCol; i++) {
                res[idx++] = matrix[row][i];
                if (idx == maxIdx) {
                    return res;
                }
            }

            // ����
            for (int i = row + 1; i < maxRow; i++) {
                res[idx++] = matrix[i][maxCol - 1];
                if (idx == maxIdx) {
                    return res;
                }
            }

            // ����
            // (maxCol - 1) - 1�����Ҳ�����һ��ѭ������
            for (int i = (maxCol - 1) - 1; i > col; i--) {
                res[idx++] = matrix[maxRow - 1][i];
                if (idx == maxIdx) {
                    return res;
                }
            }

            // ����
            for (int i = maxRow - 1; i > row; i--) {
                res[idx++] = matrix[i][col];
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
