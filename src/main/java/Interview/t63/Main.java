package Interview.t63;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-30 15:09
 */
public class Main {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("new Main().maxProfit(prices) = " + new Main().maxProfit(prices));

    }

    /**
     * 思路还是挺清晰的，还是DP思想：
     * <p>
     * 记录【今天之前买入的最小值】
     * 计算【今天之前最小值买入，今天卖出的获利】，也即【今天卖出的最大获利】
     * 比较【每天的最大获利】，取最大值即可
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            // 最大盈利 = 今天的价格 - 今天之前买入的最小值
            max = Math.max(max, prices[i] - min);
            // 记录每天的最小值
            min = Math.min(min, prices[i]);
        }
        return max;
    }

    public int maxProfit2(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
