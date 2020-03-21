package easy.t771;

import java.util.HashSet;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-21 13:51
 */
public class Main {
    public static void main(String[] args) {
        //  ‰»Î: J = "aA", S = "aAAbbbb"
        //  ‰≥ˆ: 3
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println("new Main().numJewelsInStones(J, S) = " + new Main().numJewelsInStones(J, S));
    }

    public int numJewelsInStones(String J, String S) {
        if (J == null || S == null) {
            return 0;
        }
        HashSet<Character> map = new HashSet<>(J.length());
        for (char c : J.toCharArray()) {
            map.add(c);
        }
        int count = 0;
        for (char c : S.toCharArray()) {
            if (map.contains(c)) {
                count++;
            }
        }
        return count;
    }
}
