package easy.t704;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-18 20:10
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 12;
        System.out.println("new Main().search() = " + new Main().search(nums, target));
    }


    public int search(int[] nums, int target) {
        // 左区间开始
        int left = 0;
        // 右区间结束
        int right = nums.length - 1;
        while (left <= right) {
            // int mid = (left + right) / 2
            // 防止溢出
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
