package easy.t404;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-12-08 16:18
 */
public class Main {
    public static void main(String[] args) {

    }

    public int sumOfLeftLeaves(TreeNode root) {
        return root != null ? dfs(root) : 0;
    }

    public int dfs(TreeNode node) {
        int ans = 0;
        if (node.left != null) {
            ans += isLeafNode(node.left) ? node.left.val : dfs(node.left);
        }
        if (node.right != null && !isLeafNode(node.right)) {
            ans += dfs(node.right);
        }
        return ans;
    }

    public boolean isLeafNode(TreeNode node) {
        return node.left == null && node.right == null;
    }

    /**
     * д����
     *
     * @param root
     * @return
     */
    public int sumOfLeftLeaves2(TreeNode root) {
        if (root == null) return 0;
        int res = 0;
        //�жϽڵ��Ƿ�����Ҷ�ӽڵ㣬����������ĺ��ۼ�����
        if (root.left != null && root.left.left == null && root.left.right == null) {
            res += root.left.val;
        }
        return sumOfLeftLeaves2(root.left) + sumOfLeftLeaves2(root.right) + res;
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