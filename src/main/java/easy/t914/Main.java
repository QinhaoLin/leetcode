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
     * ͳ�Ƹ��������ֵĴ�����Ȼ�������֮���Ƿ���ڹ�Լ��
     *
     * @param deck
     * @return
     */
    public boolean hasGroupsSizeX(int[] deck) {
        // ����
        int[] counter = new int[10000];
        for (int num : deck) {
            counter[num]++;
        }
        // ��gcd
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

    // շת�����
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
