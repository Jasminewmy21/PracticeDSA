package com.itheima._04Set系列集合;

import java.util.HashSet;

import static java.lang.Integer.MAX_VALUE;

/**
 * Set系列集合元素无序的根本原因(面试必考)
 *
 * Set系列集合添加元素无序的根本原因是因为底层采用了[哈希表]存储元素
 *
 * JDK1.8之前：哈希表(table) = 数组 + 链表 + （哈希算法）（虚拟的东西，所以加括号）
 * JDK1.8开始：哈希表(table) = 数组 + 链表 + 红黑树 +（哈希算法）
 *      党链表长度超过阈值（8）时，将链表转换为红黑树，这样大大减少了查找时间
 *
 *      哈希表底层是基于（Node节点）数组
 *
 * 小结：
 *      HashSet系列集合是基于哈希表存储元素的
 *      它的增删改查性能都很好，但是！它存储数据无序，如果能忍受就可以使用
 */
public class HashSetDemo03 {
    public static void main(String[] args) {
        HashSet<String> sets = new HashSet<>();
        sets.add("Kris");
        sets.add("wu");
        sets.add("12");
        sets.add("97");

        System.out.println(sets);
        
    }
}
