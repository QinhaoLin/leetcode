package easy.t509;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-18 12:28
 */
public class Main {
    public static void main(String[] args) {
        int N = 3;
        System.out.println("new Main().fib() = " + new Main().fib(N));
    }

    public int fib(int N) {
        // F(0) = 0,   F(1) = 1
        if (N <= 1) {
            return N;
        }

        // fib(2-1) + fib(2-2) = 1
        if (N == 2) {
            return 1;
        }

        // F(N) = F(N - 1) + F(N - 2)
        int current = 0;
        // fib(N-1)
        int prev1 = 1;
        // fib(N-2)
        int prev2 = 1;

        for (int i = 3; i <= N; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}
