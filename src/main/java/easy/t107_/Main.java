package easy.t107_;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-30 18:16
 */
public class Main {
    public static void main(String[] args) {

    }
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null){
            return res;
        }
        List<Integer> node = new ArrayList<>();
        return res;
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