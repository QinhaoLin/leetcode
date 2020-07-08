package easy.t389;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-07-07 17:56
 */
public class Main {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println("new Main().findTheDifference() = " + String.valueOf(new Main().findTheDifference(s, t)));
    }

    public char findTheDifference(String s, String t) {
        char res = 0;
        int lens = s.length();
        for (int i = 0; i < lens; i++) {
            res ^= s.charAt(i) ^ t.charAt(i);
        }
        res ^= t.charAt(lens);
        return res;
    }

    public char findTheDifference2(String s, String t) {
        int[] cont = new int[26];
        for (int i = 0; i < t.length(); i++) {
            cont[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            cont[s.charAt(i) - 'a']--;
        }
        for (int i = 0; i < cont.length; i++) {
            if (cont[i] > 0) {
                return (char) (i + 'a');
            }
        }
        return 'a';
    }
}
