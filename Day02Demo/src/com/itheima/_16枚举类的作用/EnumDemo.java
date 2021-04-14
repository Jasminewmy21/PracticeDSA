package com.itheima._16枚举类的作用;

/**
 * 目标:枚举类用于信息标志和信息分类
 *
 * 常量做信息标志和分类:入参不受控制,入参太随性无法控制
 *
 * 枚举类用于信息标志和信息分类:优雅!专业!大气!
 *
 * 小结:
 * --【信息标志】和【信息分类】用枚举类型
 */

enum Orientation{
    UP,DOWN,LEFT,RIGHT
}

enum Season{
    SPRING,SUMMER,FALL,WINTER;
}

public class EnumDemo {

    //用常量来编写，可读性更好
//    public static final int UP = 0;
//    public static final int DOWN = 1;
//    public static final int LEFT = 2;
//    public static final int RIGHT = 3;
    public static void main(String[] args) {
        move(Orientation.DOWN);//优雅,严谨
        move(Orientation.UP);
    }

    //控制玛丽的移动
    public static void move(Orientation Orientation){
        switch(Orientation){
            case UP:
                System.out.println("玛丽往↑");
                break;
            case DOWN:
                System.out.println("玛丽往⬇");
                break;
            case LEFT:
                System.out.println("玛丽往←");
                break;
            case RIGHT:
                System.out.println("玛丽往→");
                break;
        }
    }
}
