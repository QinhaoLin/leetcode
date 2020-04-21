package easy.t202_;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-21 09:41
 */
public class Main {
    public static void main(String[] args) {
        int n = 19;
        System.out.println("new Main().isHappy() = " + new Main().isHappy(n));
    }

    public int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public boolean isHappy(int n) {
        // �꣨�����ߣ�
        int slowRunner = n;
        // �ã������ߣ�
        int fastRunner = getNext(n);
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }

}
