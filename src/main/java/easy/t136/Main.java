package easy.t136;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-30 15:41
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println("new Main().singleNumber() = " + new Main().singleNumber(nums));
    }

    /**
     * 1. a ^ b = b ^ a
     * 2. a ^ b ^ c = a ^ (b ^ c) = (a ^ b) ^ c;
     * 3. d = a ^ b ^ c 可以推出 a = d ^ b ^ c.
     * 4. a ^ b ^ a = b.
     * https://blog.csdn.net/wohaqiyi/article/details/80931693
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}
