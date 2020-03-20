package easy.t459;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-20 17:31
 */
public class Main {
    public static void main(String[] args) {
        String str = "ffabffab";
        System.out.println("new Main().repeatedSubstringPattern() = " + new Main().repeatedSubstringPattern(str));
    }

    /**
     * @param s
     * @return
     */
    public boolean repeatedSubstringPattern(String s) {
        // 假设母串S是由子串s重复N次而成， 则 S+S则有子串s重复2N次， 现在S=Ns， S+S=2Ns 因此S在(S+S)[1:-1]中必出现一次以上
        // S = Ns
        // S+S = 2Ns
        // S = "[abcabc]"，2次"abc"
        // S+S = "[abcabc][abcabc]"，2*2次"abc"
        // (S+S)[1:-1] = "a[bc[abcabc]ab]c"，2次"abc"
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);
    }
}
