package medium.t5;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-03-17 09:35
 */
public class Main {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println("new Main().longestPalindrome(s) = " + new Main().longestPalindrome1(s));
    }

    /**
     * 方法一：暴力匹配 （Brute Force）
     * 根据回文子串的定义，枚举所有长度大于等于 22 的子串，依次判断它们是否是回文；
     * 在具体实现时，可以只针对大于“当前得到的最长回文子串长度”的子串进行“回文验证”；
     * 在记录最长回文子串的时候，可以只记录“当前子串的起始位置”和“子串长度”，不必做截取。这一步我们放在后面的方法中实现。
     *
     * @param s
     * @return
     */
    public String longestPalindrome1(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        int len = s.length();
        int maxLen = 1;
        int begin = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (j - i + 1 > maxLen && validPalindromic(charArray, i, j)) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    /**
     * 验证子串 s[left..right] 是否为回文串
     */
    private boolean validPalindromic(char[] charArray, int left, int right) {
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
