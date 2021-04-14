package com.itheima._04Map集合存储自定义类型;

import java.util.HashMap;
import java.util.Map;

/**
 * Map集合的键和值都可以存储自定义类型
 *
 * 小结:
 *      Map集合的键和值都可以存储自定义类型
 *      如果希望Map集合认为自定义类型的键对象重复了,必须重写对象的hashCode()和equals()方法
 *      HashSet的底层是HashMap,就是把HashMap的key保留,把value去掉
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<Orange,String> maps = new HashMap();
        Orange o1 = new Orange("Red","9.99","2");
        Orange o2 = new Orange("Juicy","19.99","1106");
        Orange o3 = new Orange("Red","9.99","2");
        Orange o4 = new Orange("Green","9.99","2");

        maps.put(o1,"Yao\n");
        maps.put(o2,"Kris\n");
        maps.put(o3,"LA\n");
        maps.put(o4,"21\n");
        System.out.println(maps);


    }
}
