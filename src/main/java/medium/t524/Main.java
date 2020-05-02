package medium.t524;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "abpcplea";
        List<String> d = new ArrayList<String>();
        d.add("ale");
        d.add("apple");
        d.add("monkey");
        d.add("plea");
        System.out.println("new Main().findLongestWord() = " + new Main().findLongestWord(s, d));
    }

    public String findLongestWord(String s, List<String> d) {
        String longestWord = "";
        for (String target : d) {
            int l1 = longestWord.length();
            int l2 = target.length();
            // ��ַ������ȴ��ڵ�ǰ�ַ������ȣ�������ַ����Ѿ�������ǰ�ַ���
            // ����ֱ�� longestWord.equals(target)����ĿҪ������ж����ͬ���ȵĽ���������ֵ������С�ַ�������
            // compareTo()��������ͬ,�ӵ�һλ��ʼ�Ƚϣ������ͬ����0�������ͬ�����Ϸ����������ַ��� ascii ֵ�Ĳ�ֵ��
            if (l1 > l2 || (l1 == l2 && longestWord.compareTo(target) < 0)) {
                continue;
            }
            if (isSubstr(s, target)) {
                longestWord = target;
            }
        }
        return longestWord;
    }

    private boolean isSubstr(String s, String target) {
        int iIdx = 0, targetIdx = 0;
        // �����ַ��� s ��ÿһλ���ַ��� target ��ÿһλ�Ƚ�
        // ��� target ÿһλ���в�һ���ģ����������� s �ַ�������һλ�Ƚ�
        // ��������� target �������ַ��������� s �У��򷵻� true
        while (iIdx < s.length() && targetIdx < target.length()) {
            if (s.charAt(iIdx) == target.charAt(targetIdx)) {
                targetIdx++;
            }
            iIdx++;
        }
        return targetIdx == target.length();
    }
}
