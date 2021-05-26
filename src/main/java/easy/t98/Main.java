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
     * ����һ
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

        // �жϵ�ǰ�ڵ��������ǲ���С�ڵ��ڵ�ǰ�ڵ���С����
        if (min != null && root.val <= min.val) {
            return false;
        }
        // �жϵ�ǰ�ڵ��������ǲ��Ǵ��ڵ��ڵ�ǰ�ڵ��������
        if (max != null && root.val >= max.val) {
            return false;
        }

        // ������ �ǲ��Ƕ�С���������
        // ������ �ǲ��Ƕ�������С����
        return isValidBST(root.left, min, root)
                && isValidBST(root.right, root, max);
    }

    /**
     * ������
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
     * �����㷨
     * root ��Ҫ���Ĳ�ֻ�Ǻ������ӽڵ�Ƚϣ�����Ҫ���������������������нڵ�Ƚϡ�
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