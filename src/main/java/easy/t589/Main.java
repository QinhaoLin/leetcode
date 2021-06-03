package easy.t589;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-06-03 19:00
 */
public class Main {
    public static void main(String[] args) {

    }

    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<Integer>();
        recursion(root, res);
        return res;
    }

    public void recursion(Node root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        for (Node child : root.children) {
            recursion(child, res);
        }
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};