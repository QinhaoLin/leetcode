package easy.t1010;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-07-06 09:10
 */
public class Main {
    public static void main(String[] args) {
        int[] tiem = {60, 60, 60};
        System.out.println("new Main().numPairsDivisibleBy60() = " + new Main().numPairsDivisibleBy60(tiem));
    }

    public int numPairsDivisibleBy60(int[] time) {
        int ans = 0;
        int[] index = new int[60];
        for (int t : time) {
            ans += index[(60 - t % 60) % 60];
            index[t % 60]++;
        }
        return ans;
    }
}
