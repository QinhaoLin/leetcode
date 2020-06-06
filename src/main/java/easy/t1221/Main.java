package easy.t1221;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-06 11:33
 */
public class Main {
    public static void main(String[] args) {
        String s = "RRLRRLRLLLRL";
        System.out.println("new Main().balancedStringSplit() = " + new Main().balancedStringSplit(s));
    }


    public int balancedStringSplit(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        int cnt = 1;
        char temp = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (temp == chars[i]) {
                cnt++;
            } else {
                cnt--;
            }
            if (cnt == 0) {
                count++;
            }
        }
        return count;
    }
}
