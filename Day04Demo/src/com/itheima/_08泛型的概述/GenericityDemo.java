package com.itheima._08泛型的概述;

import java.util.ArrayList;

/**
 * 什么是泛型？
 *      泛型就是一个标签：<数据类型>
 *      泛型可以在编译阶段约束只能操作某种数据类型
 * 注意：
 *      JDK1.7开始后，泛型后面的申明可以不写
 *      泛型和合集都只支持引用数据类型，不支持基本数据类型
 *
 * 小结：
 *      泛型可以在编译阶段约束只能操作某种数据类型
 *      泛型和合集都只支持引用数据类型，不支持基本数据类型
 *      JDK1.7开始后，泛型后面的申明可以不写
 *
 */
public class GenericityDemo {
    public static void main(String[] args) {
        ArrayList lists = new ArrayList();
        lists.add("Java");
        lists.add(false);
        lists.add(99.9);
        lists.add('a');
        System.out.println(lists);

        ArrayList<String> lists1 = new ArrayList();
        lists1.add("KrisWu");
//        lists1.add(false);不是String类型报错

        ArrayList<Integer> lists2 = new ArrayList<>();
        lists2.add(111);
    }
}
