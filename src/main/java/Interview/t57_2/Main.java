package Interview.t57_2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-04 16:50
 */
public class Main {
    public static void main(String[] args) {
        int target = 9;
        //System.out.println("new Main().findContinuousSequence() = " + new Main().findContinuousSequence(target));
        int[][] continuousSequence = new Main().findContinuousSequence(target);
        for (int i = 0; i < continuousSequence.length; i++) {
            System.out.println(Arrays.toString(continuousSequence[i]));
        }
    }

    public int[][] findContinuousSequence(int target) {
        if (target < 3) {
            return null;
        }
        ArrayList<int[]> res = new ArrayList<>();
        int max = target / 2;
        // 左区间
        int left = 1;
        // 右区间
        int right = 1;
        int sum = left;
        while (left <= max) {
            if (sum < target) {
                right++;
                sum += right;
            } else if (sum > target) {
                sum -= left;
                left++;
            } else {
                System.out.println();
                int[] num = new int[right - left + 1];
                for (int x = left, y = 0; x <= right; x++, y++) {
                    num[y] = x;
                }
                res.add(num);
                sum -= left;
                left++;
            }
        }
        // 这里注意奥，为什么是0，看源码
        return res.toArray(new int[0][]);
    }
}
