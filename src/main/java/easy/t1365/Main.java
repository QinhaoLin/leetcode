package easy.t1365;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-21 17:11
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 输入：nums = [8,1,2,2,3]
         * 输出：[4,0,1,1,3]
         * 解释：
         * 对于 nums[0]=8 存在四个比它小的数字：（1，2，2 和 3）。
         * 对于 nums[1]=1 不存在比它小的数字。
         * 对于 nums[2]=2 存在一个比它小的数字：（1）。
         * 对于 nums[3]=2 存在一个比它小的数字：（1）。
         * 对于 nums[4]=3 存在三个比它小的数字：（1，2 和 2）。
         */
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println("new Main().smallerNumbersThanCurrent() = " + Arrays.toString(new Main().smallerNumbersThanCurrent(nums)));
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    res[i]++;
                } else if (nums[i] < nums[j]) {
                    res[j]++;
                }
            }
        }
        return res;
    }
}
