package com.itheima.practice;

import java.util.ArrayList;

/*
    ArrayList() 构造一个初始容量为10的空列表

    成员方法：
        添加：
            boolean add(E e) 将指定的元素添加到此列表的尾部
            void add(int index, E element) 将指定的元素插入此列表中指定位置
 */
public class ArrayList01 {
    public static void main(String[] args) {
        //创建ArrayList集合对象
        ArrayList<String> list = new ArrayList<>();

        //调用add方法，添加数据
        list.add("Wang");
        list.add("Meng");
        list.add("Yao");

        list.add(3,"1212");

        System.out.println(list);
    }
}
