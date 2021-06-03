package easy.t590;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-06-03 19:15
 */
public class Main {
    public static void main(String[] args) {

    }

    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<Integer>();
        postscript(root, res);
        return res;
    }

    public void postscript(Node root, List<Integer> res) {
        if (root == null) {
            return;
        }
        for (Node child : root.children) {
            postscript(child, res);
        }
        res.add(root.val);
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
}
