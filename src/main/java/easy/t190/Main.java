package easy.t190;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-09-29 10:27
 */
public class Main {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("new Main().reverseBits() = " + new Main().reverseBits(n));
    }


    /**
     * ȡģ���
     * ʮ���ƣ�ans = ans * 10 + n % 10; n = n / 10;
     * �����ƣ�ans = ans * 2 + n % 2; n = n / 2;
     *
     * @param n
     * @return
     */
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = (res << 1) + (n & 1);
            n >>= 1;
        }
        return res;
    }
}
