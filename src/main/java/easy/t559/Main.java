package easy.t559;

import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-06-08 14:16
 */
public class Main {
    public static void main(String[] args) {

    }

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        Integer maxDepth = 0;
        List<Node> list = root.children;
        if (list != null) {
            for (Node node : list) {
                maxDepth = Math.max(maxDepth(node), maxDepth);
            }
        }
        return maxDepth + 1;
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