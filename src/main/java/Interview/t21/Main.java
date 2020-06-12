package Interview.t21;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-12 17:33
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("new Main().exchange() = " + Arrays.toString(new Main().exchange(nums)));
    }

    /**
     * 考虑定义双指针 i , j 分列数组左右两端，循环执行：
     * 指针 i 从左向右寻找偶数；
     * 指针 j 从右向左寻找奇数；
     * 将 偶数 nums[i] 和 奇数 nums[j] 交换。
     * 可始终保证： 指针 i 左边都是奇数，指针 j 右边都是偶数 。
     *
     * @param nums
     * @return
     */
    public int[] exchange(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int tmp;
        while (i < j) {
            while (i < j && (nums[i] % 2 != 0)) {
                i++;
            }
            while (i < j && (nums[j] % 2 == 0)) {
                j--;
            }
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}
