package medium.t524;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "abpcplea";
        List<String> d = new ArrayList<String>();
        d.add("ale");
        d.add("apple");
        d.add("monkey");
        d.add("plea");
        System.out.println("new Main().findLongestWord() = " + new Main().findLongestWord(s, d));
    }

    public String findLongestWord(String s, List<String> d) {
        String longestWord = "";
        for (String target : d) {
            int l1 = longestWord.length();
            int l2 = target.length();
            // 最长字符串长度大于当前字符串长度，或者最长字符串已经包含当前字符串
            // 不能直接 longestWord.equals(target)，题目要求“如果有多个相同长度的结果，返回字典序的最小字符串。”
            // compareTo()，长度相同,从第一位开始比较，如果相同返回0，如果不同则马上返回这两个字符的 ascii 值的差值。
            if (l1 > l2 || (l1 == l2 && longestWord.compareTo(target) < 0)) {
                continue;
            }
            if (isSubstr(s, target)) {
                longestWord = target;
            }
        }
        return longestWord;
    }

    private boolean isSubstr(String s, String target) {
        int iIdx = 0, targetIdx = 0;
        // 遍历字符串 s 的每一位与字符串 target 的每一位比较
        // 如果 target 每一位中有不一样的，则跳过，与 s 字符串的下一位比较
        // 遍历后如果 target 的所有字符都包含在 s 中，则返回 true
        while (iIdx < s.length() && targetIdx < target.length()) {
            if (s.charAt(iIdx) == target.charAt(targetIdx)) {
                targetIdx++;
            }
            iIdx++;
        }
        return targetIdx == target.length();
    }
}
