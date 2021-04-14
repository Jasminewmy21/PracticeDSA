package _练习代码专专用.LeetCode二叉树;

public class CherryTree {
    public static void main(String[] args) {

    }
    /*
     * public class TreeNode {
     *   int val = 0;
     *   TreeNode left = null;
     *   TreeNode right = null;
     *   public TreeNode(int val) {
     *     this.val = val;
     *   }
     * }
     */
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param root TreeNode类
     * @return int整型
     */
    int res = 0;

    public int maxMoney(TreeNode root) {
        if (root == null)
            return res;
        if (isFather(root)) { //judge prize
            if (root.left != null && root.right != null) {
                res += 5;
            } else res += 2;
        }
        maxMoney(root.left);
        maxMoney(root.right);
        return res;
    }

    public boolean isFather(TreeNode root) { // 判断叶子节点的父亲
        if (root.left == null && root.right == null)
            return false;
        if (root.left != null) {
            if (root.left.left != null || root.left.right != null)
                return false;
        }
        if (root.right != null) {
            if (root.right.left != null || root.right.right != null)
                return false;
        }
        return true;
    }
}

