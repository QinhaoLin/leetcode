package medium.t102;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-06-04 09:33
 */
public class Main {
    public static void main(String[] args) {

    }

    /**
     *  循环
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        // 判空处理
        if (root == null) {
            return res;
        }
        // 这里存放树的节点
        List<TreeNode> nodes = new ArrayList<>();
        // 先把root节点加入节点集合
        nodes.add(root);
        // 如果节点集合有节点需要遍历
        while (!nodes.isEmpty()) {
            // 设置遍历集合大小
            int size = nodes.size();
            // 存放数据
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                // 取出第一集合元素，按照加入集合顺序打印
                TreeNode tempNode = nodes.remove(0);
                // 把节点（类似于根节点）信息加入信息集合
                list.add(tempNode.val);
                if (tempNode.left != null) {
                    // 如果有左孩子先加左孩子
                    nodes.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    // 如果有右孩子加入右孩子
                    nodes.add(tempNode.right);
                }
            }
            // 本次数据加入总的数据集合中
            res.add(list);
        }
        return res;
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