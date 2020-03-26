package easy.t217;

import java.util.HashSet;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-26 09:31
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("new Main().containsDuplicate() = " + new Main().containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
