package easy.t234;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-12-01 16:26
 */
public class Main {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        // 字符串的形式，因为 val 是 0~9
        StringBuffer str = new StringBuffer();
        ListNode point = head;
        while (point != null) {
            str.append(point.val);
            point = point.next;
        }
        String str1 = str.toString();
        String str2 = str.reverse().toString();
        return str1.equals(str2);
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
