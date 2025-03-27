package test;

/**
 * @fileName: Test
 * @description:
 * @create: 2021-03-09 11:36
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("new Test().test() = " + new Test().test());
    }

    // 2025年3月27日 22:17:22
    // 2
    // 3
    // 4
    // 5
    public int test() {
        int[][] arr = {{1, 7, 3, 4}
                , {4, 2, 5, 1}
                , {9, 5, 1, 8}};
        int[] data = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int[] item = arr[i];
            for (int j = 0; j < item.length; j++) {
                if (i == arr.length - 1) {
                    data[i] = Math.max(data[i], item[j]);
                } else {
                    if (data[i] < item[j] && item[j] < data[i + 1]) {
                        data[i] = item[j];
                    }
                }
            }
        }
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i - 1] >= data[i]) {
                return -1;
            }
            max += data[i];
        }
        return max;
    }
}
