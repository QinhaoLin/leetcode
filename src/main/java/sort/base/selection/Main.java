package sort.base.selection;

import java.util.Arrays;

/**
 * 选择排序
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 1, 3};
        selectionSort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    }

    /**
     * 选择排序
     *
     * @param arr
     */
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        while (n > 1) {
            int pos = findMaxPos(arr, n);
            int temp = arr[pos];
            arr[pos] = arr[n - 1];
            arr[n - 1] = temp;
            n--;
        }
    }

    /**
     * 查找数组中，前 n 个数字中，最大值的索引位置
     *
     * @param arr
     * @param n
     */
    public static int findMaxPos(int arr[], int n) {
        int max = arr[0];
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                pos = i;
            }
        }
        return pos;
    }
}
