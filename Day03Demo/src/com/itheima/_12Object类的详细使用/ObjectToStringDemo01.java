package com.itheima._12Object类的详细使用;

public class ObjectToStringDemo01 {
    public static void main(String[] args) {
        Student s = new Student("Kris Wu",21,"male");
        String s1 = s.toString();
        System.out.println(s1);//com.itheima._12Object类的详细使用.Student@7ef20235
        //包名 分隔符  在堆内存中的地址
        System.out.println(s1);//com.itheima._12Object类的详细使用.Student@7ef20235
        //直接输出对象名称，默认会调用toString方法
    }
}

