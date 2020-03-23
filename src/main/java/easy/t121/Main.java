package easy.t121;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-09 16:45
 */
public class Main {

    public static void main(String[] args) {
        int[] test = {7, 1, 5, 3, 4, 6};
        System.out.println("Main.maxProfit(test) = " + Main.maxProfit2(test));
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
    public static int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }

        return max;
    }

    /**
     * 我们来假设自己来购买股票。随着时间的推移，每天我们都可以选择出售股票与否。那么，假设在第 i 天，如果我们要在今天卖股票，那么我们能赚多少钱呢？
     * <p>
     * 显然，如果我们真的在买卖股票，我们肯定会想：如果我是在历史最低点买的股票就好了！太好了，在题目中，我们只要用一个变量记录一个历史最低价格 minprice，我们就可以假设自己的股票是在那天买的。那么我们在第 i 天卖出股票能得到的利润就是 prices[i] - minprice。
     * <p>
     * 因此，我们只需要遍历价格数组一遍，记录历史最低点，然后在每一天考虑这么一个问题：如果我是在历史最低点买进的，那么我今天卖出能赚多少钱？当考虑完所有天数之时，我们就得到了最好的答案。
     *
     * @param prices
     * @return
     */
    public static int maxProfit2(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }

        }
        return maxprofit;
    }

}
