package easy.t1544;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-03-19 11:37
 */
public class Main {
    public static void main(String[] args) {
        String s = "Pp";
        System.out.println("new Main().makeGood(s) = " + new Main().makeGood(s));
    }

    public String makeGood(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        StringBuilder stack = new StringBuilder();
        // Ä£ÄâÕ»
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (top >= 0 && ((stack.charAt(top) == ch + 32) || (stack.charAt(top) == ch - 32))) {
                stack.deleteCharAt(top);
                top--;
            } else {
                stack.append(ch);
                top++;
            }
        }
        return stack.toString();
    }
}
