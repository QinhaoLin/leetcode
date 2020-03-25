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
        // �� K �е� list ��СΪ rowIndex + 1
        Integer[] kRows = new Integer[rowIndex + 1];
        // ����ǰһ�����һ�У��� K ��Ҫѭ�� K ��
        for (int i = 0; i <= rowIndex; i++) {
            // ��ĩβΪ1
            kRows[i] = 1;
            // ÿһ�еĸ��¹���
            // ��ǰԪ�ص�ֵ�������Ϸ�+���Ϸ���ֵ
            for (int j = i; j > 1; j--) {
                kRows[j - 1] = kRows[j - 2] + kRows[j - 1];
            }
        }
        List<Integer> list = Arrays.asList(kRows);
        return list;
    }
}
