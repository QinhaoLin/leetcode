package easy.t680;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-30 16:31
 */
public class Main {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println("new Main().validPalindrome(s) = " + new Main().validPalindrome(s));
    }

    public boolean validPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isValid(s, left + 1, right) || isValid(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true;
    }

    public boolean isValid(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
