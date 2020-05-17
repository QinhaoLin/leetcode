package medium.t3;

public class Main {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("new Main().lengthOfLongestSubstring() = " + new Main().lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现位置的下一个位置
        int[] last = new int[128];
        int res = 0;
        // 窗口开始位置
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index]);
            res = Math.max(res, i - start + 1);
            last[index] = i + 1;
        }

        return res;
    }

}
