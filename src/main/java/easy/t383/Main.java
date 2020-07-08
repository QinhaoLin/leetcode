package easy.t383;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-07-07 18:26
 */
public class Main {
    public static void main(String[] args) {
        String ransom = "aac";
        String magazine = "aab";
        System.out.println("new Main().canConstruct() = " + new Main().canConstruct(ransom, magazine));
    }

    /**
     * @param ransom   Êê½ğĞÅ
     * @param magazine ÔÓÖ¾
     * @return
     */
    public boolean canConstruct(String ransom, String magazine) {
        if (magazine.length() < ransom.length()) {
            return false;
        }
        int[] cont = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            cont[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransom.length(); i++) {
            if (--cont[ransom.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
