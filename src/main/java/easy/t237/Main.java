package easy.t237;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-12-02 10:23
 */
public class Main {
    public static void main(String[] args) {

    }

    public void deleteNode(ListNode node) {
        // ��Ȼ������ɾ���Լ����ǾͰ��Լ���ֵ��ɶ��ӣ��ٰѶ��ӵ�λ���ø�����
        node.val = node.next.val;
        node.next = node.next.next;

//        ListNode nodeNext = node.next;
//        node.val = nodeNext.val;
//        node.next = nodeNext.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
