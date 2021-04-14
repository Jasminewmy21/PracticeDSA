package com.itheima._03Map集合的遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        maps.put("手机",100);
        maps.put("电脑",5);
        maps.put("相机",20);
        maps.put("平板",5);
        System.out.println(maps);

        /**2.键值对(更面向对象,更复杂)
         * 想把键值对当作一个整体遍历,也就是直接使用foreach遍历
         * for(被便利集合的元素类型 变量 : 集合名称){
         *
         *  }
         *  但是Map集合的键值对数据是一个整体,没有元素类型,foreach无法直接遍历Map集合
         *  👇
         *  把Map集合通过API:public Set<Map.Entry<K,V>> entrySet()返回一个Set集合
         *  👇
         *  Set<Map.Entry<String,Integer>> entries = maps.entrySet();
         *  👇
         *  entries = [("手机"=100),(...),(...),...]
         *  👇
         *  Set集合会把元素类型变成一个Map的实体类型:Map.Entry<String,Integer>
         *
         */
        Set<Map.Entry<String,Integer>> entries = maps.entrySet();

        for(Map.Entry<String,Integer> entry : entries){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "->" + value);
        }
    }
}
