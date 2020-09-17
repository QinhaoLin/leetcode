package easy.t67;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-09-17 11:32
 */
public class Main {
    public static void main(String[] args) {
        String a = "11";
        String b = "11";
        System.out.println("new Main().addBinary() = " + new Main().addBinary(a, b));
    }

    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        // 是否进一位
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                carry += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += b.charAt(j--) - '0';
            }
            // 如果二者都为1或者0，  那么 carry % 2 应该刚好为0 否则为1
            sb.append(carry % 2);
            // 如果二者都为1或者0， 那么 carry 应该刚好为0 否则为1
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}
