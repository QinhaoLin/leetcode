package easy.t235;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-12-01 15:51
 */
public class Main {
    public static void main(String[] args) {

    }

    TreeNode res = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lca(root, p, q);
        return res;
    }

    /**
     * 利用二叉搜索树的特点，
     * 如果 p、q 的值都小于 root，说明 p q 肯定在 root 的左子树中；
     * 如果 p q 都大于 root，说明肯定在 root 的右子树中，
     * 如果一个在左一个在右 则说明此时的 root 记为对应的最近公共祖先
     *
     * @param root
     * @param p
     * @param q
     */
    public void lca(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val) {
            lca(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            lca(root.right, p, q);
        } else {
            res = root;
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
