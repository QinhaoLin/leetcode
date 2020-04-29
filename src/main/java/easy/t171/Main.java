package easy.t171;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-27 10:35
 */
public class Main {
    public static void main(String[] args) {
        String s = "ZY";
        System.out.println("new Main().titleToNumber() = " + new Main().titleToNumber2(s));
    }

    public int titleToNumber(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        int sum = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            sum += (s.charAt(i) - 'A' + 1) * Math.pow(26, size - i - 1);
        }
        return sum;
    }
    public int titleToNumber2(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum * 26 + ((char) s.charAt(i) - 'A' + 1);
        }
        return sum;
    }
}
