package easy.t98;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-05-26 17:11
 */
public class Main {
    public static void main(String[] args) {

    }

    /**
     * 方法一
     *
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    public boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) {
            return true;
        }

        // 判断当前节点子树，是不是小于等于当前节点最小子树
        if (min != null && root.val <= min.val) {
            return false;
        }
        // 判断当前节点子树，是不是大于等于当前节点最大子树
        if (max != null && root.val >= max.val) {
            return false;
        }

        // 左子树 是不是都小于最大子树
        // 右子树 是不是都大于最小子树
        return isValidBST(root.left, min, root)
                && isValidBST(root.right, root, max);
    }

    /**
     * 方法二
     *
     * @param root
     * @return
     */
    public boolean isValidBST2(TreeNode root) {
        return isValidBST2(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isValidBST2(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return isValidBST2(root.left, min, root.val) && isValidBST2(root.right, root.val, max);
    }

    /**
     * 错误算法
     * root 需要做的不只是和左右子节点比较，而是要整个左子树和右子树所有节点比较。
     *
     * @param root
     * @return
     */
    public boolean errorIsValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.left.val > root.val) {
            return false;
        }
        if (root.right != null && root.right.val < root.val) {
            return false;
        }
        return errorIsValidBST(root.left) && errorIsValidBST(root.right);
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