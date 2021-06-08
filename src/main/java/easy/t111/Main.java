package easy.t111;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-06-08 11:48
 */
public class Main {
    public static void main(String[] args) {

    }

    /**
     * �����������
     * ���ȿ����뵽ʹ��������������ķ�������������������¼��С��ȡ�
     * ����ÿһ����Ҷ�ӽڵ㣬����ֻ��Ҫ�ֱ������������������СҶ�ӽڵ���ȡ������ͽ�һ��������ת��Ϊ��С���⣬���Եݹ�ؽ�������⡣
     *
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int min_depth = Integer.MAX_VALUE;
        if (root.left != null) {
            min_depth = Math.min(minDepth(root.left), min_depth);
        }
        if (root.right != null) {
            min_depth = Math.min(minDepth(root.right), min_depth);
        }
        return min_depth + 1;
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