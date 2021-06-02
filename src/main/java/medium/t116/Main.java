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
        // ���ڽ����ڵ���һ��Ϊ null ����������������������2���ڵ�
        if (root1 == null || root2 == null) {
            return;
        }
        /**** ǰ�����λ�� ****/
        // ������������ڵ�����
        root1.next = root2;

        // ������ͬ���ڵ�������ӽڵ�
        connectTwoNode(root1.left, root1.right);
        connectTwoNode(root2.left, root2.right);

        // ���ӿ�Խ���ڵ�������ӽڵ�
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