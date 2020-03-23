package easy.t88;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-23 09:23
 */
public class Main {
    public static void main(String[] args) {
        int[] nums1 = {2, 0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        new Main().merge(nums1, m, nums2, n);
        System.out.println("new Main().merge() = " + Arrays.toString(nums1));
    }

    public void merge(int[] A, int m, int[] B, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                A[i] = B[i];
            }
            return;
        }
        // A 和 B 的两个结尾指针
        int a = m - 1;
        int b = n - 1;
        // 返回结果数组的结尾指针
        int p = m + n - 1;
        while (p >= 0) {
            // 比较 A 和 B 中的两个元素
            // 从 A 数组结尾指针 p 开始往前给 A 数组赋值
            // 在 A 中添加最大的一个，并且所在数组的结尾指针-1，p 不断递减
            if (a < 0) {
                A[p--] = B[b--];
            } else if (b < 0) {
                A[p--] = A[a--];
            } else {
                A[p--] = (B[b] > A[a]) ? B[b--] : A[a--];
            }
        }
    }
}
