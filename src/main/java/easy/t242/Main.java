package easy.t242;

public class Main {
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {
        char[] chs = new char[127];
        for (char c : s.toCharArray()) {
            chs[c]++;
        }
        for (char c : t.toCharArray()) {
            chs[c]--;
        }
        for (int num : chs) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

}
