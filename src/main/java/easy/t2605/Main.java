package easy.t2605;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 1, 3};
        int[] nums2 = new int[]{5, 7};
        Main main = new Main();
        int i = main.minNumber(nums1, nums2);
        System.out.println("i = " + i);
    }

    public int minNumber2(int[] nums1, int[] nums2) {
        int a = 0, b = 0;
        for (int num : nums1) {
            a |= 1 << (num - 1);
        }
        for (int num : nums2) {
            b |= 1 << (num - 1);
        }
        int s = a & b, x = s & -s;
        if (x != 0) {
            // return (int) (Math.log10(x)/Math.log() + 1);
        }
        return 0;
    }

    public int minNumber(int[] nums1, int[] nums2) {
        // 1. 判断2个数组中是否存在相同的数字
        int s = same(nums1, nums2);
        if (s != -1) {
            return s;
        }
        // 2. 从2个数组中找到最小的数字，组合成十位数，取最小值
        int x = Arrays.stream(nums1).min().getAsInt();
        int y = Arrays.stream(nums2).min().getAsInt();
        return Math.min(x * 10 + y, y * 10 + x);
    }

    public int same(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<Integer>();
        for (int num : nums1) {
            s.add(num);
        }
        int x = 10;
        for (int num : nums2) {
            if (s.contains(num)) {
                x = Math.min(x, num);
            }
        }
        return x == 10 ? -1 : x;
    }

}
