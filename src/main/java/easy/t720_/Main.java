package easy.t720_;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-21 14:12
 */
public class Main {

    public static void main(String[] args) {
        // 输入:
        // words = ["w","wo","wor","worl", "world"]
        // 输出: "world"
        // 解释:
        // 单词"world"可由"w", "wo", "wor", 和 "worl"添加一个字母组成。
        String[] words = {"a", "worl", "wo", "world", "wor"};
        System.out.println("new Main().longestWord(words) = " + new Main().longestWord(words));
    }

    /**
     * 给出一个字符串数组words组成的一本英语词典。从中找出最长的一个单词，该单词是由words词典中其他单词逐步添加一个字母组成。
     * 若其中有多个可行的答案，则返回答案中字典序最小的单词。
     * <p>
     * 若无答案，则返回空字符串。
     *
     * @param words
     * @return
     */
    public String longestWord(String[] words) {
        // 对数组排序，再利用 Set 对字母存储，小的单词一定包含在后面大的单词里面。后面只需要取前缀相同的
        // 对字母排序后，第一个单词一定是共有的，后面只需在此基础上添加
        Arrays.sort(words);
        System.out.println("words = " + Arrays.toString(words));
        Set<String> set = new HashSet<>();
        String res = "";
        for (String s : words) {
            // 如果单词只有一个字母，那一定是共有的
            if (s.length() == 1 || set.contains(s.substring(0, s.length() - 1))) {
                res = s.length() > res.length() ? s : res;
                System.out.println("s = " + s);
                set.add(s);
            }
        }
        return res;
    }
}
