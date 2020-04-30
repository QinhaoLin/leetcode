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
     * ˼·����ͦ�����ģ�����DP˼�룺
     * <p>
     * ��¼������֮ǰ�������Сֵ��
     * ���㡾����֮ǰ��Сֵ���룬���������Ļ�������Ҳ����������������������
     * �Ƚϡ�ÿ�������������ȡ���ֵ����
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
            // ���ӯ�� = ����ļ۸� - ����֮ǰ�������Сֵ
            max = Math.max(max, prices[i] - min);
            // ��¼ÿ�����Сֵ
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
