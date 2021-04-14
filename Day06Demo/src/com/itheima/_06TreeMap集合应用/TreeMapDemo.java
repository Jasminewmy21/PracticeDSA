package com.itheima._06TreeMap集合应用;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap集合按照key是可排序不重复的键值对合计(默认升序)
 * TreeMap集合按照key排序的特点与TreeSet是完全一样的
 *      --TreeSet的底层就是基于TreeMap
 * 小结:
 *      TreeMap集合和TreeSet集合都是排序不重复集合
 *      TreeSet集合的底层是基于TreeMap,只是key没有附属值(value)
 *      所以TreeMap集合指定大小规则有两种方式:
 *      --1.对象的类实现Comparable接口,重写必将方法
 *      --2.为集合设置比较器Comparator对象,重写比较方法
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Pig,String> pigs = new TreeMap<>();

        pigs.put(new Pig("小猪佩奇",3.99,100.0),"LA");
        pigs.put(new Pig("荷兰猪",3.99,80.0),"LA");
        pigs.put(new Pig("野猪",3.99,100.0),"LA");

        System.out.println(pigs);

        Map<Pig,Integer> pigs1 = new TreeMap<>(new Comparator<Pig>() {
            @Override
            public int compare(Pig o1, Pig o2) {
                return Double.compare(o1.getPrice(), o2.getPrice()) ;
            }
        });

        pigs1.put(new Pig("小猪佩奇",4.99,100.0),1);
        pigs1.put(new Pig("荷兰猪",4.99,80.0),2);
        pigs1.put(new Pig("野猪",3.99,100.0),3);
        pigs1.put(new Pig("野猪",3.99,100.0),3);
        System.out.println(pigs1);
    }
}
