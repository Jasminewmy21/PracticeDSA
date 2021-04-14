package com.itheima.array;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {


    }

    private static void testGet() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Kris Wu");
        list.add("1990");
        list.add("Kris Wu");
        list.add("1990");
        list.add("Kris Wu");
        list.add("1990");
        System.out.println(list);

        String s1 = list.get(0);
        String s2 = list.get(1);
        String s3 = list.get(3);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    private static void testSet() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Kris Wu");
        list.add("1990");
        list.add("Kris Wu");
        list.add("1990");
        list.add("Kris Wu");
        list.add("1990");
        System.out.println(list);
        list.set(1,"1106");
        System.out.println(list);
    }

    private static void TestRemove() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Kris Wu");
        list.add("1990");
        list.add("Kris Wu");
        list.add("1990");
        list.add("Kris Wu");
        list.add("1990");
        System.out.println(list);

        boolean b1 = list.remove("1990");
        System.out.println(list);//删除首先匹配到的相等的

        list.remove(0);
        System.out.println(list);
    }
}
