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
     * ˼·����ͦ�����ģ�����DP˼�룺
     * <p>
     * ��¼������֮ǰ�������Сֵ��
     * ���㡾����֮ǰ��Сֵ���룬���������Ļ�������Ҳ����������������������
     * �Ƚϡ�ÿ�������������ȡ���ֵ����
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
     * �����������Լ��������Ʊ������ʱ������ƣ�ÿ�����Ƕ�����ѡ����۹�Ʊ�����ô�������ڵ� i �죬�������Ҫ�ڽ�������Ʊ����ô������׬����Ǯ�أ�
     * <p>
     * ��Ȼ��������������������Ʊ�����ǿ϶����룺�����������ʷ��͵���Ĺ�Ʊ�ͺ��ˣ�̫���ˣ�����Ŀ�У�����ֻҪ��һ��������¼һ����ʷ��ͼ۸� minprice�����ǾͿ��Լ����Լ��Ĺ�Ʊ����������ġ���ô�����ڵ� i ��������Ʊ�ܵõ���������� prices[i] - minprice��
     * <p>
     * ��ˣ�����ֻ��Ҫ�����۸�����һ�飬��¼��ʷ��͵㣬Ȼ����ÿһ�쿼����ôһ�����⣺�����������ʷ��͵�����ģ���ô�ҽ���������׬����Ǯ������������������֮ʱ�����Ǿ͵õ�����õĴ𰸡�
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
