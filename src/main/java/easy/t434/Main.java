package easy.t434;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-05-25 17:42
 */
public class Main {
    public static void main(String[] args) {
        String s = "Hello, my name is John";
        System.out.println("new Main().countSegments(s) = " + new Main().countSegments(s));
    }

    public int countSegments(String s) {
        int segmentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                segmentCount++;
            }
        }

        return segmentCount;
    }
}
