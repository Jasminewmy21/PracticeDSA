package com.itheima._13泛型的通配符;

import java.util.ArrayList;

/**
 * 反省通配符
 *
 * 需求：开发一个极品飞车的游戏，所有的汽车都能一起参与比赛
 *
 * 注意：
 *      虽然BMW和BENZ都继承了Car
 *      但是ArrayList<BMW>、ArrayList<BENZ>与ArrayList<Car>没有关系！
 *
 * 通配符：？
 *      ？可以用在【使用】泛型的时候代表一切类型
 *      E T K V 是在【定义】泛型的时候使用代表一切类型
 *
 * 泛型的上下限：
 *      ？ extends Car ： 那么？必须是Car或者其子类（泛型的上线）
 *      ？ super Car ： 那么？必须是Car或者其父类（泛型的下线，很少见）
 *
 * 小结：
 *      通配符 ？：【使用】泛型的时候
 *      ？ extends Car ： 那么？必须是Car或者其子类（泛型的上线）
 */
public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<BMW>  bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        bmws.add(new BMW());
        run(bmws);

        ArrayList<Benz>  benzs = new ArrayList<>();
        benzs.add(new Benz());
        benzs.add(new Benz());
        benzs.add(new Benz());
        run(benzs);

    }

    public static void run(ArrayList<? extends Car> cars){

    }
}

class Car{

}

class BMW extends Car{

}

class Benz extends Car{

}
