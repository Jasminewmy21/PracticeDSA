package com.itheima._16枚举类;

/**
 * 目标:枚举类的概述(面向对象的特殊类型)
 *
 * 枚类的作用?
 * --是用于做信息标志和信息分类
 * 枚举类的格式:
 *      修饰符 enum 枚举名称{
 *          //第一行罗列的必须是枚举类的对象名称
 *          实例1名称,实例2名称,...;
 *      }
 *      --枚举类【第一行】罗列的【必须是枚举类的对象名称】
 *
 * 反编译后:
 * public final class Gender extends java.lang.Enum<Gender> {
 *   public static final Gender MALE;
 *   public static final Gender FEMALE;
 *
 *   public static Gender[] values();
 *   public static Gender valueOf(java.lang.String);
 *   static {};
 * }
 *
 * 枚举类的特点:
 *      1.枚举类是final修饰的,不能继承
 *      2.枚举类默认继承了枚举类型:java.lang.Enum
 *      3.枚举类的第一行罗列的是枚举类的对象,而且是用常量存储的
 *      4.所以枚举类的第一行写的都是【常量名称】,默认存储了枚举对象
 *      5.枚举类的构造器默认是私有的
 *      5.枚举类相当于是【多例设计模式】
 * 小结:
 * 1.记住格式和特点
 */
public class EnumDemo01 {
    public static void main(String[] args) {
        Gender g1 = Gender.FEMALE;
        System.out.println(g1);//FEMALE
        System.out.println(g1.ordinal());//索引 1
        Gender g2 = Gender.MALE;
        System.out.println(g2);//MALE
        System.out.println(g2.ordinal());//索引 0
    }
}

//枚举类的格式
enum Gender{
    MALE,FEMALE;
}