package easy.t492;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-13 10:29
 */
public class Main {
    public static void main(String[] args) {
        int area = 4;
        System.out.println("new Main().constructRectangle() = " + Arrays.toString(new Main().constructRectangle(area)));
    }

    /**
     * 1. ����Ƶľ���ҳ�������ڸ�����Ŀ�������
     * 2. ��� W ��Ӧ���ڳ��� L������֮��Ҫ�� L >= W ��
     * 3. ���� L �Ϳ�� W ֮��Ĳ��Ӧ��������С��
     *
     * @param area
     * @return
     */
    public int[] constructRectangle(int area) {
        int maxL = area;
        int maxW = 1;
        int[] res = new int[2];
        while (maxL >= maxW) {
            if (maxL * maxW == area) {
                res[0] = maxL;
                res[1] = maxW++;
            } else if (maxL * maxW > area) {
                maxL--;
            } else if (maxL * maxW < area) {
                maxW++;
            }
        }
        return res;
    }
}
