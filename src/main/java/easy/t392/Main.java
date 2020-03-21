package easy.t392;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-21 09:40
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 示例 1:
         * t = "ahbgdc"
         * s = "abc"
         * 返回 true.
         *
         * 示例 2:
         * t = "ahbgdc"
         * s = "axc"
         * 返回 false.
         */
        String s = "";
        String t = "asd";
        System.out.println("new Main().isSubsequence() = " + new Main().isSubsequence(s, t));

    }


    /**
     * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        if (t == null || s == null) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        if (t.length() == 0){
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int tIds = 0;
        int sIds = 0;
        while (tIds < tArr.length) {
            if (tArr[tIds] == sArr[sIds]) {
                sIds++;
                if (sIds == sArr.length) {
                    return true;
                }
            }
            tIds++;
        }
        return false;
    }
}
