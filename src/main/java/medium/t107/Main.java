package medium.t107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-06-08 11:01
 */
public class Main {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
                // ȡ����һ����Ԫ�أ����ռ��뼯��˳���ӡ��ģ����У�
                TreeNode tempNode = nodes.remove(0);
                list.add(tempNode.val);
                if (tempNode.left != null) {
                    nodes.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    nodes.add(tempNode.right);
                }
            }
            res.add(list);
        }
        Collections.reverse(res);
        return res;
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
}
