package easy.t557;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-08 10:48
 */
public class Main {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println("new Main().reverseWords(s) = " + new Main().reverseWords(s));
    }


    public String reverseWords(String s) {
        if (s == null) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        String[] strs = s.split(" ");
        for (int i = 0; i < strs.length; i++) {
            sb.append(reverse(strs[i])).append(" ");
        }
        return sb.toString().trim();
    }

    private String reverse(String str) {
        if (str == null) {
            return "";
        }
        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            char temp = chars[j];
            chars[j] = chars[i];
            chars[i] = temp;
            i++;
            j--;
        }
        return String.valueOf(chars);
    }
}
