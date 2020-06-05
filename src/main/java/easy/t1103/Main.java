package easy.t1103;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-05 17:06
 */
public class Main {

    public static void main(String[] args) {
        int candies = 7;
        int num_people = 4;
        System.out.println("new Main().distributeCandies() = " + Arrays.toString(new Main().distributeCandies(candies, num_people)));
    }

    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int count = 1;
        while (candies > 0) {
            for (int i = 0; i < num_people && candies > 0; i++) {
                if (candies > count) {
                    res[i] += count;
                } else {
                    res[i] += candies;
                }
                candies = candies - count;
                count++;
            }
        }
        return res;
    }
}
