package easy.t859;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-07-07 16:24
 */
public class Main {
    public static void main(String[] args) {
        String A = "acccccb";
        String B = "bccccca";
        System.out.println("new Main().buddyStrings() = " + new Main().buddyStrings(A, B));
    }

    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        char[] aArray = A.toCharArray();
        char[] bArray = B.toCharArray();
        int[] temp = new int[26];
        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            if (aArray[i] == bArray[i]) {
                temp[aArray[i] - 'a']++;
                continue;
            }
            if (count == 0 && i + 1 < A.length()) {
                for (int j = i + 1; j < A.length(); j++) {
                    if (aArray[j] == bArray[i]) {
                        aArray[j] = aArray[i];
                        count++;
                        continue;
                    }
                }
                if (count == 0) {
                    return false;
                }
            } else {
                return false;
            }
        }
        boolean isRepeat = false;
        for (int i : temp) {
            if (i > 1) {
                isRepeat = true;
                break;
            }
        }
        return count != 0 || isRepeat;
    }
}
