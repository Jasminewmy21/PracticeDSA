package com.itheima._03List系列集合的使用;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ArrayList实现类集合底层基于【数组】存储数据，查询快，增删慢
 *
 * 拓展：List系列集合遍历方式有4种，之前Collection的三种＋索引for循环
 *
 */
public class ListDemo02 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("Kris");
        lists.add("Wu");
        lists.add("La");

        //1.for循环
        for (int i=0; i<lists.size(); i++){
            String ele = lists.get(i);
            System.out.println(ele);
        }
        System.out.println("--------------");

        //2.迭代器
        Iterator<String> it = lists.iterator();
        while(it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }
        System.out.println("--------------");


        //3.foreach
        for (String ele : lists) {
            System.out.println(ele);
        }
        System.out.println("--------------");


        //4.JDK1.8开始后，Lambda表达式
        lists.forEach(s -> System.out.println(s));
    }
}
