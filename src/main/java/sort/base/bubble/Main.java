package sort.base.bubble;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 1, 3};
        bubbleSort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

    /**
     * 冒泡排序
     *
     * @param arr
     */
    public static void bubbleSort(int arr[]) {
        for (int i = arr.length; i >= 1; i--) {
            bubble(arr, i);
        }

    }

    /**
     * 对数组前 n 个数字进行冒泡
     *
     * @param arr
     * @param n
     */
    public static void bubble(int arr[], int n) {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
}
