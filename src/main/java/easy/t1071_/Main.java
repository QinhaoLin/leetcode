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
        // ���� str1 �� N �� X��str2 �� M �� X����ô str1 + str2 �϶��ǵ��� str2 + str1 �ġ�
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        // շת������� gcd��
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
