package com.itheima._07TreeMap集合练习;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 目标:输出一个字符串种每个字符出现的个数(经典面试题)
 *
 * 分析:
 *      1.键盘录入一个字符串,eg:abehfksdj1212
 *      2.定义一个Map集合,key是每个字符,value是其出现的次数
 *      3.遍历字符串中的每一个字符
 *      4.拿着这个字符去Map集合中看是否存在这个key,
 *        有说明之前统计过,没有就添加一个键值对(字符作为key,1作为value)
 *      5.输出结果
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<Character,Integer> maps = new HashMap<>();

        //abehfksdj1212
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(maps.containsKey(c)){
                maps.put(c, maps.get(c)+1);
            }else{
                maps.put(c,1);
            }
        }

        System.out.println(maps);
    }
}
