package com.itheima._14Collenction集合的概述;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 什么是集合？
 *      集合是一个大小可变的容器
 *      容器中的每个数据称为一个元素  数据==元素
 *      集合的特点：
 *          类型可以不确定，大小不固定
 *          集合有很多种，不同的集合特点和使用场景不同
 *      数组：类型的长度一旦定义出来就固定了
 *
 * 集合有啥用：
 *      在开发中，很多时候元素的个数是不确定的
 *      经常要进行元素的增删改查操作，集合都是非常适合的
 *      开发中集合用的更多
 *
 * Java中集合的代表是：Collection
 * Collection集合是Java中集合的祖宗类
 * 学习Collection集合的功能，那么一切集合都可以用这些功能
 *
 * Collection集合的体系：
 *                                       Collection<E>(Interface)
 *                       /                                               \
 *                  Set<E>(Interface)                                              List<E>(Interface)
 *               /                     \                                /               \                    \
 *          HashSet<E>(实现类)         TreeSet<E>(实现类)       ArrayList<E>(实现类)   LinkedList<E>(实现类)  Vector(线程安全)
 *           /
 *      LinkedHashSet<>(实现类)
 *
 * 集合特点：
 *      Set系列集合：添加的元素是【无序、不重复、无索引】
 *      --HashSet：添加的元素是【无序、不重复、无索引】
 *      --LinkedHashSet:添加的元素是【有序、不重复、无索引】
 *      --TreeSet：添加的元素是【按照大小默认升序排序、不重复、无索引】
 *
 *      List系列集合：添加的元素是【有序、可重复、有索引】
 *      --ArrayList：添加的元素是【有序、可重复、有索引】
 *      --LinkedList：添加的元素是【有序、可重复、有索引】
 *      ArrayList、LinkedList在效果上是一样的，但是【在底层性能、怎么存数据是有差别的】
 *
 * 小结：Collection是集合的祖宗类， collection集合的功能是一切集合都可以【直接】使用的
 */

 public class CollectionDemo01{
    public static void main(String[] args) {
        //多态写法
        //HashSet：添加的元素是【无序、不重复、无索引】
        Collection<String> sets = new HashSet<>();
        sets.add("1");
        sets.add("1");
        sets.add("2");
        sets.add("3");
        sets.add("4");
        sets.add("5");
        sets.add("6");
        sets.add("7");
        sets.add("8");
        sets.add("9");
        sets.add("find");
        sets.add("you");
        //[1, 2, 3, 4, 5, 6, find, 7, 8, 9, you]
        System.out.println(sets);

        Collection<String> lists = new ArrayList<>();
        lists.add("1");
        lists.add("2");
        lists.add("3");
        lists.add("4");
        lists.add("Kris");
        lists.add("Wu");
        System.out.println(lists);

    }
 }
