package easy.t83;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-23 17:37
 */
public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
//        while (listNode1 != null) {
//            System.out.print(" " + listNode1.val);
//            listNode1 = listNode1.next;
//        }
        new Main().deleteDuplicates(listNode1);
        while (listNode1 != null) {
            System.out.print(" " + listNode1.val);
            listNode1 = listNode1.next;
        }
    }

    /**
     * ÊäÈë: 1->1->2->3->3
     * Êä³ö: 1->2->3
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}