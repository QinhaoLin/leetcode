package easy.t1189;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-07-04 10:28
 */
public class Main {
    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        System.out.println("new Main().maxNumberOfBalloons() = " + new Main().maxNumberOfBalloons(text));
    }

    public int maxNumberOfBalloons(String text) {
        // balloon
        int[] count = new int[26];
        for (int i = 0; i < text.length(); i++) {
            count[text.charAt(i) - 'a']++;
        }
        count['l' - 'a'] /= 2;
        count['o' - 'a'] /= 2;
        int res = Integer.MAX_VALUE;
        int[] idx = new int[]{0, 1, 11, 13, 14};
        for (int i : idx) {
            res = Math.min(res, count[i]);
        }
        return res;
    }
}
