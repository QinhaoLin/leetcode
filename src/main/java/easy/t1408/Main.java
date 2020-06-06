package easy.t1408;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-06 10:25
 */
public class Main {

    public static void main(String[] args) {
        String[] words = {"leetcode","et","code"};
        System.out.println("new Main().stringMatching() = " + new Main().stringMatching(words).toString());
    }

    public List<String> stringMatching(String[] words) {
        Set<String> set = new HashSet<>();
        int size = words.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i) {
                    continue;
                }
                if (words[j].contains(words[i])) {
                    set.add(words[i]);
                    break;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
