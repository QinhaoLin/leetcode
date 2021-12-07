package easy.t326;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-12-07 15:58
 */
public class Main {
    public static void main(String[] args) {
        int n = 27;
        System.out.println("new Main().isPowerOfThree(n) = " + new Main().isPowerOfThree(n));
    }

    public boolean isPowerOfThree(int n) {
        while (n != 0 && n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
