package easy.t1137;

public class Main {
    public static void main(String[] args) {
        int n = 25;
        System.out.println("new Main().tribonacci() = " + new Main().tribonacci(n));
    }

    public int tribonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n < 3) {
            return 1;
        }
        int T0 = 0;
        int T1 = 1;
        int T2 = 1;
        int current = 0;
        for (int i = 3; i <= n; i++) {
            current = T0 + T1 + T2;
            T0 = T1;
            T1 = T2;
            T2 = current;

        }
        return current;
    }
}
