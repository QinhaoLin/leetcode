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
        // �Ƿ��һλ
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
            // ������߶�Ϊ1����0��  ��ô carry % 2 Ӧ�øպ�Ϊ0 ����Ϊ1
            sb.append(carry % 2);
            // ������߶�Ϊ1����0�� ��ô carry Ӧ�øպ�Ϊ0 ����Ϊ1
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}
