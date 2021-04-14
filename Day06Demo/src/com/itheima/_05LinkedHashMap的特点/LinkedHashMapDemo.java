package com.itheima._05LinkedHashMap的特点;

import com.itheima._04Map集合存储自定义类型.Orange;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * LinkedHashMap是HashMap的子类
 *      --添加的元素按照键有序,不重复的
 * HashSet集合底层是new了HashMap,相当于是HashMap集合的key都不带value
 * LinkedHashSet集合底层是继承了HashSet,然后HashSet还是new了一个LinkedHashMap,集合相当于是LinkedHashMap集合的键都不带值
 *
 * 底层原理完全一样,都是基于哈希表按照键存储数据的
 * 只是HashMap或LinkedHashMap的键都多了一个附属值(value)
 *
 * 小结:
 *      HashMap集合是无序不重复的键值对集合
 *      LinkedHashMap集合是有序不重复的键值对集合
 *      他们都是基于哈希表存储数据的
 *
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<Orange,String> maps = new LinkedHashMap<>();

        Orange o1 = new Orange("Red","9.99","2");
        Orange o2 = new Orange("Juicy","19.99","1106");
        Orange o3 = new Orange("Red","9.99","2");
        Orange o4 = new Orange("Green","9.99","2");

        maps.put(o1,"1");
        maps.put(o2,"2");
        maps.put(o3,"3");
        maps.put(o4,"4");
        System.out.println(maps);
    }
}
