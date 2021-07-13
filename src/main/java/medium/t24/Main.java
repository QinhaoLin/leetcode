package medium.t24;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-07-12 18:35
 */
public class Main {
    public static void main(String[] args) {

    }

    /**
     * ����ֹ������������ֹ���������ԣ����ݹ鵽����Ϊ�ջ�������ֻʣһ��Ԫ�ص�ʱ��û�ý����ˣ���Ȼ����ֹ�ˡ�
     * �ҷ���ֵ�����ظ���һ��ݹ��ֵӦ�����Ѿ�������ɺ��������
     * ���εĹ��̣���Ϊ�ݹ����ظ���һ�������飬���ԴӺ���Ͽ��ǣ�ֻ�ÿ���ĳһ������ô��ɵġ�
     * ���Ǽ�������������ڵ�ֱ�Ϊ head �� next��next ��Ӧ�ý�����һ�����ص�������(�ο���2��)��
     * ���൱����һ���������ڵ��������ǰ�����ڵ㣬�ͺܼ��ˣ��벻���׵Ļ���ͼ��ok��
     * <p>
     * https://lyl0724.github.io/2020/01/25/1/
     *
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        // ��ֹ����������ֻʣһ���ڵ����û�ڵ��ˣ�û�ý����ˡ����ص����Ѿ�����õ�����
        if (head == null || head.next == null) {
            return head;
        }
        // һ�������ڵ㣺head, next, swapPairs(next.next)
        // �����������ǽ�����3���ڵ��е�ǰ�����ڵ�
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        // ���ݵڶ��������ظ���һ�����ǵ�ǰ�Ѿ���ɽ����󣬼�������˵�������
        return next;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}