package easy.t392;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-21 09:40
 */
public class Main {
    public static void main(String[] args) {
        /**
         * ʾ�� 1:
         * t = "ahbgdc"
         * s = "abc"
         * ���� true.
         *
         * ʾ�� 2:
         * t = "ahbgdc"
         * s = "axc"
         * ���� false.
         */
        String s = "";
        String t = "asd";
        System.out.println("new Main().isSubsequence() = " + new Main().isSubsequence(s, t));

    }


    /**
     * �����ַ��� s �� t ���ж� s �Ƿ�Ϊ t �������С�
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
