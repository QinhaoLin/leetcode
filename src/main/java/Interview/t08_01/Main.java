package Interview.t08_01;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-07-04 10:44
 */
public class Main {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("new Main().waysToStep() = " + new Main().waysToStep(n));
    }

    public int waysToStep(int n) {
        if (n <= 2) return n;
        if (n == 3) return 4;
        int[] d = new int[n + 1];
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;
        for (int i = 4; i <= n; i++) {
            d[i] = (d[i - 1] + d[i - 2]) % 1000000007 + d[i - 3];
            d[i] %= 1000000007;
        }
        return d[n];
    }
}
