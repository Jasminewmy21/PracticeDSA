package _练习代码专专用._二叉树;

import _练习代码专专用.LeetCode二叉树.ConstructTree;
import _练习代码专专用.LeetCode二叉树.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 迭代
 */
public class PreOrder02 {
    public static void main(String[] args) {
        Integer[] nums = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1};
        TreeNode root = ConstructTree.constructTree(nums);
//        List<Integer> lists = preOrderTraversal(root);
        List<Integer> lists = preOrderTraversal02(root);
        for (int val : lists) {
            System.out.print(val +" ");
        }
    }
    private static List<Integer> preOrderTraversal (TreeNode root) {
        List<Integer> lists = new ArrayList<>();
        if (root == null) return lists;

        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                lists.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return lists;
    }
    private static List<Integer> preOrderTraversal02 (TreeNode root) {
        List<Integer> lists = new ArrayList<>();
        if (root == null) return lists;

        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            lists.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return lists;
    }
}
