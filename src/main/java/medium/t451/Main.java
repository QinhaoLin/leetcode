package medium.t451;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-19 20:11
 */
public class Main {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println("new Main().frequencySort() = " + new Main().frequencySort(s));
    }

    public String frequencySort(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        int[] freq = new int[256];
        char[] arr = s.toCharArray();
        // 记录每个字母出现的次数
        for (char c : arr) {
            freq[c]++;
        }

        HashMap<Integer, String> map = new HashMap<>(256);
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) {
                continue;
            }
            char c = (char) i;
            String str = map.get(freq[i]);
            // 不同字符，出现次数相同，进行拼接
            if (str != null) {
                map.put(freq[i], str.concat(build(c, freq[i])));
            } else {
                map.put(freq[i], build(c, freq[i]));
            }
        }
        Integer[] keys = map.keySet().toArray(new Integer[]{});
        Arrays.sort(keys);
        StringBuilder sb = new StringBuilder();
        for (int i = keys.length - 1; i >= 0; i--) {
            sb.append(map.get(keys[i]));
        }
        return sb.toString();
    }

    /**
     * 拼接字符串
     *
     * @param ch    字符串
     * @param count 字符串出现次数
     * @return
     */
    private String build(char ch, int count) {
        String str = Character.toString(ch);
        StringBuilder res = new StringBuilder(str);
        int i = 1;
        while (i < count) {
            res.append(str);
            i++;
        }
        return res.toString();
    }
}
