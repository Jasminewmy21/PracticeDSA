package com.itheima._13代码块;

import java.util.ArrayList;
import java.util.List;

/**
 * 静态代码块(重点)
 *
 * 类的五大成分:成员变量,方法,构造器,代码块,内部类
 *
 * 代码块按照有无static修饰可以分为:静态代码块,实例代码块
 *
 * 1.静态代码块(用的多)
 * --格式:
 *      static{
 *
 *      }
 *      --必须用static修饰.属于类,会与类一起优先加载,而且自动触发执行一次
 *      --可以用于在执行类之前进行静态资源的初始化操作(拓展)
 * 小结:
 * --属于类的成分,应该用static修饰,属于类,会与类一起优先加载,而且自动触发执行一次
 * --可以用于在执行类之前进行静态资源的初始化操作(拓展)
 */
public class CodeDemo01 {
    public static List<String> cards = new ArrayList<>();
    static{//代码优雅,逼格高,规范,专业
        System.out.println("静态代码块执行一次");//属于类,会与类一起【优先】加载
        //可以用于在执行类之前进行【静态资源的初始化操作】(拓展)
        cards.add("♥3");
        cards.add("♠3");
    }

    public static void main(String[] args) {
        System.out.println("main方法执行一次");
        System.out.println(cards);
    }
}
