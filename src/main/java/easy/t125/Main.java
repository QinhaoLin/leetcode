package easy.t125;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-05 18:03
 */
public class Main {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("new Main().isPalindrome() = " + new Main().isPalindrome(s));

    }

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        int i = 0;
        int j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            while (!Character.isLetterOrDigit(chars[i]) && i < j) {
                i++;
            }
            while (!Character.isLetterOrDigit(chars[j]) && i < j) {
                j--;
            }
            // �������ȣ��ͷ���false
            if ((int) Character.toLowerCase(chars[i]) != (int) Character.toLowerCase(chars[j])) {
                return false;
            }
            // ��i��j���м��ƶ�
            i++;
            j--;
        }
        return true;
    }
}
