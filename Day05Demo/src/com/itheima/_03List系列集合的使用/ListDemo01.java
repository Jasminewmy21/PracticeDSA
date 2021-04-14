package com.itheima._03List系列集合的使用;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合继承了Collection集合的全部功能，同时因为List系列集合有索引
 * ArrayList实现类集合底层基于数组存储数据，查询快，增删慢
 *      public void add(int index,E element)在此列表中的指定位置插入指定的元素。
 *      public E get(int index)返回此列表中指定位置的元素。
 *      public E remove(int index)删除该列表中指定位置的元素。
 *      public E set(int index,E element)用指定的元素替换此列表中指定位置的元素。
 *
 * 小结：
 *      List系列集合有序，可重复，有索引
 *      ArrayList实现类集合底层基于数组存储数据，查询快，增删慢
 *      开发中ArrayList使用最多！！
 */
public class ListDemo01 {
    public static void main(String[] args) {
        //1.创建一个ArrayList集合对象，这是一行经典代码
        List<String> lists = new ArrayList<>();
        lists.add("Java1");
        lists.add("Java1");
        lists.add("Java2");
        lists.add("Java2");
        System.out.println(lists);

        //在某个索引增添元素：public void add(int index,E element)在此列表中的指定位置插入指定的元素
        lists.add(2,"MySQL");
        System.out.println(lists);

        //在某个索引删除元素：public E remove(int index)删除该列表中指定位置的元素。
        lists.remove(2);//lists.remove("MySQL");效果一样
        System.out.println(lists);

        //获得指定索引元素
        lists.get(1);

        //改指定索引处的元素
        lists.set(1,"study");
        System.out.println(lists);
    }
}
