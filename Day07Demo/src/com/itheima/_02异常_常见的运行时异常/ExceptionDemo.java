package com.itheima._02异常_常见的运行时异常;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 面试题:常见的运行时异常
 *      1.数组索引越界异常:ArrayIndexOutOfBoundsException
 *      2.空指针异常:NullPointerException
 *      3.类型转换异常:ClassCastException
 *      4.迭代器遍历没有此元素异常:NoSuchElementException
 *      5.数学操作异常:ArithmeticException
 *      6.数学转换异常:NumberFormatException
 *
 * 小结:运行时异常继承了RuntimeException,编译阶段不报错,运行时报错
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        //1.ArrayIndexOutOfBoundsException
        int[] arr = {1,2,3};
//        System.out.println(arr[3]);

        //2.
        String s = null;
        System.out.println(s);
//        System.out.println(s.length());

        //3.
        Object o = "String";
//        Integer in = (Integer) o;

        //4.NoSuchElementException
        List<String> lists = new ArrayList<>();

        Iterator<String> it = lists.iterator();

//        for(int i=0;i<10;i++){
//            it.next();
//        }

        //5.ArithmeticException
//        int c = 10 / 0;

        //6.NumberFormatException
        String num = "23aa";
        Integer in = Integer.valueOf(num);
        System.out.println(in + 1);

        System.out.println("End");


    }

}
