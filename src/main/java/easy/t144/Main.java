package easy.t144;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-06-02 16:06
 */
public class Main {
    public static void main(String[] args) {

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List res = new ArrayList<Integer>();
        preorder(root, res);
        return res;
    }

    public void preorder(TreeNode root, List<Integer> res) {
        if (root == null){
            return;
        }
        // Ç°Ðò±éÀú£¬ÖÐ×óÓÒ
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
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