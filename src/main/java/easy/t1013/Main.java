package easy.t1013;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-11 14:31
 */
public class Main {
    public static void main(String[] args) {
        // int[] test = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
        int[] test = {0, 2, 2};
        System.out.println("new Main().canThreePartsEqualSum(test) = " + new Main().canThreePartsEqualSum(test));
    }

    public boolean canThreePartsEqualSum(int[] nums) {
        final int count = 3;
        if (nums == null || nums.length < count) {
            return false;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % count != 0) {
            return false;
        }

        return true;
    }
}
