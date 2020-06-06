package Interview.t05;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-06 16:37
 */
public class Main {
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println("new Main().replaceSpace() = " + new Main().replaceSpace(s));
    }

    public String replaceSpace(String s) {
        if (s == null) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (' ' == c) {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
