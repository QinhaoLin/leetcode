package medium.t540;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-15 09:30
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println("new Main().singleNonDuplicate() = " + new Main().singleNonDuplicate3(nums));
    }

    public int singleNonDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public int singleNonDuplicate2(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp ^= nums[i];
        }
        return temp;
    }

    /**
     * 二分法
     * 只搜索索引偶数位
     *
     * @param nums
     * @return
     */
    public int singleNonDuplicate3(int[] nums) {
        // 左区间开始
        int left = 0;
        // 右区间结束
        int right = nums.length - 1;

        while (left < right) {
            // int mid = (left + right) / 2
            // 防止溢出
            int mid = left + (right - left) / 2;
            if (mid % 2 == 1) mid--;
            // 索引偶数位 与 索引偶数位+1 对比
            if (nums[mid] == nums[mid + 1]) {
                // 如果相等，说明单一元素在右边
                // mid = 2，5 5 6 6 7
                left = mid + 2;
            } else {
                // 不相等，则说明单一元素在左边
                // mid = 2，5 6 6 7 7
                right = mid;
            }
        }
        return nums[left];
    }
}
