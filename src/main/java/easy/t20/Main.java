package easy.t20;

import java.util.Stack;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-16 13:39
 */
public class Main {
    public static void main(String[] args) {
        String test = "([)]";
        // String test = "{[]}";
        System.out.println("new Main().isValid() = " + new Main().isValid(test));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
