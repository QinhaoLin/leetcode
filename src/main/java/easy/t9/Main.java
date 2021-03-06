package easy.t9;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-03 18:19
 */
public class Main {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("new Main().isPalindrome() = " + new Main().isPalindrome(x));
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int a = 0;
        while (x > a) {
            a = a * 10 + x % 10;
            x = x / 10;
        }
        return x == a || x == a / 10;
    }

    public boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        }
        String xStr = String.valueOf(x);
        int i = 0;
        int j = xStr.length() - 1;
        while (i < j) {
            if (xStr.charAt(i) != xStr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
