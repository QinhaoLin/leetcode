package easy.t1047;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-03-09 10:43
 */
public class Main {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println("new Main().removeDuplicates(s) = " + new Main().removeDuplicates(s));
    }

    /**
     * 思路：维护一个栈，入栈时判断入栈元素与栈顶元素是否相同，相同则移除当前栈顶
     *
     * @param S
     * @return
     */
    public String removeDuplicates(String S) {
        if (S == null || S.length() < 2) {
            return S;
        }
        StringBuilder stack = new StringBuilder();
        int top = -1;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (top >= 0 && stack.charAt(top) == ch) {
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
