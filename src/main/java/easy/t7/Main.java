package easy.t7;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-16 10:33
 */
public class Main {
    public static void main(String[] args) {
        int test = 1234567899;
        System.out.println("new Main().reverse() = " + new Main().reverse(test));
    }

    public int reverse(int x) {
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x = x / 10;
        }
        return (int) n == n ? (int) n : 0;
    }
}
