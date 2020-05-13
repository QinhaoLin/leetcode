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
            // m > x / m ����ֹ�����
            if (m > x / m) {
                max = m;
            } else {
                min = m;
            }
        }
        return min;
    }

    /**
     * һ���� x �Ŀ��� sqrt һ���� 0 ~ x ֮�䣬�������� sqrt == x / sqrt��
     * �������ö��ֲ����� 0 ~ x ֮����� sqrt��
     * ���� x = 8�����Ŀ����� 2.82842...�����Ӧ�÷��� 2 ������ 3��
     * ��ѭ������Ϊ startIdx <= endIdx ����ѭ���˳�ʱ��endIdx ���Ǳ� startIdx С 1��
     * Ҳ����˵ endIdx = 2��startIdx = 3��������ķ���ֵӦ��Ϊ endIdx ������ startIdx��
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
