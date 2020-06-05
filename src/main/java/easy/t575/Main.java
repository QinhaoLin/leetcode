package easy.t575;

import java.util.HashSet;
import java.util.Set;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-05 16:37
 */
public class Main {
    public static void main(String[] args) {
        int[] candies = {1, 1, 2, 2, 3, 3};
        System.out.println("new Main().distributeCandies() = " + new Main().distributeCandies(candies));
    }

    public int distributeCandies(int[] candies) {
        int size = candies.length;
        Set<Integer> set = new HashSet<>(size);
        for (int i = 0; i < size; i++) {
            set.add(candies[i]);
            if (set.size() >= size / 2) {
                return set.size();
            }
        }
        return set.size();
    }

}
