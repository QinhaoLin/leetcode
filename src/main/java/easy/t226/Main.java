package easy.t226;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-06-01 09:55
 */
public class Main {
    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        /**** ǰ�����λ�� ****/
        // root �ڵ���Ҫ�������������ӽڵ�
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // �������ӽڵ������ת���ǵ��ӽڵ�
        invertTree(root.left);
        invertTree(root.right);
        return root;
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