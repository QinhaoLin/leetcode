package easy.t58;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-29 21:31
 */
public class Main {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println("new Main().lengthOfLastWord() = " + new Main().lengthOfLastWord(s));
    }

    public int lengthOfLastWord(String s) {
        if (s == null || s.trim().length() == 0) {
            return 0;
        }
        int length = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else {
                return length;
            }
        }
        return length;
    }
}
