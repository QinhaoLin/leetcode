package easy.t14;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-16 11:09
 */
public class Main {
    public static void main(String[] args) {
        String[] test = {"aacc", "aaa", "aaaba"};
        System.out.println("new Main().longestCommonPrefix() = " + new Main().longestCommonPrefix(test));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int n = finCommonPrefixPos(strs[0], strs[1]);
        for (int i = 2; i < strs.length; i++) {
            int pos = finCommonPrefixPos(strs[i - 1], strs[i]);
            if (pos == 0) {
                return "";
            } else {
                n = Math.min(n, pos);
            }
        }
        return strs[0].substring(0, n);
    }

    /**
     * 查找两个字符串的公共前缀最长长度
     *
     * @param a
     * @param b
     * @return
     */
    public int finCommonPrefixPos(String a, String b) {
        int pos = 0;
        if (a == null || b == null) {
            return pos;
        }
        int aLength = a.length();
        int bLength = b.length();
        int count = 0;
        int n = aLength;
        if (aLength > bLength) {
            n = bLength;
        }
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                count++;
            } else {
                break;
            }
        }
        pos = count;
        return pos;
    }
}
