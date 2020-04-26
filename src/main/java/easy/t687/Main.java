package easy.t687;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-25 16:34
 */
public class Main {

    int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root);
        return max;
    }

    private int dfs(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 0;
        }

        int leftSize = root.left == null ? 0 : dfs(root.left) + 1;
        int rightSize = root.right == null ? 0 : dfs(root.right) + 1;
        if (leftSize > 0 && root.left.val != root.val) {
            // �������߱߳��� �����ǰ�ڵ�����ӽڵ㲻ֵͬ���Ͱѱ߳����¸�ֵΪ0��
            leftSize = 0;
        }
        if (rightSize > 0 && root.right.val != root.val) {
            // ͬ�ϡ�
            rightSize = 0;
        }
        max = Math.max(max, leftSize + rightSize);
        return Math.max(leftSize, rightSize);
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