package medium.t215;

import java.util.PriorityQueue;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-20 10:40
 */
public class Main {
    public static void main(String[] args) {
        // int[] nums = {3, 2, 1, 5, 6, 4};
        int[] nums = {3, 3, 3, 1};
        int k = 2;
        System.out.println("new Main().findKthLargest() = " + new Main().findKthLargest(nums, k));
    }

    /**
     * 方法一：
     * 思路是创建一个大顶堆，将所有数组中的元素加入堆中，并保持堆的大小小于等于 k
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return 0;
        }
        PriorityQueue<Integer> heap =
                new PriorityQueue<Integer>((n1, n2) -> n1 - n2);

        // 保持堆的大小小于等于 kl
        for (int n : nums) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // output
        return heap.poll();
    }
}
