package Interview.t03;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-06 16:44
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println("new Main().findRepeatNumber() = " + new Main().findRepeatNumber(nums));
    }

    public int findRepeatNumber(int[] nums) {
        int size = nums.length;
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[nums[i]]++;
            if (temp[nums[i]] > 1) {
                return nums[i];
            }
        }
        return 0;
    }
}
