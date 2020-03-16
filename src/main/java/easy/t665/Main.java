package easy.t665;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-16 14:53
 */
public class Main {

    /**
     * 我们是这样定义一个非递减数列的： 对于数组中所有的 i (1 <= i < n)，满足 array[i] <= array[i + 1]。
     * 输入: [4,2,3]
     * 输出: true
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] test = {3, 4, 2, 3};
        System.out.println("new Main().checkPossibility() = " + new Main().checkPossibility(test));
    }

    // a. [3,4,2,5] 需要把2变成4（4不能动，因为它要大于等于前一个3）
    // b. [1,3,2,2] 需要把3变成1或2（2不能动，因为它要小于等于后一个2）
    public boolean checkPossibility(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] <= nums[i]) {
                continue;
            }
            count++;
            if (count > 1) {
                return false;
            }
            if (i >= 2 && nums[i - 2] > nums[i]) {
                nums[i] = nums[i - 1];
            } else {
                nums[i - 1] = nums[i];
            }
        }
        return true;
    }
}
