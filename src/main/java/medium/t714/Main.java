package medium.t714;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-23 12:33
 */
public class Main {
    public static void main(String[] args) {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        System.out.println("new Main().maxProfit(prices, fee) = " + new Main().maxProfit(prices, fee));
    }

    public int maxProfit(int[] prices, int fee) {
        // 当我们不持有股票时的最大利润
        int cash = 0;
        // 当我们持有股票时的最大利润。
        int hold = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            // 继续不持有股票，与今天卖出股票时的最大收益比较
            cash = Math.max(cash, hold + prices[i] - fee);
            // 继续持有股票，与今天买入时的最大收益比较
            hold = Math.max(hold, cash - prices[i]);
        }
        return cash;
    }
}
