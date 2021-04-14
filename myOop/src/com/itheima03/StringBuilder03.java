package com.itheima03;
/*
    StringBuilder 方法：
        append
        reverse
        length
        toString
 */
public class StringBuilder03 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        /*
        sb.append(123);
        sb.append("KrisWu");
        sb.append(true);
        System.out.println(sb);
         */

        //链式编程：如果一个方法返回的是对象类型，对象就可以继续向下都调用方法
        sb.append("Kris").append("Wu").append(1990).append(1106);
        System.out.println("反转前:" + sb);

        sb.reverse();
        System.out.println("反转后:" + sb);

        System.out.println(sb.length());

        sb.reverse();
        String s = sb.toString();
        System.out.println(s);
    }
}
