package com.itheima._02Map集合的API;

import java.util.*;

/**
 * Map集合的常用API(重点,必须记住)
 *      public V put(K key, V value):把指定的key,value添加到Map集合中
 *      public V remove(Object key):根据key删除键值对,返回value
 *      public V get(Object key)根据指定的键.获取相应的值(返回指定键映射到的值，如果此映射不包含该键的映射，则返回null 。
 *      public Set<K> keySet()获取Map集合中所有的键,存到一个Set集合中(返回此地图中包含的键的Set视图。)
 *      public Collection<V> values()获取Map集合中所有的值,存到一个Collection集合中(返回此地图中包含的值的Collection视图。)
 *      public Set<Map.Entry<K,V>> entrySet()获取Map集合中所有的键值对,存到一个Set集合中(返回此地图中包含的映射的Set视图。)
 *      public boolean containsKey(Object key)判断集中中是否有这个key(如果此映射包含指定键的映射，则返回true 。)
 *      public boolean containsValue(Object value)判断集中中是否有这个value(如果此映射将一个或多个键映射到指定的值，则返回true 。
 *
 *
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        maps.put("手机",10);
        maps.put("电脑",5);
        maps.put("相机",20);
        maps.put("平板",5);
        maps.put(null,null);
        System.out.println(maps);
        System.out.println("----------------------");

        //清空
//        maps.clear();
//        System.out.println(maps);

        //是否为空
        boolean isEmpty = maps.isEmpty();
        System.out.println(isEmpty);
        System.out.println("----------------------");

        //根据键获取对应值
        Integer phone = maps.get("手机");
        System.out.println(phone);
        System.out.println(maps.get("电脑"));
        System.out.println("----------------------");

        //根据键删除整个元素(会返回键的对应值)
        System.out.println(maps.remove("相机"));
        System.out.println(maps);
        System.out.println("----------------------");

        //判断是否包含某个键,包含返回true,反之
        System.out.println(maps.containsKey("平板"));
        System.out.println(maps.containsValue(50));
        System.out.println("----------------------");

        //换取全部键的集合public Set<K> keySet()
        //Map集合的键是无序不重复的,所以返回的也是一个无序不重复的Set集合
        Set<String> keys = maps.keySet();
        for(String key:keys){
            System.out.println(key);
        }
        System.out.println("----------------------");

        //获取全部值的集合:Collection<V> values();
        //因为值是无要求的,可能重复,所以返回一个可以重复的Collection集合
        Collection<Integer> values = maps.values();
        for(Integer value:values){
            System.out.println(value);
        }
        System.out.println("----------------------");

        //集合的大小
        System.out.println(maps.size());

        //合并其他Map集合
        Map<String,Integer> maps2 = new HashMap<>();
        maps2.put("XiaoMi",10);
        maps2.put("Apple",10);
        maps2.put("MEIZU",10);
        maps2.put("手机",200);

        maps.putAll(maps2);
        System.out.println(maps);
    }
}
