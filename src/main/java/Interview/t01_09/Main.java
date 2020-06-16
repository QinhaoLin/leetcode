package Interview.t01_09;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-12 18:26
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println("new Main().isFlipedString() = " + new Main().isFlipedString(s1, s2));
    }

    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        s1 = s1 + s1;
        if (s1.contains(s2)) {
            return true;
        }
        return false;
    }
}
