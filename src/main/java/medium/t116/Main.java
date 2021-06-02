package medium.t116;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-06-02 15:14
 */
public class Main {
    public static void main(String[] args) {


    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        connectTwoNode(root.left, root.right);
        return root;
    }

    public void connectTwoNode(Node root1, Node root2) {
        // 相邻讲个节点有一个为 null 则跳出，不符合题意连接2个节点
        if (root1 == null || root2 == null) {
            return;
        }
        /**** 前序遍历位置 ****/
        // 将传入的两个节点连接
        root1.next = root2;

        // 连接相同父节点的两个子节点
        connectTwoNode(root1.left, root1.right);
        connectTwoNode(root2.left, root2.right);

        // 连接跨越父节点的两个子节点
        connectTwoNode(root1.right, root2.left);
    }


}


class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};