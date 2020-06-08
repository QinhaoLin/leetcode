package easy.t541;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-08 11:09
 */
public class Main {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 8;
        System.out.println("new Main().reverseStr() = " + new Main().reverseStr(s, k));
    }

    public String reverseStr(String s, int k) {
        if (s == null || k == 0) {
            return s;
        }
        char[] strs = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            reverse(strs, start, k);
            start += 2 * k;
        }
        return String.valueOf(strs);
    }

    private void reverse(char[] strs, int start, int k) {
        int end = start + k - 1;
        if (end > strs.length - 1) {
            end = strs.length - 1;
        }
        while (start < end) {
            char temp = strs[end];
            strs[end] = strs[start];
            strs[start] = temp;
            start++;
            end--;
        }
    }
}
