package easy.t172;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-03-10 11:23
 */
public class Main {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("new Main().trailingZeroes(n) = " + new Main().trailingZeroes(n));
    }


    public int trailingZeroes(int n) {
        int zeroCount = 0;
        while (n > 0) {
            // 可以除以几个5
            n /= 5;
            zeroCount += n;
        }
        return zeroCount;
    }
}
