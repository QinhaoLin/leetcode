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
     * 遍历二叉树，每深入一次，sum-根节点的值，当到达叶子节点的时候，判断sum是否等于当前的节点值
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