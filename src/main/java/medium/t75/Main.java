package medium.t75;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        new Main().sortColors(nums);
        System.out.println("nums = " + Arrays.toString(nums));
    }

    public void sortColors(int[] nums) {
        int[] temp = new int[3];

        for (int num : nums) {
            temp[num]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp[0] != 0) {
                temp[0]--;
                nums[i] = 0;
            } else if (temp[1] != 0) {
                temp[1]--;
                nums[i] = 1;
            } else if (temp[2] != 0) {
                temp[2]--;
                nums[i] = 2;
            }
        }
    }

    /**
     * 荷兰三色旗问题解
     *
     * @param nums
     */
    public void sortColors2(int[] nums) {
        // 对于所有 idx < i : nums[idx < i] = 0
        // j 是当前考虑元素的下标
        int p0 = 0;
        int curr = 0;
        // 对于所有 idx > k : nums[idx > k] = 2
        int p2 = nums.length - 1;

        int tmp;
        while (curr <= p2) {
            if (nums[curr] == 0) {
                // 交换第 p0个和第curr个元素
                // i++，j++
                tmp = nums[p0];
                nums[p0++] = nums[curr];
                nums[curr++] = tmp;
            } else if (nums[curr] == 2) {
                // 交换第k个和第curr个元素
                // p2--
                tmp = nums[curr];
                nums[curr] = nums[p2];
                nums[p2--] = tmp;
            } else curr++;
        }
    }

}
