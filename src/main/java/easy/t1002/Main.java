package easy.t1002;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: linqinhao
 * @CreateTime: 2022-11-14  10:38
 * @Description: TODO
 */
public class Main {
    public static void main(String[] args) {
        String[] words = new String[]{"bella", "label", "roller"};
        List<String> list = commonChars(words);
        System.out.println("list = " + list);
    }

    public static List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        int[] res = new int[26];
        for (char c : words[0].toCharArray()) {
            res[c - 'a']++;
        }
        for (int i = 1; i < words.length; i++) {
            int[] temp = new int[26];
            for (char c : words[i].toCharArray()) {
                temp[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                res[j] = Math.min(res[j], temp[j]);
            }
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] > 0) {
                for (int j = 0; j < res[i]; j++) {
                    list.add(((char) ('a' + i) + ""));
                }
            }
        }
        return list;
    }
}
