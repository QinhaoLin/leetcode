package Interview.t01_02;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-09 10:06
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bad";
        System.out.println("new Main().CheckPermutation(s1,s2) = " + new Main().CheckPermutation(s1, s2));
    }

    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] counter = new int[126];
        char[] chars1 = s1.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            counter[chars1[i]]++;
        }
        char[] chars2 = s2.toCharArray();
        for (int i = 0; i < chars2.length; i++) {
            counter[chars2[i]]--;
        }
        for (int i : counter) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
