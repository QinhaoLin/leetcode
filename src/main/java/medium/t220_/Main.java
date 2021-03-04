package medium.t220_;

import java.util.HashMap;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-26 09:40
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 5, 9, 1, 5, 9};
        int k = 2;
        int t = 3;
        System.out.println("new Main().containsNearbyAlmostDuplicate() = " + new Main().containsNearbyAlmostDuplicate(nums, k, t));
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(Math.abs(t - nums[i])) != null && Math.abs(t - nums[i]) <= nums[i] && i - map.get(Math.abs(t - nums[i])) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
