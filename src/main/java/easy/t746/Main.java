package easy.t746;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-10 09:53
 */
public class Main {
    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println("new Main().minCostClimbingStairs() = " + new Main().minCostClimbingStairs(cost));
    }

    public int minCostClimbingStairs(int[] cost) {
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < cost.length; i++) {
            int curr = cost[i] + Math.min(c1, c2);
            c1 = c2;
            c2 = curr;
        }
        return Math.min(c1, c2);
    }
}

