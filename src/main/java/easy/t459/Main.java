package easy.t459;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-20 17:31
 */
public class Main {
    public static void main(String[] args) {
        String str = "ffabffab";
        System.out.println("new Main().repeatedSubstringPattern() = " + new Main().repeatedSubstringPattern(str));
    }

    /**
     * @param s
     * @return
     */
    public boolean repeatedSubstringPattern(String s) {
        // ����ĸ��S�����Ӵ�s�ظ�N�ζ��ɣ� �� S+S�����Ӵ�s�ظ�2N�Σ� ����S=Ns�� S+S=2Ns ���S��(S+S)[1:-1]�бس���һ������
        // S = Ns
        // S+S = 2Ns
        // S = "[abcabc]"��2��"abc"
        // S+S = "[abcabc][abcabc]"��2*2��"abc"
        // (S+S)[1:-1] = "a[bc[abcabc]ab]c"��2��"abc"
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);
    }
}
