package com.itheima._13Objects类的使用;
/**
 * Objects的方法：
 * 1.public static boolean equals(Object a, Object b)
 * --比较两个对象的内容
 * --底层进行非空判断，从而避免空指针异常。【更安全】，推荐使用！
 *     public static boolean equals(Object a, Object b){
 *         return a==b || a != null && a.equals(b);
 *     }
 *
 * 2.public static boolean isNull(Object obj)
 * --判断变量是否为null，为null返回true，反之。
 * --完全可以被obj == null代替
 *
 */

import java.util.Objects;

public class ObjectsDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1,s2));

        Student s3 = null;
        Student s4 = new Student();
//        System.out.println(s3.equals(s4));//NullPointerException
        System.out.println(Objects.equals(s3,s4));//底层进行非空判断，从而避免空指针异常。更安全，推荐使用！

        //这两句效果一样，只不过第二句用API,看起来更高级
        System.out.println(s3 == null);
        System.out.println(Objects.isNull(s3));
    }
}
