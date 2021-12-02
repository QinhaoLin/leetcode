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
        // 既然不能先删除自己，那就把自己的值变成儿子，再把儿子的位置让给孙子
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
