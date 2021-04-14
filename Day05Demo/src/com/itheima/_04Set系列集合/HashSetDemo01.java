package com.itheima._04Set系列集合;
/**
 * Collection集合的体系：
 *  *                                   Collection<E>(Interface)
 *  *                       /                                               \
 *  *                  Set<E>(Interface)                                              List<E>(Interface)
 *  *               /                     \                                /               \                    \
 *  *          HashSet<E>(实现类)         TreeSet<E>(实现类)       ArrayList<E>(实现类)   LinkedList<E>(实现类)  Vector(线程安全)
 *  *           /
 *  *      LinkedHashSet<>(实现类)
 *  *
 *  * 集合特点：
 *  *      Set系列集合：添加的元素是【无序、不重复、无索引】
 *  *      --HashSet：添加的元素是【无序、不重复、无索引】
 *  *      --LinkedHashSet:添加的元素是【有序、不重复、无索引】
 *  *      --TreeSet：添加的元素是【按照大小默认升序排序、不重复、无索引】
 *  *
 */

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class HashSetDemo01 {
    public static void main(String[] args) {
        //一行经典代码，因为HashSet没有在Set的基础上做太多延伸
        Set<String> sets = new HashSet<>();
        sets.add("Kris");
        sets.add("Wu");
        sets.add("Wu");
        sets.add("1212");
        sets.add("1990");
        sets.add("Yao");
        System.out.println(sets);

        sets.remove("1212");
        System.out.println(sets);

        sets.clear();
        System.out.println(sets);
    }
}
