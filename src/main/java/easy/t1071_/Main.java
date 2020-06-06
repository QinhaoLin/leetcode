package easy.t1071_;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-06 09:19
 */
public class Main {
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        System.out.println("new Main().gcdOfStrings() = " + new Main().gcdOfStrings(str1, str2));
    }


    public String gcdOfStrings(String str1, String str2) {
        // 假设 str1 是 N 个 X，str2 是 M 个 X，那么 str1 + str2 肯定是等于 str2 + str1 的。
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        // 辗转相除法求 gcd。
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }


    private int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
