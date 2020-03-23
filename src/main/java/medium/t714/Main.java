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
        // �����ǲ����й�Ʊʱ���������
        int cash = 0;
        // �����ǳ��й�Ʊʱ���������
        int hold = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            // ���������й�Ʊ�������������Ʊʱ���������Ƚ�
            cash = Math.max(cash, hold + prices[i] - fee);
            // �������й�Ʊ�����������ʱ���������Ƚ�
            hold = Math.max(hold, cash - prices[i]);
        }
        return cash;
    }
}
