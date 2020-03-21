package easy.t605;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-21 17:36
 */
public class Main {
    public static void main(String[] args) {
        // int[] flowerbed = {1, 0, 1, 0, 1, 0, 1};
        int[] flowerbed = {0, 0, 0, 0, 1};
        int n = 2;
        System.out.println("new Main().canPlaceFlowers() = " + new Main().canPlaceFlowers(flowerbed, n));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int total = 0;
        int start = -1;
        if (flowerbed.length == 1 && flowerbed[0] == 0 && n == 1) {
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                continue;
            }
            if (start == -1 && i - start > 2) {
                total += ((i - start - 1) / 2) + ((i - start - 1) % 2);
            } else if (i - start > 3) {
                total += ((i - start - 1) / 2) + ((i - start - 1) % 2) - 1;
            }
            start = i;
        }
        if (flowerbed.length - start >= 3) {
            total += ((flowerbed.length - start - 1) / 2) + ((flowerbed.length - start - 1) % 2);
        }
        return total >= n;
    }
}
