package com.itheima02;

/*
    String类常见构造方法
 */
public class StringConstructor {
    public static void main(String[] args) {
        //1.public String()
        String s1 = new String();
        System.out.println(s1);

        //2.public String (char[] chs)
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println(s2);

        //3.public String (String original)
        String s3 = new String("Kris Wu");
        System.out.println(s3);
    }
}
