package com.itheima03;

/*
    StringBuilder的构造方法
    String和StringBuilder为什么打印不出来地址，而是直接打印出来内容，学习高级课程后可解释
 */
public class StringBuilder02 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("KrisWu");
        System.out.println(sb2);
    }
}
