package easy.t104;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-22 16:20
 */
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode2_left = new TreeNode(2);
        TreeNode treeNode2_right = new TreeNode(3);
        TreeNode treeNode3_left = new TreeNode(4);
        TreeNode treeNode4_left = new TreeNode(5);
        TreeNode treeNode5_left = new TreeNode(6);
        root.left = treeNode2_left;
        root.right = treeNode2_right;
        treeNode2_left.left = treeNode3_left;
        treeNode3_left.left = treeNode4_left;
        treeNode4_left.left = treeNode5_left;
        System.out.println("new Main().maxDepth() = " + new Main().maxDepth(root));
    }

    /**
     * ตÝน้
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int right_height = maxDepth(root.right);
            int left_height = maxDepth(root.left);
            return Math.max(left_height, right_height) + 1;
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
