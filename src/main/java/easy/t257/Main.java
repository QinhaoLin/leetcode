package easy.t257;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-12-02 11:00
 */
public class Main {
    public static void main(String[] args) {

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        constructPaths(root, "", paths);
        return paths;
    }

    /**
     * ����������� DFS
     * �����ǰ�ڵ㲻��Ҷ�ӽڵ㣬���ڵ�ǰ��·��ĩβ��Ӹýڵ㣬�������ݹ�����ýڵ��ÿһ�����ӽڵ㡣
     * �����ǰ�ڵ���Ҷ�ӽڵ㣬���ڵ�ǰ·��ĩβ��Ӹýڵ�����Ǿ͵õ���һ���Ӹ��ڵ㵽Ҷ�ӽڵ��·��������·�����뵽�𰸼��ɡ�
     *
     * @param root
     * @param path
     * @param paths
     */
    public void constructPaths(TreeNode root, String path, List<String> paths) {

        if (root == null) {
            return;
        }
        StringBuilder pathSB = new StringBuilder(path);
        pathSB.append(Integer.valueOf(root.val));
        if (root.left == null && root.right == null) {// ��ǰ�ڵ���Ҷ�ӽڵ�
            paths.add(pathSB.toString());// ��·���������
        } else {
            pathSB.append("->");  // ��ǰ�ڵ㲻��Ҷ�ӽڵ㣬�����ݹ����
            constructPaths(root.left, pathSB.toString(), paths);
            constructPaths(root.right, pathSB.toString(), paths);
        }
    }

    /**
     * ����������� BFS
     * ����ά��һ�����У��洢�ڵ��Լ������ýڵ��·����һ��ʼ���������ֻ�и��ڵ㡣
     * ��ÿһ�������У�����ȡ�������е��׽ڵ㣬�������Ҷ�ӽڵ㣬������Ӧ��·�����뵽���С�
     * ���������Ҷ�ӽڵ㣬���������к��ӽڵ���뵽���е�ĩβ��
     * ������Ϊ��ʱ��������������������Ǽ��ܵõ��𰸡�
     *
     * @param root
     * @return
     */
    public List<String> binaryTreePathsBFS(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        if (root == null) {
            return paths;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        Queue<String> pathQueue = new LinkedList<String>();

        nodeQueue.offer(root);
        pathQueue.offer(Integer.toString(root.val));

        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.poll();
            String path = pathQueue.poll();

            if (node.left == null && node.right == null) {
                paths.add(path);
            } else {
                if (node.left != null) {
                    nodeQueue.offer(node.left);
                    pathQueue.offer(new StringBuffer(path).append("->").append(node.left.val).toString());
                }
                if (node.right != null) {
                    nodeQueue.offer(node.right);
                    pathQueue.offer(new StringBuffer(path).append("->").append(node.right.val).toString());
                }
            }
        }
        return paths;
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
}

