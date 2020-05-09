package easy.t409;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-09 13:41
 */
public class Main {
    public static void main(String[] args) {
        String s = "zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez";
        System.out.println("new Main().longestPalindrome() = " + new Main().longestPalindrome(s));

    }

    public int longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        int[] temp = new int['z' - 'A' + 1];

        for (int i = 0; i < s.length(); i++) {
            temp[s.charAt(i) - 'A'] += 1;
        }

        int cout = 0;
        for (int i : temp) {
            if (i / 2 > 0) {
                cout += (i / 2) * 2;
            }
        }
        return cout < s.length() ? cout + 1 : cout;
    }
}
