package easy.t100;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-05-26 15:04
 */
public class Main {
    public static void main(String[] args) {

    }

    public boolean isSameTree(TreeNode root1, TreeNode root2) {
        // ��Ϊ�յĻ�����Ȼ��ͬ
        if (root1 == null && root2 == null) {
            return true;
        }
        // һ��Ϊ�գ�һ���ǿգ���Ȼ��ͬ
        if (root1 == null || root2 == null) {
            return false;
        }
        // 2������Ϊ null������ val ��ͬҲ����
        if (root1.val != root2.val) {
            return false;
        }
        // root1 �� root2 �ñȵĶ������ˣ��ݹ�Ƚ����ҽڵ�
        return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
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