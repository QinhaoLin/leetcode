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
        // 都为空的话，显然相同
        if (root1 == null && root2 == null) {
            return true;
        }
        // 一个为空，一个非空，显然不同
        if (root1 == null || root2 == null) {
            return false;
        }
        // 2个都不为 null，但是 val 不同也不行
        if (root1.val != root2.val) {
            return false;
        }
        // root1 和 root2 该比的都比完了，递归比较左右节点
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