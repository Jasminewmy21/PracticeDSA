package com.itheima._07斗地主游戏洗牌发牌看牌;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 业务需求分析:
 *      斗地主的做牌/洗牌/发牌/排序(拓展知识)/看牌,(还不能打牌)
 *      业务:总共有54张牌
 *      点数
 *      花色
 *      大小王
 *      点数分别要组合4中花色,大小王各一张
 *      斗地主:发出51张牌,剩下3张作为底牌
 *
 * 功能:
 *      1.做牌
 *      2.洗牌
 *      3.定义三个玩家
 *      4.发牌
 *      5.排序
 *      6.看牌
 * 用面向对象设计案例
 *      1.定义一个牌类,代表牌对象.一张牌是一个对象
 *      2.定义一个集合存储54张牌,集合只需要一个(因为一副牌就一个牌盒)
 */
public class GameDemo {
    /**定义一个静态集合,存储54张牌对象,集合只需要一个*/
    public static final List<Card> ALL_CARD = new ArrayList<>();

    /**a.做牌*/
    //静态代码块
    static {//随类加载一次,更优雅代码
        //1)定义一个数组存储牌的点数,类型确定,个数确定,请用数组存储
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "1", "2"};

        //2)定义一个数组存储牌的花色,类型确定,个数确定,请用数组存储
        String[] colors = {"♠", "♥", "♣", "♦"};//Spade,Heart,Club,Diamond

        //新3)先遍历点数与四种花色组装成牌对象存入到集合中去
        int index = 0;
        //3)用点数找花色,才能出现点数一样的在一起的效果
        for (String number : numbers){
            for(String color : colors){
                Card card = new Card(number, color, index++);
                ALL_CARD.add(card);
            }
        }

        //4)大小王单独装入集合
        Collections.addAll(ALL_CARD, new Card("","小王", index++),new Card("","大王",index++));

        //5)输出一下
        System.out.println("新牌:" + ALL_CARD);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        /**b.洗牌*/
        Collections.shuffle(ALL_CARD);//Collections工具类提供打乱的方法shuffle
        System.out.println("洗牌后:" + ALL_CARD);
        System.out.println("----------------------");

        /**c.发牌*/
        //1)定义3个玩家
        //一个玩家代表一个瓶子集合
        List<Card> playerCard1 = new ArrayList<>();
        List<Card> playerCard2 = new ArrayList<>();
        List<Card> playerCard3 = new ArrayList<>();

        //发牌:轮循的长度 -> %
        for (int i = 0; i < ALL_CARD.size() - 3; i++) {
            //得到这张牌
            Card card = ALL_CARD.get(i);

            //判断发给谁
            if(i%3 == 0) playerCard1.add(card);
            else if(i%3 == 1) playerCard2.add(card);
            else if(i%3 == 2) playerCard3.add(card);
        }

        /**d.对牌进行排序(拓展)*/
        sortCards(playerCard1);
        sortCards(playerCard2);
        sortCards(playerCard3);


        /**e.看牌*/
        System.out.println("player1:" + playerCard1);
        System.out.println("player2:" + playerCard2);
        System.out.println("player3:" + playerCard3);

        //看底牌,拓展:截取集合的最后三张牌到一个新的List集合中
        List<Card> lastThreeCards = ALL_CARD.subList(ALL_CARD.size() - 3, ALL_CARD.size());
        System.out.println("底牌:" + lastThreeCards);
    }

    /**对牌的List集合进行排序(斗地主是降序排序)*/
    private static void sortCards(List<Card> playerCard) {
        Collections.sort(playerCard, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                //牌的大小就是当前牌的索引值
                if(o1.getIndex() > o2.getIndex()) return -1;
                if(o1.getIndex() < o2.getIndex()) return 1;
                return 0;
            }
        });
    }
}
