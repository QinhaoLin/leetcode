package easy.t796_;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-22 09:16
 */
public class Main {
    public static void main(String[] args) {
        // "kifcqeiqoh"
        // "ayyrddojpq"

        // "bbbacddceeb"
        // "ceebbbbacdd"
        String A = "bbbacddceeb";
        String B = "ceebbbbacdd";
        System.out.println("new Main().rotateString() = " + new Main().rotateString(A, B));
    }

    public boolean rotateString(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        if (A.equals(B)) {
            return true;
        }
        int move = 0;
        int strLen = B.length();
        boolean res = false;
        for (int i = 0; i < strLen; i++) {
            //在 B 中查找 A 的首字母
            if (B.charAt(i) != A.charAt(0)) {
                continue;
            }
            //计算字符串 B 的偏移量
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
