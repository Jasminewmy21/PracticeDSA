package com.itheima._03Map集合的遍历;

import java.util.HashMap;
import java.util.Map;

/**
 * Lambda表达式遍历Map集合
 *      LTS(Long Time Support)
 *      JDK 11是最新的支持版(2019的Java视频)
 */
public class MapDemo03 {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        maps.put("手机",100);
        maps.put("电脑",50);
        maps.put("相机",20);
        maps.put("平板",5);
        System.out.println(maps);

        maps.forEach((k,v) -> System.out.println(k + "-" + v));
    }
}
