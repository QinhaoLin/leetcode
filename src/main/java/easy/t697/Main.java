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
     * ���ж��� d �����������һЩԪ�� x ���� d �Ρ����ĳЩ�����������ͬ�Ķ�������ôĳЩԪ�� x ������ d �Σ�����̵��������ǽ��� x �ĵ�һ�γ��ֵ����һ�γ��ֵ����顣
     * ���ڸ��������е�ÿ��Ԫ�أ�������֪�� left ������һ�γ��ֵ������� right �������һ�γ��ֵ����������磬�� nums = [1,2,3,2,5] ʱ��left[2] = 1 �� right[2] = 3��
     * Ȼ�󣬶��ڳ��ִ�������ÿ��Ԫ�� x��right[x] - left[x] + 1 �������ǵĺ�ѡ�𰸣����ǽ�ȡ��Щ��ѡ����Сֵ��
     * <p>
     * ���ߣ�LeetCode
     * ���ӣ�https://leetcode-cn.com/problems/degree-of-an-array/solution/shu-zu-de-du-by-leetcode/
     * ��Դ�����ۣ�LeetCode��
     * ����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
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
