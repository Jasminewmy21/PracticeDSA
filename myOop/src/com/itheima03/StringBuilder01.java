package com.itheima03;
/*
    StringBuilder的append方法，连接字符串非常快，效率比String高很多
 */
public class StringBuilder01 {

    public static void main(String[] args) {
        //method();
        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 50000; i++) {
            sb.append(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);//3
        System.out.println(sb);


    }

    private static void method() {
        long start = System.currentTimeMillis();//获取1970.1.1 00：00：00到现在时间所经历的毫秒数
        String s = "";
        for (int i = 1; i < 50000; i++) {
            s += i;
        }

        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);//0.745

        System.out.println(s);
    }
}
