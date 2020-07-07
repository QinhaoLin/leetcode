package easy.t905;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-07-07 17:31
 */
public class Main {
    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4};
        System.out.println("new Main().sortArrayByParity() = " + Arrays.toString(new Main().sortArrayByParity(A)));

    }

    public int[] sortArrayByParity(int[] A) {
        int l = 0;
        int r = A.length - 1;
        while (l < r) {
            if (A[l] % 2 == 1 && A[r] % 2 == 0) {
                swap(A, l++, r--);
            } else if (A[l] % 2 == 0) {
                l++;
            } else {
                r--;
            }
        }
        return A;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
