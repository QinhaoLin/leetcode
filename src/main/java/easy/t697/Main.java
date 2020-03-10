package easy.t697;

import java.util.HashMap;
import java.util.Map;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-10 10:45
 */
public class Main {
    public static void main(String[] args) {
        int[] test = {1, 2, 2, 2, 3, 3, 1};
        System.out.println("new Main().findShortestSubArray(test) = " + new Main().findShortestSubArray(test));
    }

    /**
     * 具有度数 d 的数组必须有一些元素 x 出现 d 次。如果某些子数组具有相同的度数，那么某些元素 x （出现 d 次）。最短的子数组是将从 x 的第一次出现到最后一次出现的数组。
     * 对于给定数组中的每个元素，让我们知道 left 是它第一次出现的索引； right 是它最后一次出现的索引。例如，当 nums = [1,2,3,2,5] 时，left[2] = 1 和 right[2] = 3。
     * 然后，对于出现次数最多的每个元素 x，right[x] - left[x] + 1 将是我们的候选答案，我们将取这些候选的最小值。
     * <p>
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/degree-of-an-array/solution/shu-zu-de-du-by-leetcode/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param nums
     * @return
     */
    public int findShortestSubArray(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int n = nums.length;
        Integer maxCount = 0;
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        Map<Integer, Integer> left = new HashMap<Integer, Integer>();
        Map<Integer, Integer> right = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (left.get(num) == null) {
                left.put(num, i);
            }
            right.put(num, i);
            count.put(num, count.getOrDefault(num, 0) + 1);
            maxCount = Math.max(maxCount, count.getOrDefault(num, 0));
        }
        for (Integer key : count.keySet()) {
            if (count.get(key).equals(maxCount)) {
                n = Math.min(n, right.get(key) - left.get(key) + 1);
            }

        }
        return n;
    }
}
