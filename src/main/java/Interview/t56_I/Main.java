package Interview.t56_I;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-28 17:41
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 10, 4, 1, 4, 3, 3};
        System.out.println("new Main().singleNumbers() = " + Arrays.toString(new Main().singleNumbers(nums)));
    }

    /**
     * nums = [1,2,10,4,1,4,3,3]
     * a^a=0
     * a^0=a
     * a^b^c=a^c^b
     * a&(-a)=最低位为1的二进制（从右到左）
     * 所有的异或结果得到sum=2^10=8
     * flag = -8 & 8 = 8
     * 可分为两组，一组为与 flag 相与等于1的[10]，另一组为0的[1,2,4,1,4,3,3]
     * 组内异或分别得到【10】【2】
     *
     * @param nums
     * @return
     */
    public int[] singleNumbers(int[] nums) {
        int sum = 0;
        // 得到异或结果，即为不相同两个数的异或结果 sum
        for (int num : nums) {
            sum ^= num;
        }
        int result[] = new int[2];
        // 得到 sum 的二进制的1的最低位
        int flag = (-sum) & sum;
        // 分成两个组进行异或，每组异或后的结果就是不相同两个数的其中之一
        for (int num : nums) {
            if ((flag & num) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }
        return result;
    }
}
