package easy.t70;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-18 13:43
 */
public class Main {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("new Main().climbStairs() = " + new Main().climbStairs(n));
    }

    /**
     * 斐波那契数列：
     * 设跳n个台阶有f(n)种方法，
     * 爬1个：1种
     * 爬2个：2种
     * 爬n个：面临两种选择：
     * （1） 第一次爬1个，此时剩余n-1个台阶，有f(n-1)种方法
     * （2） 第一次爬2个，此时剩余n-2个台阶，有f(n-2)种方法
     * 所以f(n) = f(n-1) + f(n-2)
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        // f(n-2)
        int first = 1;
        // f(n-1)
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }
}
