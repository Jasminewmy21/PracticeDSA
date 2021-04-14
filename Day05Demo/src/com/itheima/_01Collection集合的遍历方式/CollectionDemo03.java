package com.itheima._01Collection集合的遍历方式;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Lambda表达式遍历（JDK1.8之后）
 */
public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("Wang");
        lists.add("Meng");
        lists.add("Yao");

        //以下两行是效果一样的
        lists.forEach(s -> System.out.println(s));
        lists.forEach(System.out::println);
    }
}
