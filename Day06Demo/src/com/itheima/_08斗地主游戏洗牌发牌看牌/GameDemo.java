package com.itheima._08斗地主游戏洗牌发牌看牌;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用Map集合实现
 */
public class GameDemo {
    /**1.定义一个Map集合存储54张牌*/
    public static final Map<Card,Integer> ALL_CARDS_SIZE = new HashMap<>();
    public static final List<Card> CARDS = new ArrayList<>();

    /**2.做牌:静态代码块初始化54张牌对象*/
    static {
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♠","♥","♣","♦"};

        int index = 0;
        for(String number : numbers) {
            for(String color : colors) {
                Card card = new Card(number, color);
                ALL_CARDS_SIZE.put(card, index++);
            }
        }
        ALL_CARDS_SIZE.put(new Card("","Queen"),index++);
        ALL_CARDS_SIZE.put(new Card("","King"),index++);
        System.out.println("乱序新牌:" + ALL_CARDS_SIZE);
    }

    public static void main(String[] args) {
        /**3.洗牌*/
        //之后逻辑和用List一样的,只不过是大小存在了Map集合而不是存在了Card类里
    }
}
