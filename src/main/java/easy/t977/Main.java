package easy.t977;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-23 10:55
 */
public class Main {
    public static void main(String[] args) {
        int[] A = {-4, -1, 0, 3, 10};
        System.out.println("new Main().sortedSquares() = " + new Main().sortedSquares(A));
    }

    public int[] sortedSquares(int[] A) {
        int start = 0;
        int end = A.length;
        int i = end - 1;
        int[] nums = new int[end--];
        while (i >= 0) {
            nums[i--] = A[start] * A[start] >= A[end] * A[end] ? A[start] * A[start++] : A[end] * A[end--];
        }
        return nums;
    }
}
