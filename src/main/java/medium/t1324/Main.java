package medium.t1324;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "CONTEST IS COMING";
        System.out.println("new Main().printVertically() = " + new Main().printVertically(s));
    }


    public List<String> printVertically(String s) {
        if (s == null || "".equals(s.trim())) {
            return Collections.emptyList();
        }
        String[] works = s.split(" ");
        int maxL = works[0].length();
        for (int i = 1; i < works.length; i++) {
            maxL = Math.max(maxL, works[i].length());
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < maxL; i++) {
            StringBuilder sb = new StringBuilder();
            for (String w : works) {
                sb.append(w.length() > i ? w.charAt(i) : " ");
            }
            res.add(trim(sb.toString()));
        }
        return res;
    }

    private String trim(String s) {
        int i = s.length() - 1;
        char[] chars = s.toCharArray();
        while (chars[i] == ' ') {
            i--;
        }
        return String.valueOf(chars, 0, i + 1);
    }
}
