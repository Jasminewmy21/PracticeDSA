package com.itheima._03List系列集合的使用;

import java.util.LinkedList;

/**
 * LinkedList:底层是基于【链表】的，增删快，查找慢
 * LinkedList支持双链表，定位前后的元素是非常快的，增删首位的元素也是最快的
 * 所以除了拥有List集合的全部功能，还多了很多操作首尾元素的特殊功能
 *      public void addFirst(E e)在该列表开头插入指定的元素。
 *      public void addLast(E e)将指定的元素追加到此列表的末尾。
 *      public E getFirst()返回此列表中的第一个元素。
 *      public E getLast()返回此列表中的最后一个元素。
 *      public E removeFirst()从此列表中删除并返回第一个元素。
 *      public E removeLast()从此列表中删除并返回最后一个元素。
 *      public E pop()从此列表表示的堆栈中弹出一个元素。
 *      --换句话说，删除并返回此列表的第一个元素。此方法相当于removeFirst()
 *      public void push(E e)将元素推送到由此列表表示的堆栈上。
 *      --换句话说，在该列表的前面插入元素。此方法相当于addFirst(E)
 *
 * 小结：
 *      LinkedList支持双链表，定位前后的元素是非常快的，增删首位的元素也是最快的
 *      提供了很对操作首尾的特殊API，可做stack和queue
 *
 *      查询多，增删少就用ArrayList
 *      查询少，增删多就用LinkedList
 */
public class ListDemo03 {
    public static void main(String[] args) {
        //1.用LinkedList做一个队列：先进先出，后进后出
        LinkedList<String> queue = new LinkedList<>();
        //入队往后加
        queue.addLast("1号");
        queue.addLast("2号");
        queue.addLast("3号");
        queue.addLast("4号");
        System.out.println(queue);

        //出队
        queue.removeFirst();
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        //2.做一个栈
        //入栈
        LinkedList<String> stack = new LinkedList<>();
        stack.push("1");//push的底层就是addFirst
        stack.push("2");
        stack.push("3");
        stack.push("4");
        System.out.println(stack);

        //弹栈
        stack.pop();//pop底层就是removeFirst
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
