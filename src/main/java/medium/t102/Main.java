package medium.t102;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-06-04 09:33
 */
public class Main {
    public static void main(String[] args) {

    }

    /**
     *  ѭ��
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        // �пմ���
        if (root == null) {
            return res;
        }
        // ���������Ľڵ�
        List<TreeNode> nodes = new ArrayList<>();
        // �Ȱ�root�ڵ����ڵ㼯��
        nodes.add(root);
        // ����ڵ㼯���нڵ���Ҫ����
        while (!nodes.isEmpty()) {
            // ���ñ������ϴ�С
            int size = nodes.size();
            // �������
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                // ȡ����һ����Ԫ�أ����ռ��뼯��˳���ӡ
                TreeNode tempNode = nodes.remove(0);
                // �ѽڵ㣨�����ڸ��ڵ㣩��Ϣ������Ϣ����
                list.add(tempNode.val);
                if (tempNode.left != null) {
                    // ����������ȼ�����
                    nodes.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    // ������Һ��Ӽ����Һ���
                    nodes.add(tempNode.right);
                }
            }
            // �������ݼ����ܵ����ݼ�����
            res.add(list);
        }
        return res;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}