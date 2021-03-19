package easy.t412;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-03-19 16:16
 */
public class Main {
    public static void main(String[] args) {
        int n = 15;
        System.out.println("new Main().fizzBuzz(n) = " + new Main().fizzBuzz(n));
    }

    public List<String> fizzBuzz(int n) {
        List<String> li = new ArrayList<>();
        for (Integer i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                li.add("FizzBuzz");
            } else if (i % 3 == 0) {
                li.add("Fizz");
            } else if (i % 5 == 0) {
                li.add("Buzz");
            } else {
                li.add(i.toString());
            }
        }
        return li;
    }

}
