package com.itheima._05Collections工具类;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * java.utils.Collections:是集合的工具类(不是集合类)：此类仅由静态方法组合或返回集合。
 *
 * Collaborations并不属于集合，是用来操作集合的工具类
 * Collaborations有几个常用的API：
 *          public static <T> boolean addAll(Collection<? super T> c, T... elements)
 *          --将所有指定的元素添加到指定的集合。
 *          public static void shuffle(List<?> list) 打乱集合顺序
 *          public static <T> void sort(List<T> list) 将集合中元素按照默认规则排序
 *          public static <T> void sort(List<T> list, Comparator<? super T> c)
 *          --将集合中元素按照
 *
 */
public class CollectionsDemo01 {
    public static void main(String[] args) {
        //1.给集合批量增加元素
        //public static <T> boolean addAll(Collection<? super T> c, T... elements)
        Collection<String> names = new ArrayList<>();
        Collections.addAll(names,"Kris","Wu","Yao","Kim");
        /**
         * 参数1：被添加元素的集合
         * 参数2：可变元素，一批元素
         */

        //2.打乱集合的顺序:只能打乱List系列集合的顺序
        //public static void shuffle(List<?> list)
        List<String> name1 = new ArrayList<>();
        Collections.addAll(name1,"Kris","Wu","Yao","Kim");
        Collections.shuffle(name1);
        System.out.println(name1);

        //2.将集合中元素升序/降序
        // public static void shuffle(List<?> list)
        List<Integer> scores = new ArrayList<>();
        Collections.addAll(scores,12,1212,21,1106,1997,1990);
        Collections.sort(scores);
        System.out.println(scores);//[12, 21, 1106, 1212, 1990, 1997]
        //用TreeSet也可以排序
    }
}
