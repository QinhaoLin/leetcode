package sort.base.insertion;

import java.util.Arrays;

/**
 * 插入排序
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 1, 3};
        insertionSort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            insert(arr, i);
        }

    }

    public static void insert(int[] arr, int n) {
        int value = arr[n];
        while (arr[n - 1] > value) {
            arr[n] = arr[n - 1];
            n--;
            if (n == 0) {
                break;
            }
        }
        arr[n] = value;
    }
}
