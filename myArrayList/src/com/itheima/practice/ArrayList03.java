package com.itheima.practice;

import java.util.ArrayList;

/*
    存储字符串并遍历
 */
public class ArrayList03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Kris");
        list.add("Wu");
        list.add("1106");

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
