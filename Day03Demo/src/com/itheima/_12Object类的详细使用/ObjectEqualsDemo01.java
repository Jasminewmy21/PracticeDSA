package com.itheima._12Object类的详细使用;

/**
 * 目标：常用API学习-Object类的toString方法使用详解
 *
 * 包：java.lang.Object
 * Object类是Java中的祖宗类
 * 一个类要么默认继承了Object类，要么间接继承了Object类
 * Object类的方法是一切子类都可以直接使用的，所以我们要学习Object类的方法
 *
 * Object类的常用方法：
 * 1.public String toString():
 * --默认返回当前对象在堆内存中的地址信息：//com.itheima._12Object类的详细使用.Student@7ef20235
 * --默认的地址信息格式：【类的全限名@堆内存地址】
 * --而开发中输出对象变量，更多的是希望看到对象的内容数据，所以toString方法存在的意义就是为了被子类重写
 * --以便能够返回对象的数据内容输出
 *
 * 2.public boolean equals（Object o):
 * --默认是比较两个对象的地址是否相同，相同返回true
 * --直接比较两个对象的地址是否相同完全可以用“==”代替equals
 *      所以equals存在的意义是为了被子类重写，以便程序员可以自己来定制比较规则
 * --需求：只要两个对象的内容一样，我们就认为它们相等
 *
 * 小结：
 * --toString方法存在的意义就是为了被子类重写
 * --equals存在的意义是为了被子类重写，以便程序员可以自己来定制比较规则
 *
 */
public class ObjectEqualsDemo01 {
    public static void main(String[] args) {
        Student s1 = new Student("Kris Wu",21,"male");
        Student s2 = new Student("Kris Wu",21,"male");
        //效果一样，比较地址
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
    }
}
