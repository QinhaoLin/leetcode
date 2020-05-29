package Interview.t10_01;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-29 14:38
 */
public class Main {
    public static void main(String[] args) {
        int[] A = {1, 8, 10, 0, 0, 0};
        int[] B = {2, 5, 6};
        int m = 3;
        int n = 3;
        new Main().merge(A, m, B, n);
        System.out.println("new Main().merge(); = " + Arrays.toString(A));
    }

    public void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1;
        int j = n - 1;
        int idx = m + n - 1;
        while (j >= 0) {
            if (i < 0 || B[j] >= A[i]) {
                A[idx--] = B[j--];
            } else {
                A[idx--] = A[i--];
            }
        }
    }
}
