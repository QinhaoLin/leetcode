package Interview.t10_1;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-06 14:28
 */
public class Main {
    public static void main(String[] args) {
        int n = 45;
        System.out.println("new Main().fib(n) = " + new Main().fib(n));
    }

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        // F(2) = F(2 - 1) + F(2 - 2)
        if (n == 2) {
            return 1;
        }

        // F(N) = F(N - 1) + F(N - 2)
        int current = 0;
        // fib(1)
        int f1 = 1;
        // fib(2)
        int f2 = 1;
        for (int i = 3; i <= n; i++) {
            current = (f1 + f2) % 1000000007;
            f1 = f2;
            f2 = current;
        }
        return current;
    }
}
