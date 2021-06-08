package medium.t103;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-06-08 09:41
 */
public class Main {
    public static void main(String[] args) {
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("list = " + list.toString());
        Collections.reverse(list);
        System.out.println("list = " + list.toString());*/

        TreeNode root = new TreeNode();
        root.val = 3;
        TreeNode treeNode2 = new TreeNode();
        treeNode2.val = 9;
        TreeNode treeNode3 = new TreeNode();
        treeNode3.val = 20;
        TreeNode treeNode4 = new TreeNode();
        treeNode4.val = 15;
        TreeNode treeNode5 = new TreeNode();
        treeNode5.val = 7;

        root.left = treeNode2;
        root.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        Main main = new Main();
        List<List<Integer>> lists = main.zigzagLevelOrder(root);
        for (List<Integer> list : lists) {
            System.out.println("list = " + list.toString());
        }

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        // 判空处理
        if (root == null) {
            return res;
        }
        // 存放遍历节点
        List<TreeNode> nodes = new ArrayList<>();
        // 先把root节点加入节点集合
        nodes.add(root);
        // 遍历深度
        int flag = 0;
        // 如果有节点需要遍历
        while (!nodes.isEmpty()) {
            flag++;
            // 设置遍历集合大小
            int size = nodes.size();
            // 存放当前层次变量的数据
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                // 取出第一个元素
                TreeNode tempNode = nodes.remove(0);
                // 把节点（类似于根节点）信息加入信息集合
                list.add(tempNode.val);
                if (tempNode.left != null) {
                    nodes.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    nodes.add(tempNode.right);
                }
            }
            // 本次数据加入总的数据集合中
            if (flag % 2 == 0) {
                Collections.reverse(list);
            }
            res.add(list);
        }
        return res;
    }

    static class TreeNode {
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


}
