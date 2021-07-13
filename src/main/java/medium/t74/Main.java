package medium.t74;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-07-13 15:05
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 13;
        System.out.println("new Main().searchMatrix(matrix, target) = " + new Main().searchMatrix(matrix, target));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int[] ints = matrix[mid];
            /**********************************/
            int left2 = 0;
            int right2 = ints.length - 1;
            while (left2 <= right2) {
                int mid2 = left2 + (right2 - left2) / 2;
                if (ints[mid2] == target) {
                    return true;
                } else if (ints[mid2] > target) {
                    // 1 2 3
                    right2 = mid2 - 1;
                } else if (ints[mid2] < target) {
                    left2 = mid2 + 1;
                }
            }
            /**********************************/
            if (left2 == 0) {// 当前数组大于 target
                right = mid - 1;
            } else if (right2 == ints.length - 1) {// 当前数组小于 target
                left = mid + 1;
            } else {
                return false;
            }
        }
        return false;
    }
}
