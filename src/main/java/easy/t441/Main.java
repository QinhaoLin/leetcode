package easy.t441;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-12 22:05
 */
public class Main {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("new Main().arrangeCoins() = " + new Main().arrangeCoins(n));
    }

    public int arrangeCoins(int n) {
        int i;
        long sum = 0;

        if (n == 1) {
            return 1;
        }

        for (i = 1; i < n; i++) {
            sum += i;
            if (sum > n) {
                break;
            }
        }

        return i - 1;
    }
}
