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
     * 输入: 1->2->3->4->5->NULL
     * 输出: 5->4->3->2->1->NULL
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        // 递归
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }


    /**
     * 定义两个指针： pre 和 cur；pre 在前 cur 在后。
     * 每次让 pre 的 next 指向 cur，实现一次局部反转
     * 局部反转完成之后，pre 和 cur 同时往前移动一个位置
     * 循环上述过程，直至 pre 到达链表尾部
     */

    /**
     *
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        // 迭代
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
