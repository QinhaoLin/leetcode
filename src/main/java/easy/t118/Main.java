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

        // 从第二行开始循环
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            // 上一行元素
            List<Integer> prevRow = triangle.get(rowNum - 1);

            // 每行的第一列总是1
            row.add(1);

            // 每个三角形元素（除了每行的第一个和最后一个）
            // 当前行的当前元素，等于上面和左边的元素之和
            // 从第二列开始循环
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // 每行的最后一个总是1
            row.add(1);

            triangle.add(row);
        }
        return triangle;
    }
}
