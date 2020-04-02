package easy.t961;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-02 22:08
 */
public class Main {

    public static void main(String[] args) {
        int[] A = {5, 1, 5, 2, 5, 3, 5, 4};
        System.out.println("new Main().repeatedNTimes() = " + new Main().repeatedNTimes(A));
    }

    /**
     * 有一个数重复N次，而且所有数的个数为2N，因此，也就是说，要求的这个数占了一半。
     * 那么必然可得，一定会出现连续的三个数，其中有两个数相等，也就是所要求的数。
     * 举个例子，比如有数组[1, 2, 4, 5, 3, 3, 3, 3][1,2,4,5,3,3,3,3]，
     * 那么将3打的最散的排列是[1, 3, 2, 3, 4, 3, 5, 3][1,3,2,3,4,3,5,3]。
     * 可以发现无论怎么排，一定会出现三个连续的数，其中存在两个相同的数。
     *
     * @param arr
     * @return
     */
    public int repeatedNTimes(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 2; i++) {
            if (arr[i] == arr[i + 1] || arr[i] == arr[i + 2]) {
                return arr[i];
            }
        }

        // 上面循环没找到，那必然是最后两个数是相等的。 比如：[1, 2, 3, 1]
        return arr[len - 1];
    }
}
