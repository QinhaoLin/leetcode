package Interview.t01_06;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-06 09:51
 */
public class Main {
    public static void main(String[] args) {
        String s = "aabcccccaaa";
        System.out.println("new Main().compressString() = " + new Main().compressString(s));

    }

    public String compressString(String S) {
        if (S == null || S.length() < 1) {
            return S;
        }
        char[] chars = S.toCharArray();
        StringBuilder sb = new StringBuilder().append(chars[0]);
        int cnt = 1;
        for (int i = 1; i < S.length(); i++) {
            // 如果 i 与 i-1 相同，cnt 累加
            if (S.charAt(i) == S.charAt(i - 1)) {
                cnt++;
            } else {
                // 否则拼接上i-1的次数，从i开始重新计数
                sb.append(cnt).append(chars[i]);
                cnt = 1;
            }
        }
        return sb.append(cnt).length() < S.length() ? sb.toString() : S;
    }
}
