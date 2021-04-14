package com.itheima._01Map集合的概述;

import java.util.HashMap;
import java.util.Map;

/**
 * 集合:
 *      Collection(单值集合)
 *      Map(键值对集合)
 *
 * Map集合是另一个[集合]体系
 * Collection是[单值集合]体系
 *
 * Map集合是一种[键值对集合],每个元素包含两个值
 * Map集合的每个元素的格式:key=value(键值对元素)
 *
 * map集合的完整格式:{key1=value1, key2=value2, key3=value3, ...}
 *
 * Map集合有啥用?
 *      1.Map集合存储的信息更加具体丰富
 *          Collection:["Kris","广州","男","歌手",30,"LA"];信息不清楚,不知道是代表什么
 *          Map:{name="Kris", address="广州",...}
 *      2.Map集合很适合做购物车之类的系统
 *
 *      注意:集合和泛型都只能支持[引用数据类型],集合完全可以称为是对象容器,存储的都是对象
 *
 * Map集合的体系:
 *              Map<K,V>(接口,Map集合的祖宗类)
 *          /                               \
 *      TreeMap<K,V>                    HashMap<K,V> (实现类,经典的,用的最多)
 *                                             \
 *                                          LinkedHashMap<K,V> (实现类)
 *
 * Map集合特点:
 *      1.Map集合的特点都是由决定的
 *      2.Map集合的键是无序,不重复,无索引的
 *          Map集合后面重复的间对应的元素会覆盖前面的整个元素
 *      3.Map集合的值无要求
 *      4.Map集合的键值对都可以为null
 *
 *      HashMap的键是无序,不重复,无索引的,值无要求
 *      LinkedHashMap的键是有序,不重复,无索引的,值无要求
 */
public class MapDemo {
    public static void main(String[] args) {
        //一行经典代码,多态形式
        Map<String, Integer> maps = new HashMap<>();
        maps.put("上衣",10);
        maps.put("裤子",5);
        maps.put("衬衫",20);
        maps.put("袜子",2);
        maps.put(null,null);//键值对都可以为空
        maps.put("上衣",20);//键值对都可以为空
        System.out.println(maps);//{上衣=20, null=null, 袜子=2, 裤子=5, 衬衫=20}
    }
}
