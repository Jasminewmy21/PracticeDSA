package com.itheima.array;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Kris Wu");
        list.add("Kendall");
        list.add("Kim");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
