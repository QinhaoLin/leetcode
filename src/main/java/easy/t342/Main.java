package easy.t342;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-03-15 17:33
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("new Main().isPowerOfFour(4) = " + new Main().isPowerOfFour(4));
    }

    public boolean isPowerOfFour(int n) {
        String str = Integer.toBinaryString(n);
        str = str.replace("00", "");
        return "1".equals(str);
    }
}
