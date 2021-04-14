package _练习代码专专用.LeetCode二叉树;

/*

用于测试的树，与上例中相同
      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1

 */
public class PreOrderTestDemo {

    public static void main(String[] args) {
        Integer[] nums = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1};
        TreeNode root = ConstructTree.constructTree(nums);
        preOrder(root);
    }

    private static void preOrder(TreeNode root) {
        if (root == null) return;

        System.out.println(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

}
