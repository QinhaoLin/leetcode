package easy.t1431;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-09 09:53
 */
public class Main {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println("new Main().kidsWithCandies() = " + new Main().kidsWithCandies(candies, extraCandies).toString());
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        if (candies == null || candies.length < 1) {
            return Collections.emptyList();
        }
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }

        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}
