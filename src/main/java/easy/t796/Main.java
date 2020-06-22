package easy.t796;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-22 09:16
 */
public class Main {
    public static void main(String[] args) {
        // "kifcqeiqoh"
        // "ayyrddojpq"
        String A = "abcde";
        String B = "cdeab";
        System.out.println("new Main().rotateString() = " + new Main().rotateString(A, B));
    }

    public boolean rotateString(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        int move = 0;
        int strLen = B.length();
        boolean res = false;
        for (int i = 0; i < strLen; i++) {
            //�� B �в��� A ������ĸ
            if (B.charAt(i) != A.charAt(0)) {
                continue;
            }
            //�����ַ��� B ��ƫ����
            move = i;
            for (int j = 0; j < strLen; j++) {
                if (A.charAt(j) != B.charAt((j + move) % strLen)) {
                    return false;
                }
            }
            res = true;
        }
        return res;
    }
}
