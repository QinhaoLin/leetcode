package easy.t122;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-23 11:37
 */
public class Main {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 4, 5};
        System.out.println("new Main().maxProfit() = " + new Main().maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                max += prices[i + 1] - prices[i];
            }
        }
        return max;
    }
}

