package medium.t5;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-03-17 09:35
 */
public class Main {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println("new Main().longestPalindrome(s) = " + new Main().longestPalindrome1(s));
    }

    /**
     * ����һ������ƥ�� ��Brute Force��
     * ���ݻ����Ӵ��Ķ��壬ö�����г��ȴ��ڵ��� 22 ���Ӵ��������ж������Ƿ��ǻ��ģ�
     * �ھ���ʵ��ʱ������ֻ��Դ��ڡ���ǰ�õ���������Ӵ����ȡ����Ӵ����С�������֤����
     * �ڼ�¼������Ӵ���ʱ�򣬿���ֻ��¼����ǰ�Ӵ�����ʼλ�á��͡��Ӵ����ȡ�����������ȡ����һ�����Ƿ��ں���ķ�����ʵ�֡�
     *
     * @param s
     * @return
     */
    public String longestPalindrome1(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        int len = s.length();
        int maxLen = 1;
        int begin = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (j - i + 1 > maxLen && validPalindromic(charArray, i, j)) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    /**
     * ��֤�Ӵ� s[left..right] �Ƿ�Ϊ���Ĵ�
     */
    private boolean validPalindromic(char[] charArray, int left, int right) {
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
