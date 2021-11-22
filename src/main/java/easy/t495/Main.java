package easy.t495;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-11-22 11:53
 */
public class Main {
    public static void main(String[] args) {
        int[] timeSeries = new int[]{1, 4};
        int duration = 2;
        System.out.println("new Main().findPoisonedDuration(timeSeries, duration) = " + new Main().findPoisonedDuration(timeSeries, duration));
    }

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        // 中毒状态的总秒数
        int ans = 0;
        // 艾希恢复为未中毒的起始时间 expired
        int expired = 0;
        for (int i = 0; i < timeSeries.length; ++i) {
            if (timeSeries[i] >= expired) {
                ans += duration;
            } else {
                ans += timeSeries[i] + duration - expired;
            }
            expired = timeSeries[i] + duration;
        }
        return ans;
    }
}
