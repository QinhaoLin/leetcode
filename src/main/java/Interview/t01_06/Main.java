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
            // ��� i �� i-1 ��ͬ��cnt �ۼ�
            if (S.charAt(i) == S.charAt(i - 1)) {
                cnt++;
            } else {
                // ����ƴ����i-1�Ĵ�������i��ʼ���¼���
                sb.append(cnt).append(chars[i]);
                cnt = 1;
            }
        }
        return sb.append(cnt).length() < S.length() ? sb.toString() : S;
    }
}
