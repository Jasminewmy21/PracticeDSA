package _练习代码专专用._二叉树;

import _练习代码专专用.LeetCode二叉树.ConstructTree;
import _练习代码专专用.LeetCode二叉树.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreOrder {
    public static void main(String[] args) {
        Integer[] nums = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1};
        TreeNode root = ConstructTree.constructTree(nums);
        List<Integer> lists = preOrderTraversal(root);
        for (int val : lists) {
            System.out.print(val +" ");
        }
    }
    private static List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preOrder(root, res);
        return res;
    }
    private static List<Integer> preOrder(TreeNode root, List<Integer> lists) {
        if (root == null) return lists;

        lists.add(root.val);
        preOrder(root.left, lists);
        preOrder(root.right, lists);
        return lists;
    }
}
