package easy.t66;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-03-04 18:10
 */
public class Main {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        System.out.println("new Main().plusOne(digits) = " + Arrays.toString(new Main().plusOne(digits)));
    }

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i] = digits[i] + 1;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}
