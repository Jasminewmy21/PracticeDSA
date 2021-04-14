package com.itheima._04Set系列集合;

/**
 * LinkedHashSet：是HashSet的子类，有序(按照添加顺序有序)，不重复，无索引
 *
 * LinkedHashSet集合底层也是基于哈希表存储元素的
 * 但是每个元素都额外带一个链来维护添加顺序
 * 增删改查快，还有序，但是元素不重复、无索引，多了一个存储顺序的链会占内存空间
 *
 * 总结：
 *      如果希望元素有序，有索引，查询快就用ArrayList集合(用得最多)
 *      如果希望元素有序，有索引，增删快，经常操作首尾元素，就用LinkedList
 *      如果希望元素增删改查都很快，但是元素不重复，并且无序无索引，用HashSet
 *      如果希望元素增删改查都很快，有序，但是元素不重复，无索引，用LinkedHashSet
 *
 */
public class HashSetDemo04 {
}
