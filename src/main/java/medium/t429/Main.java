package medium.t429;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-06-07 17:55
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.toString());
        list.remove(0);
        System.out.println(list.toString());
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        // 判空处理
        if (root == null) {
            return res;
        }
        // 存放树节点
        List<Node> nodes = new ArrayList<>();

        // 先把 root 节点放进节点集合
        nodes.add(root);

        // 如果节点集合有节点需要遍历
        while (!nodes.isEmpty()) {
            // 设置遍历集合大小
            int size = nodes.size();
            // 存放数据
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                // 取出第一个节点，按照加入集合顺序打印
                Node tempNode = nodes.remove(0);
                // 把节点信息加入信息节点
                list.add(tempNode.val);

                // 把节点的子节点也放入遍历节点
                List<Node> children = tempNode.children;
                for (Node child : children) {
                    if (child == null){
                        continue;
                    }
                    nodes.add(child);
                }
            }
            // 本次数据加入总的数据集合中
            res.add(list);
        }
        return res;
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