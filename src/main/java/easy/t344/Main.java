package easy.t344;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-06 09:07
 */
public class Main {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        new Main().reverseString(s);
        System.out.println("new Main().reverseString(); = " + Arrays.toString(s));
    }

    public void reverseString(char[] s) {
        if (s == null || s.length < 1) {
            return;
        }
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
            j--;
        }
    }
}
