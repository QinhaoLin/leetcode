package easy.t228;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-03-16 15:54
 */
public class Main {
    /**
     * 题意： 将输入数组切分成连续递增的几段，将每段按照指定格式写入结果列表。
     * 示例：
     * 输入：nums = [0, 1, 2, 4, 5, 7]
     * 输出：["0->2", "4->5", "7"]
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 4, 5, 7};
        List<String> list = new Main().summaryRanges(nums);
        System.out.println(list.toString());
    }

    /**
     * 分析： 使用 双指针，i 指向每个区间的起始位置，j 从 i 开始向后遍历直到不满足连续递增（或 j 达到数组边界），
     * 则当前区间结束；然后将 i 指向更新为 j + 1，作为下一个区间的开始位置，j 继续向后遍历找下一个区间的结束位置，
     * 如此循环，直到输入数组遍历完毕。
     *
     * @param nums
     * @return
     */
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        // i 初始指向第 1 个区间的起始位置
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            // j 向后遍历，直到不满足连续递增(即 nums[j] + 1 != nums[j + 1])
            // 或者 j 达到数组边界，则当前连续递增区间 [i, j] 遍历完毕，将其写入结果列表。
            if (j + 1 == nums.length || nums[j] + 1 != nums[j + 1]) {
                // 将当前区间 [i, j] 写入结果列表
                StringBuilder sb = new StringBuilder();
                sb.append(nums[i]);
                if (i != j) {
                    sb.append("->").append(nums[j]);
                }
                res.add(sb.toString());
                // 将 i 指向更新为 j + 1，作为下一个区间的起始位置
                i = j + 1;
            }
        }
        return res;
    }
}
