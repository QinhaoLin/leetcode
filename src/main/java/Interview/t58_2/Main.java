package Interview.t58_2;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-06 16:54
 */
public class Main {


    public static void main(String[] args) {
        String s = "abcdefg";
        int n = 2;
        System.out.println("new Main().reverseLeftWords() = " + new Main().reverseLeftWords(s, n));
    }

    public String reverseLeftWords(String s, int n) {
        if (s == null) return null;
        if (n == 0) return s;
        return s.substring(n) + s.substring(0, n);
    }
}
