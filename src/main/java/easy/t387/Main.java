package easy.t387;

import java.util.HashMap;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-19 18:25
 */
public class Main {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println("new Main().firstUniqChar() = " + new Main().firstUniqChar(s));
    }

    public int firstUniqChar(String s) {
        if (s == null) {
            return -1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        int size = chars.length;
        for (int i = 0; i < size; i++) {
            if (map.containsKey(chars[i])) {
                map.put(chars[i], Math.addExact(map.getOrDefault(chars[i], 0), 1));
            } else {
                map.put(chars[i], 1);
            }
        }
        for (int i = 0; i < size; i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
