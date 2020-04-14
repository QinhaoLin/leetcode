package easy.t1281;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-12 22:05
 */
public class Main {

    public static void main(String[] args) {
        int n = 234;
        System.out.println("new Main().subtractProductAndSum() = " + new Main().subtractProductAndSum(n));
    }

    public int subtractProductAndSum(int n) {
        int prod = 1, sum = 0;
        for (; n != 0; n /= 10) {
            prod *= n % 10;
            sum += n % 10;
        }
        return prod - sum;
    }
}
