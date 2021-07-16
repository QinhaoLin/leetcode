package easy.o_t53;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-07-16 14:50
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println("new Main().search(nums, target) = " + new Main().search(nums, target));
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // Ñ°ÕÒ×î×ó±ß½ç
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        int count = 0;
        while (left < nums.length && nums[left++] == target) {
            count++;
        }
        return count;
    }

}
