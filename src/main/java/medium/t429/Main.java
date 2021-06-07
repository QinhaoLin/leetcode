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
        // �пմ���
        if (root == null) {
            return res;
        }
        // ������ڵ�
        List<Node> nodes = new ArrayList<>();

        // �Ȱ� root �ڵ�Ž��ڵ㼯��
        nodes.add(root);

        // ����ڵ㼯���нڵ���Ҫ����
        while (!nodes.isEmpty()) {
            // ���ñ������ϴ�С
            int size = nodes.size();
            // �������
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                // ȡ����һ���ڵ㣬���ռ��뼯��˳���ӡ
                Node tempNode = nodes.remove(0);
                // �ѽڵ���Ϣ������Ϣ�ڵ�
                list.add(tempNode.val);

                // �ѽڵ���ӽڵ�Ҳ��������ڵ�
                List<Node> children = tempNode.children;
                for (Node child : children) {
                    if (child == null){
                        continue;
                    }
                    nodes.add(child);
                }
            }
            // �������ݼ����ܵ����ݼ�����
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