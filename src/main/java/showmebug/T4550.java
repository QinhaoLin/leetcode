package showmebug;

/**
 * 利用泛型，对整型数组、字符串数组等一些可比较的数据类型进行升序排序
 */
public class T4550 {
    public static void main(String[] args) {
        // 测试整型数组
        Integer[] intArr = {1, 2, 5, 4, 3};
        sort(intArr);
        System.out.println(java.util.Arrays.toString(intArr));  // 输出: [1, 2, 3, 4, 5]

        // 测试字符串数组
        String[] strArr = {"a", "d", "e", "c", "b"};
        sort(strArr);
        System.out.println(java.util.Arrays.toString(strArr));  // 输出: [a, b, c, d, e]
    }

    /**
     * 对数组进行升序排列，并保持原数组顺序不改变（不允许使用 Java 自带的排序方法）
     *
     * @param arr 可比较的泛型数组
     * @param <T> 实现了 Comparable 接口的泛型
     * @return 升序的数组
     */
    public static <T extends Comparable<T>> T[] sort(T[] arr) {
        int n = arr.length;
        // 冒泡排序：比较相邻的元素，如果前一个比后一个大则交换
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            // 第一轮交换
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    swap(arr, j, j + 1);
                    flag = false;
                }
            }
            // 一轮下来没有要交换的，说明是有序的
            if (flag) {
                break;
            }
        }
        return arr;
    }

    private static void swap(Object[] arr, int i, int j) {
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
