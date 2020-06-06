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
        // 木板数量小于1，无解
        if (k < 1) {
            return new int[]{};
        }
        // 两块板子长度一样只有一种解
        if (shorter == longer) {
            return new int[]{shorter * k};
        }
        int[] res = new int[k + 1];
        // f 1 = 1,2
        // f 2 = 2,3,4
        // f 3 = 3,4,5,6
        // 枚举较长木板的数量，那么（k-i）即是短板的数量
        for (int i = 0; i <= k; i++) {
            res[i] = longer * i + shorter * (k - i);
        }
        return res;
    }
}
