package easy.t28;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-20 19:24
 */
public class Main {
    public static void main(String[] args) {

        String haystack = "aa";
        String needle = "a";
        System.out.println("new Main().strStr2() = " + new Main().strStr2(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        if (haystack == null || haystack.length() == 0) {
            return -1;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        int needleSize = needle.length();
        int size = haystack.length() - needleSize;
        int i = 0;
        while (i <= size) {
            if (haystack.substring(i, i + needleSize).equals(needle)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int strStr2(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        if (haystack == null || haystack.length() == 0) {
            return -1;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        return haystack.indexOf(needle);
    }
}
