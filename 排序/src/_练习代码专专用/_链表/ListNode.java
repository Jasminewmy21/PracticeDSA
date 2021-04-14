package _练习代码专专用._链表;

/**
 * 单链表节点类
 */
public class ListNode {
    private int val;
    private ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    //显示该节点的数据
    public void display() {
        System.out.println("[" + val + "] ");
    }
}
