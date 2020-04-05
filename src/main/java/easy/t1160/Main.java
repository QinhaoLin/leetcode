package easy.t1160;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-05 21:52
 */
public class Main {
    public static void main(String[] args) {
        String[] words = {"hello", "world", "leetcode"};
        String chars = "welldonehoneyr";
        System.out.println("new Main().countCharacters() = " + new Main().countCharacters(words, chars));
    }

    public int countCharacters(String[] words, String chars) {
        int[] hash = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            hash[chars.charAt(i) - 'a']++;
        }
        int res = 0;
        int[] map = new int[26];
        for (String s : words) {
            boolean flag = true;
            Arrays.fill(map, 0);
            for (int i = 0; i < s.length(); i++) {
                map[s.charAt(i) - 'a']++;
                if (map[s.charAt(i) - 'a'] > hash[s.charAt(i) - 'a']) flag = false;
            }
            if (flag) res += s.length();
        }
        return res;
    }
}
