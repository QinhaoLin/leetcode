package easy.t1029;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[][] costs = {{10, 11}, {10, 12}, {10, 13}, {10, 14}};
        System.out.println("new Main().twoCitySchedCost() = " + new Main().twoCitySchedCost(costs));
    }


    public int twoCitySchedCost(int[][] costs) {
        // ��˾���Ƚ��� 2N ����ȫ�����ŷ��� B �У���ѡ�� N ���˸ı����ǵ��г̣������Ƿ��� A �С�
        // ���� A �кͷ��� B �еķ��ò���� price_A - price_B �ɴ�С����
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o1[1] - (o2[0] - o2[1]);
            }
        });

        int total = 0;
        int n = costs.length / 2;
        for (int i = 0; i < n; ++i) {
            // ǰ n ���� A �У��� n ���� B ��
            total += costs[i][0] + costs[i + n][1];
        }
        return total;
    }
}
