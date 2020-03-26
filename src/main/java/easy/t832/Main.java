package easy.t832;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-25 19:40
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 输入: [[1,1,0],[1,0,1],[0,0,0]]
         * 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
         * 然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
         * 输出: [[1,0,0],[0,1,0],[1,1,1]]
         */
        int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.print("A = ");
        for (int[] ints : A) {
            System.out.print(" " + Arrays.toString(ints));
        }
        System.out.println();
        System.out.print("new Main().flipAndInvertImage() = ");
        int[][] res = new Main().flipAndInvertImage(A);
        for (int[] ints : res) {
            System.out.print(" " + Arrays.toString(ints));
        }
        System.out.println();
    }


    public int[][] flipAndInvertImage(int[][] A) {
        int[][] res = new int[A.length][];
        for (int i = 0; i < A.length; i++) {
            res[i] = new int[A[i].length];
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][A[i].length - j - 1] == 0) {
                    res[i][j] = 1;
                }
            }
        }
        return res;
    }
}

