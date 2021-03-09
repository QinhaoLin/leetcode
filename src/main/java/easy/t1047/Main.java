package easy.t1047;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-03-09 10:43
 */
public class Main {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println("new Main().removeDuplicates(s) = " + new Main().removeDuplicates(s));
    }

    /**
     * ˼·��ά��һ��ջ����ջʱ�ж���ջԪ����ջ��Ԫ���Ƿ���ͬ����ͬ���Ƴ���ǰջ��
     *
     * @param S
     * @return
     */
    public String removeDuplicates(String S) {
        if (S == null || S.length() < 2) {
            return S;
        }
        StringBuilder stack = new StringBuilder();
        int top = -1;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (top >= 0 && stack.charAt(top) == ch) {
                stack.deleteCharAt(top);
                top--;
            } else {
                stack.append(ch);
                top++;
            }
        }
        return stack.toString();
    }



}
