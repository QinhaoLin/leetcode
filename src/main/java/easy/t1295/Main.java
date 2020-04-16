package easy.t1295;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-16 19:30
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println("new Main().findNumbers() = " + new Main().findNumbers(nums));
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
