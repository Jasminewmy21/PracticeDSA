package com.itheima.practice;

import java.util.ArrayList;

/*
    ArrayList的成员方法：
        1.增:public E add(E element)/public E add(int index, E element)
        2.删:public E remove(int index)
        3.改:public E set(int index,E element)
        4.查:public E get(int index)
        5.集合中元素个数：public int size()
 */
public class ArrayList02 {
    public static void main(String[] args) {
        //创建ArrayList集合对象
        ArrayList<String> list = new ArrayList<>();

        //调用add方法，添加数据
        list.add("Wang");
        list.add("Meng");
        list.add("Yao");

        //删

        //改

        //查
        String s1 = list.get(0);
        String s2 = list.get(1);
        String s3 = list.get(2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //个数
        int size = list.size();
        System.out.println(size);
    }

    private static void testSet(ArrayList<String> list) {
        String set = list.set(0, "1212");
        System.out.println(set);
        System.out.println(list);
    }

    private static void testRemove(ArrayList<String> list) {
        boolean r1 = list.remove("Wang");
        String remove = list.remove(0);
        System.out.println(list);
    }


}
