package easy.t720_;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-21 14:12
 */
public class Main {

    public static void main(String[] args) {
        // ����:
        // words = ["w","wo","wor","worl", "world"]
        // ���: "world"
        // ����:
        // ����"world"����"w", "wo", "wor", �� "worl"���һ����ĸ��ɡ�
        String[] words = {"a", "worl", "wo", "world", "wor"};
        System.out.println("new Main().longestWord(words) = " + new Main().longestWord(words));
    }

    /**
     * ����һ���ַ�������words��ɵ�һ��Ӣ��ʵ䡣�����ҳ����һ�����ʣ��õ�������words�ʵ����������������һ����ĸ��ɡ�
     * �������ж�����еĴ𰸣��򷵻ش����ֵ�����С�ĵ��ʡ�
     * <p>
     * ���޴𰸣��򷵻ؿ��ַ�����
     *
     * @param words
     * @return
     */
    public String longestWord(String[] words) {
        // ���������������� Set ����ĸ�洢��С�ĵ���һ�������ں����ĵ������档����ֻ��Ҫȡǰ׺��ͬ��
        // ����ĸ����󣬵�һ������һ���ǹ��еģ�����ֻ���ڴ˻��������
        Arrays.sort(words);
        System.out.println("words = " + Arrays.toString(words));
        Set<String> set = new HashSet<>();
        String res = "";
        for (String s : words) {
            // �������ֻ��һ����ĸ����һ���ǹ��е�
            if (s.length() == 1 || set.contains(s.substring(0, s.length() - 1))) {
                res = s.length() > res.length() ? s : res;
                System.out.println("s = " + s);
                set.add(s);
            }
        }
        return res;
    }
}
