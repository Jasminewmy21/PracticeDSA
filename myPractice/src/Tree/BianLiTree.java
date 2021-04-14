package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的之字形层序遍历
 */
public class BianLiTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;

        ArrayList<ArrayList<Integer>> res = zigzagLevelOrder(root);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }

    public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // write code here
        if (root == null)
            return new ArrayList();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();//用来存放每一层的元素

        queue.add(root);
        int count = 1;
        while (!queue.isEmpty()) {
            int n = queue.size();
            ArrayList<Integer> list = new ArrayList<Integer>();//存放每一层遍历后的元素
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            if (count % 2 != 1) {
                Collections.reverse(list);//偶数层遍历后获得的元素反转
            }
            res.add(list);
            count++;
        }
        return res;
    }
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
}
