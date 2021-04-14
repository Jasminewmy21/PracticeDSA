package com.itheima._01Collection集合的遍历方式;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 1.foreach
 *      是一种遍历形式，可以遍历集合或者数组
 *      是迭代器遍历的简化写法
 *
 * 2.foreach遍历，关键是记住格式：
 *      for(被变量集合或数组的元素的类型  变量名称 ：被遍历的集合或数组的名称)
 *
 * 3.小结
 *      foreach遍历集合或数组很方便
 *      缺点：foreach遍历无法知道遍历到了那个元素，因为没有索引
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("Wang");
        lists.add("Meng");
        lists.add("Yao");

        //遍历集合
        for (String str : lists) {
            System.out.println(str);
        }

        //遍历数组
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int num : arr) {
            System.out.println(num);
        }


    }
}

