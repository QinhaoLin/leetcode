package medium.t151;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-26 23:01
 */
public class Main {
    public static void main(String[] args) {
        String s = "    hello      world!    ";
        System.out.println("new Main().reverseWords() = " + new Main().reverseWords(s));
    }

    public String reverseWords(String s) {
        if (s == null || s.length() < 1) {
            return s;
        }
        // 正则匹配连续的空白字符作为分隔符分割
        List<String> wordList = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }

    public String reverseWords2(String s) {
        if (s == null) {
            return new String();
        }
        if (s.length() < 1) {
            return "";
        }
        String[] strs = s.trim().split("\\s+");
        StringBuilder builder = new StringBuilder();
        for (int i = strs.length - 1; i > 0; i--) {
            builder.append(strs[i]).append(" ");
        }
        builder.append(strs[0]);
        return builder.toString();
    }
}
