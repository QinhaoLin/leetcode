package easy.t701;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-05-27 14:43
 */
public class Main {
    public static void main(String[] args) {

    }

    /**
     * �����������еĲ������
     * �����������Ϊ�գ�������ת�����˽� val ���뵽��Ӧ�����ϡ�
     * �����ڴ˴��½�һ���� val Ϊֵ�Ľڵ㣬�����ӵ��丸�ڵ� root �ϡ�
     *
     * @param root
     * @param val
     * @return
     */
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
        }
//        if (root.val==val){
//            // BST ��һ�㲻������Ѵ���Ԫ��
//        }
        // ��ǰ�ڵ��ֵ��С�ڲ����ֵ������������
        if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        }
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        }
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