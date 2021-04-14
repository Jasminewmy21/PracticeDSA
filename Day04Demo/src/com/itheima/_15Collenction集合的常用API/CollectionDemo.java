package com.itheima._15Collenction集合的常用API;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * Collection是集合的祖宗类，它的功能是全部集合都可以继承使用的，所以要学习
 *
 * Collection常用API：
 *      public boolean add(E e)：添加元素到当前集合
 *      public void clear()：清空集合所有元素
 *      public boolean remove(Object o):从该集合中删除指定元素的单个实例（如果存在）
 *      public boolean contains(Object o)此集合包含指定的元素，则返回true
 *      public boolean isEmpty()如果此集合不包含元素，则返回 true 。
 *      public int size()返回此集合中的元素数。
 *      public Object[] toArray() 返回一个包含此集合中所有元素的数组
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> sets = new HashSet<>();
        sets.add("Kris Wu");
        sets.add("James Dean");
        sets.add("Kendall Jenner");
        sets.add("Jennie Kim");

        Collection<String> sets1 = new HashSet<>();
        sets1.add("Post Malone");

        sets.addAll(sets1);
        System.out.println(sets);//出来直接是内容，说明重写了toString方法
        System.out.println("-----------");

        //把集合转换成数组
        Object[] arrs = sets.toArray();
        System.out.println("数组：" + Arrays.toString(arrs));

        String[] arrs1 = sets.toArray(String[] :: new);
        System.out.println("数组：" + Arrays.toString(arrs1));


    }
}
