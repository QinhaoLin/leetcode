package easy.t119;

import java.util.Arrays;
import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-25 09:51
 */
public class Main {
    public static void main(String[] args) {
        int rowIndex = 5;
        List<Integer> res = new Main().getRow(rowIndex);
        res.forEach(item -> System.out.print(" " + item));
    }

    /**
     * dp
     *
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {
        // 第 K 行的 list 大小为 rowIndex + 1
        Integer[] kRows = new Integer[rowIndex + 1];
        // 利用前一行求后一行，第 K 行要循环 K 遍
        for (int i = 0; i <= rowIndex; i++) {
            // 行末尾为1
            kRows[i] = 1;
            // 每一行的更新过程
            // 当前元素的值等于左上方+正上方的值
            for (int j = i; j > 1; j--) {
                kRows[j - 1] = kRows[j - 2] + kRows[j - 1];
            }
        }
        List<Integer> list = Arrays.asList(kRows);
        return list;
    }
}
