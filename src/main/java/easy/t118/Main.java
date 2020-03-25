package easy.t118;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-25 09:16
 */
public class Main {
    public static void main(String[] args) {
        int numRows = 10;
        System.out.println("new Main().generate() = " + new Main().generate(numRows));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows < 1) {
            return triangle;
        }
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        // �ӵڶ��п�ʼѭ��
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            // ��һ��Ԫ��
            List<Integer> prevRow = triangle.get(rowNum - 1);

            // ÿ�еĵ�һ������1
            row.add(1);

            // ÿ��������Ԫ�أ�����ÿ�еĵ�һ�������һ����
            // ��ǰ�еĵ�ǰԪ�أ������������ߵ�Ԫ��֮��
            // �ӵڶ��п�ʼѭ��
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // ÿ�е����һ������1
            row.add(1);

            triangle.add(row);
        }
        return triangle;
    }
}
