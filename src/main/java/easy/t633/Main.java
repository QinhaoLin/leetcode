package easy.t633;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-30 16:14
 */
public class Main {
    public static void main(String[] args) {
        int c = 3;
        System.out.println("new Main().judgeSquareSum() = " + new Main().judgeSquareSum(c));
    }


    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);
        while (left <= right) {
            int sum = left * left + right * right;
            if (sum == c) {
                return true;
            } else if (sum > c) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}
