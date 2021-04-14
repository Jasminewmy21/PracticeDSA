package com.practice;
/*
    字符串的比较
 */
public class Compare {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1;
        System.out.println(s1 == s2);//true

        String s3 = s2 + "c";
        System.out.println(s1 == s3);//false

        String s4 = "a" + "b" + "c";
        System.out.println(s1 ==s4);//true

        String s5 = "ab" + "c";
        System.out.println(s1 == s5);//true

        String s6 = new String("abc");//不推荐使用，一次创建了两个字符串对象
        System.out.println(s1 ==s6);//false  s1是在常量池里，s6在堆内存中创建了两个字符串对象
    }
}
