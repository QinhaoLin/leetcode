package easy.t205;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-28 17:14
 */
public class Main {
    public static void main(String[] args) {
        String s = "ab";
        String t = "aa";
        System.out.println("new Main().isIsomorphic() = " + new Main().isIsomorphic(s, t));
    }

    public boolean isIsomorphic(String s, String t) {
        // ��¼һ���ַ��ϴγ��ֵ�λ�ã���������ַ����е��ַ��ϴγ��ֵ�λ��һ������ô������ͬ����
        int[] preIndexOfS = new int[256];
        int[] preIndexOfT = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char sC = s.charAt(i);
            char tC = t.charAt(i);
            if (preIndexOfS[sC] != preIndexOfT[tC]) {
                return false;
            }
            preIndexOfS[sC] = i + 1;
            preIndexOfT[tC] = i + 1;
        }
        return true;
    }
}
