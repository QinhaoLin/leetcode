package easy.t914;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-03-24 10:45
 */
public class Main {
    public static void main(String[] args) {
        int[] deck = new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3};
        System.out.println("new Main().hasGroupsSizeX(deck) = " + new Main().hasGroupsSizeX(deck));
    }


    /**
     * 统计各个数出现的次数，然后求次数之间是否存在公约数
     *
     * @param deck
     * @return
     */
    public boolean hasGroupsSizeX(int[] deck) {
        // 计数
        int[] counter = new int[10000];
        for (int num : deck) {
            counter[num]++;
        }
        // 求gcd
        int x = 0;
        for (int cnt : counter) {
            if (cnt > 0) {
                x = gcd(x, cnt);
                // System.out.println("x = " + x);
                if (x == 1) {
                    return false;
                }
            }
        }
        return x >= 2;
    }

    // 辗转相除法
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
