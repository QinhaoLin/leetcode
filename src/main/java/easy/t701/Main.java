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
     * 二叉搜索树中的插入操作
     * 如果该子树不为空，则问题转化成了将 val 插入到对应子树上。
     * 否则，在此处新建一个以 val 为值的节点，并链接到其父节点 root 上。
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
//            // BST 中一般不会插入已存在元素
//        }
        // 当前节点的值，小于插入的值，往右子树插
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