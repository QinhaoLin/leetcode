package Interview.t04;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-06 16:19
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;
        System.out.println("new Main().findNumberIn2DArray(matrix, target) = " + new Main().findNumberIn2DArray(matrix, target));
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        // 行的索引
        int row = matrix.length - 1;
        // 列的索引
        int col = 0;
        // 从左下角往右上角扫描
        while (row >= 0 && col < matrix[row].length) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                col++;
            } else {
                row--;
            }
        }
        return false;
    }
}
