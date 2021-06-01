package easy.t206;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-29 13:47
 */
public class Main {

    public static void main(String[] args) {

    }

    /**
     * ����: 1->2->3->4->5->NULL
     * ���: 5->4->3->2->1->NULL
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        // �ݹ�
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }


    /**
     * ��������ָ�룺 pre �� cur��pre ��ǰ cur �ں�
     * ÿ���� pre �� next ָ�� cur��ʵ��һ�ξֲ���ת
     * �ֲ���ת���֮��pre �� cur ͬʱ��ǰ�ƶ�һ��λ��
     * ѭ���������̣�ֱ�� pre ��������β��
     */

    /**
     *
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        // ����
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
