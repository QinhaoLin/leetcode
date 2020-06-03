package Interview.t64;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-03 17:47
 */
public class Main {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("new Main().sumNums() = " + new Main().sumNums(n));
    }

    public int sumNums(int n) {
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }

    public int sumNumsNormal(int n) {
        return n == 0 ? 0 : n + sumNums(n - 1);
    }
}
