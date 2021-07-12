package medium.t275;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-07-12 18:09
 */
public class Main {
    public static void main(String[] args) {
        int[] citations = new int[]{0, 1, 3, 5, 6};
        System.out.println("new Main().hIndex(citations) = " + new Main().hIndex(citations));
    }


    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (citations[mid] >= n - mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return n - left;
    }
}
