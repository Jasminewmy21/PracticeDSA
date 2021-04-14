package _练习代码专专用._链表;

/**
 * 单链表类
 */
public class SLinkList {
    private ListNode head;//表头
    private int size = 0;

    public SLinkList() {
        this.head = null;
    }


    //在链表头部添加结点
    public boolean addHead(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        return true;
    }

    //在链表头部删除结点

    public boolean insert(int index, int val) {
        return false;
    }


    public boolean remove(int index) {
        return false;
    }


    public ListNode getNode(int index) {
        return null;
    }


    public void set(int index, int val) {

    }

    public int length() {
        return 0;
    }

    public boolean isEmpty() {
        if (head.getNext() == null) {
            return true;
        } else {
            return false;
        }
    }

    public ListNode get(int index) {
        return null;
    }
}
