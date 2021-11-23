package easy.t112;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-11-22 18:04
 */
public class Main {
    public static void main(String[] args) {

    }

    /**
     * ������������ÿ����һ�Σ�sum-���ڵ��ֵ��������Ҷ�ӽڵ��ʱ���ж�sum�Ƿ���ڵ�ǰ�Ľڵ�ֵ
     *
     * @param root
     * @param targetSum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum - root.val == 0;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
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