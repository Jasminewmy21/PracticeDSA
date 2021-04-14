package com.itheima._03Map集合的遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map遍历的方式:3种
 *      1.键找值:先获取Map集合所有的key,通过key找value
 *      2.键值对:难度大
 *      3.JDK1.8开始后新技术,Lambda表达式(暂时了解)
 *
 *      1.键找值:
 *      --a.获取当前Map集合的全部键的集合
 *      --b.通过遍历key,找value
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        maps.put("手机",10);
        maps.put("电脑",5);
        maps.put("相机",20);
        maps.put("平板",5);
        System.out.println(maps);

        /**1.键找值的方式遍历*/
        //a.获取当前Map集合的全部键的集合
        Set<String> keys = maps.keySet();

        //b.通过遍历key,找value
        for(String key : keys) {
            Integer value = maps.get(key);
            System.out.println(key + "->" +value);
        }
    }
}
