package easy.t290;

import java.util.HashMap;
import java.util.Map;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-12-07 11:47
 */
public class Main {
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println("new Main().wordPattern(pattern, str) = " + new Main().wordPattern(pattern, str));
    }

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map<Object, Integer> map = new HashMap<>();
        for (Integer i = 0; i < words.length; i++) {
            Integer put1 = map.put(pattern.charAt(i), i);
            Integer put2 = map.put(words[i], i);
            if (put1 != put2) {
                return false;
            }
        }
        return true;
    }
}
