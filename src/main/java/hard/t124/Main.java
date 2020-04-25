package hard.t124;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-25 16:05
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("new Main().dfs() = " + new Main().dfs(new TreeNode(1)));
    }

    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftSum = Math.max(0, dfs(root.left));
        int rightSum = Math.max(0, dfs(root.right));
        max = Math.max(max, root.val + leftSum + rightSum);
        return Math.max(leftSum, rightSum) + root.val;
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