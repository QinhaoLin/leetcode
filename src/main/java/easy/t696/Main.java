package easy.t696;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-28 18:04
 */
public class Main {
    public static void main(String[] args) {
        String s = "00110011";
        System.out.println("new Main().countBinarySubstrings() = " + new Main().countBinarySubstrings(s));
    }

    public int countBinarySubstrings(String s) {
        // ��¼ǰһ�����ֳ��ֵĴ���
        int preLen = 0;
        // ��¼��ǰ���ֳ��ֵĴ���
        int curLen = 1;
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            // �жϵ�ǰ�����Ƿ����һ��������ͬ
            if (s.charAt(i) == s.charAt(i - 1)) {
                // ��ͬ����ǰ���ֳ��ֵĴ���cur��1
                curLen++;
            } else {
                // ��ͬ����ǰ������ʵ�ϱ����ǰһ�����֣���ǰ���ֵĴ�������Ϊ1
                preLen = curLen;
                curLen = 1;
            }

            // ǰһ�����ֳ��ֵĴ��� >= ��һ�����ֳ��ֵĴ�������һ�����������������Ӵ�
            // preLen ��¼֮ǰ����0��1��curLen ��¼���ڵ�����1��0��
            // preLen >= curLen������������1��1����ô֮ǰ��1������2����3��0��01��001��0001��������һ�����������Ľ�01��������������
            if (preLen >= curLen) {
                count++;
            }
        }
        return count;
    }

}
