package Interview.t16_11;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-06 15:47
 */
public class Main {
    public static void main(String[] args) {
        int shorter = 1;
        int longer = 2;
        int k = 4;
        System.out.println("new Main().divingBoard() = " + Arrays.toString(new Main().divingBoard(shorter, longer, k)));
    }


    public int[] divingBoard(int shorter, int longer, int k) {
        // ľ������С��1���޽�
        if (k < 1) {
            return new int[]{};
        }
        // ������ӳ���һ��ֻ��һ�ֽ�
        if (shorter == longer) {
            return new int[]{shorter * k};
        }
        int[] res = new int[k + 1];
        // f 1 = 1,2
        // f 2 = 2,3,4
        // f 3 = 3,4,5,6
        // ö�ٽϳ�ľ�����������ô��k-i�����Ƕ̰������
        for (int i = 0; i <= k; i++) {
            res[i] = longer * i + shorter * (k - i);
        }
        return res;
    }
}
