package medium.t240;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-18 19:49
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        int target = 17;
        System.out.println("new Main().searchMatrix(matrix, target) = " + new Main().searchMatrix(matrix, target));
    }

    /**
     * �����½ǿ�ʼ����
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length - 1;// �е�����
        int col = 0;// �е�����
        while (row >= 0 && col < matrix[row].length) {
            System.out.println("matrix[row][col] = " + matrix[row][col]);
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                // ��ָ��λ�õ����ִ���Ŀ��ֵʱ������ɨ��
                row--;
            } else {
                // ��ָ��λ�õ�����С��Ŀ��ֵʱ������ɨ��
                col++;
            }
        }
        return false;
    }
}
