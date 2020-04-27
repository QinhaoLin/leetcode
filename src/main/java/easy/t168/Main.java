package easy.t168;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-27 11:42
 */
public class Main {
    public static void main(String[] args) {
        int n = 701;
        System.out.println("new Main().convertToTitle() = " + new Main().convertToTitle(n));
    }

    public String convertToTitle(int n) {
        if (n <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            sb.append((char) (n % 26 + 'A'));
            n /= 26;
        }
        return sb.reverse().toString();
    }
}
