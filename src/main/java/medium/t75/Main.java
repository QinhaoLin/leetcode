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
}
