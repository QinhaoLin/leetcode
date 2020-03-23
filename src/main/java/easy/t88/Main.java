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
        // A �� B ��������βָ��
        int a = m - 1;
        int b = n - 1;
        // ���ؽ������Ľ�βָ��
        int p = m + n - 1;
        while (p >= 0) {
            // �Ƚ� A �� B �е�����Ԫ��
            // �� A �����βָ�� p ��ʼ��ǰ�� A ���鸳ֵ
            // �� A ���������һ����������������Ľ�βָ��-1��p ���ϵݼ�
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
