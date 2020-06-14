package easy.t1029;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[][] costs = {{10, 11}, {10, 12}, {10, 13}, {10, 14}};
        System.out.println("new Main().twoCitySchedCost() = " + new Main().twoCitySchedCost(costs));
    }


    public int twoCitySchedCost(int[][] costs) {
        // 公司首先将这 2N 个人全都安排飞往 B 市，再选出 N 个人改变它们的行程，让他们飞往 A 市。
        // 飞往 A 市和飞往 B 市的费用差，按照 price_A - price_B 由大到小排序
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o1[1] - (o2[0] - o2[1]);
            }
        });

        int total = 0;
        int n = costs.length / 2;
        for (int i = 0; i < n; ++i) {
            // 前 n 个飞 A 市，后 n 个飞 B 市
            total += costs[i][0] + costs[i + n][1];
        }
        return total;
    }
}
