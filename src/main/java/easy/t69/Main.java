package easy.t69;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-13 10:56
 */
public class Main {
    public static void main(String[] args) {
        int x = 3;
        System.out.println("new Main().mySqrt() = " + new Main().mySqrt(x));
    }

    public int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }
        int min = 0;
        int max = x;
        while (max - min > 1) {
            int m = (max + min) / 2;
            // m * m > x
            // m > x / m （防止溢出）
            if (m > x / m) {
                max = m;
            } else {
                min = m;
            }
        }
        return min;
    }

    /**
     * 一个数 x 的开方 sqrt 一定在 0 ~ x 之间，并且满足 sqrt == x / sqrt。
     * 可以利用二分查找在 0 ~ x 之间查找 sqrt。
     * 对于 x = 8，它的开方是 2.82842...，最后应该返回 2 而不是 3。
     * 在循环条件为 startIdx <= endIdx 并且循环退出时，endIdx 总是比 startIdx 小 1，
     * 也就是说 endIdx = 2，startIdx = 3，因此最后的返回值应该为 endIdx 而不是 startIdx。
     *
     * @param x
     * @return
     */
    public int mySqrt2(int x) {
        if (x <= 1) {
            return x;
        }
        int startIdx = 1;
        int endIdx = x;
        while (startIdx <= endIdx) {
            int mid = startIdx + (endIdx - startIdx) / 2;
            int sqrt = x / mid;
            if (sqrt == mid) {
                return mid;
            } else if (mid > sqrt) {
                endIdx = mid - 1;
            } else {
                startIdx = mid + 1;
            }
        }
        return endIdx;
    }

}
