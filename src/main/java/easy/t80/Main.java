package easy.t80;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-15 10:00
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println("new Main().removeDuplicates() = " + new Main().removeDuplicates(nums));
        System.out.println("Arrays.toString() = " + Arrays.toString(nums));
    }

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i - 2]) {
                nums[i++] = n;
            }
        }
        return i;
    }

    public int removeDuplicates2(int[] nums) {
        int j = 1, count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                //  如果当前元素是重复元素，则累加
                count++;
            } else {
                // 重置计数，因为遇到的元素不同于上一个元素。
                count = 1;
            }
            // 对于计数<= 2，我们将元素复制到覆盖数组中索引 j 处的元素
            if (count <= 2) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

}
