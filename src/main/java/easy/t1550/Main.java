package easy.t1550;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-03-19 15:28
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12};
        System.out.println("new Main().threeConsecutiveOdds(arr) = " + new Main().threeConsecutiveOdds(arr));
    }

    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                count = 0;
            } else {
                count++;
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }
}
