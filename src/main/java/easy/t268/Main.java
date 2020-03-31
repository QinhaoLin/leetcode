package easy.t268;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-31 19:23
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("new Main().missingNumber() = " + new Main().missingNumber(nums));
    }

    /**
     * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
     * 注意：要找的数是在 [0,n] 中的数，数组的长度是 n
     *
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}
