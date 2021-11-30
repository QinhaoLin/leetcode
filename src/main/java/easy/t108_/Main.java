package easy.t108_;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-11-30 11:33
 */
public class Main {
    public static void main(String[] args) {

    }

    /**
     * ������ڵ�����������գ��������������нڵ��ֵ��С�����ĸ��ڵ��ֵ��
     * ������ڵ�����������գ��������������нڵ��ֵ���������ĸ��ڵ��ֵ��
     * ����ڵ����������Ҳ�ֱ�Ϊ���������
     *
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    /**
     * �������������ѡ���м�λ����ߵ�������Ϊ���ڵ�
     *
     * @param nums
     * @param left
     * @param right
     * @return
     */
    public TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // ����ѡ���м�λ����ߵ�������Ϊ���ڵ�
        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
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