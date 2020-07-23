package Interview.tOffer53I;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-07-23 11:38
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println("new Main().findFirst() = " + new Main().search(nums, target));
    }

    public int search(int[] nums, int target) {
        int first = findFirst(nums, target);
        if (first == nums.length || nums[first] != target) {
            return 0;
        } else {
            int last = findFirst(nums, target + 1) - 1;
            return last - first + 1;
        }
    }

    /**
     * 查找目标值的最左区间
     *
     * @param nums
     * @param target
     * @return
     */
    private int findFirst(int[] nums, int target) {
        int left = 0;
        // 注意 right 的初始值
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            // 如果中位数大于等于目标值，则说明搜索区间在左边
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
