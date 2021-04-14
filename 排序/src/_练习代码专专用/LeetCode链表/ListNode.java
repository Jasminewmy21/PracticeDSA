package _练习代码专专用.LeetCode链表;

public class ListNode {
    private int val;
    private ListNode next;

    ListNode (int val) {
        this.val = val;
    }

    /**
     * 链表节点的构造函数
     * 使用arr为参数,创建一个链表,当前的ListNode为链表头节点
     */
    public ListNode (int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("array cannot be empty.");
        }

        this.val = arr[0];
        ListNode cur = this;
        for (int i = 1; i < arr.length; i++) {
            cur.next =new ListNode(arr[i]);
            cur =cur.next;
        }
    }

    /**
     * 以当前节点为头节点的链表信息字符串,方便查看
     */
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        ListNode cur = this;
        while (cur != null) {
            res.append(cur.val + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
}
