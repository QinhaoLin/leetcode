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
     * 쳲��������У�
     * ����n��̨����f(n)�ַ�����
     * ��1����1��
     * ��2����2��
     * ��n������������ѡ��
     * ��1�� ��һ����1������ʱʣ��n-1��̨�ף���f(n-1)�ַ���
     * ��2�� ��һ����2������ʱʣ��n-2��̨�ף���f(n-2)�ַ���
     * ����f(n) = f(n-1) + f(n-2)
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
