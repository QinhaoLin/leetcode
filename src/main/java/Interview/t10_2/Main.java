package Interview.t10_2;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-12 18:11
 */
public class Main {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("new Main().numWays() = " + new Main().numWays(n));

    }

    public int numWays(int n) {
        if (n == 0) {
            return n;
        }
        if (n < 3) {
            return n;
        }
        // f(n) = f(n-1) + f(n-2)
        int current = 0;
        // f1 = 1
        int f1 = 1;
        // f2 = 2
        int f2 = 2;
        for (int i = 3; i <= n; i++) {
            current = (f1 + f2) % 1000000007;
            f1 = f2;
            f2 = current;
        }
        return current;
    }
}
