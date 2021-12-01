package easy.t235;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-12-01 15:51
 */
public class Main {
    public static void main(String[] args) {

    }

    TreeNode res = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lca(root, p, q);
        return res;
    }

    /**
     * ���ö������������ص㣬
     * ��� p��q ��ֵ��С�� root��˵�� p q �϶��� root ���������У�
     * ��� p q ������ root��˵���϶��� root ���������У�
     * ���һ������һ������ ��˵����ʱ�� root ��Ϊ��Ӧ�������������
     *
     * @param root
     * @param p
     * @param q
     */
    public void lca(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val) {
            lca(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            lca(root.right, p, q);
        } else {
            res = root;
        }
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
