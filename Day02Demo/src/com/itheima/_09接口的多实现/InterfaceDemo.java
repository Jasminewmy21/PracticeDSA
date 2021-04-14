package com.itheima._09接口的多实现;

/**
 *类与类是单继承关系
 * 类与接口是多实现关系
 *
 * 类实现接口的格式：
 *    修饰符  class  实现类名称  implements  接口1，接口2，接口3，接口4，...{
 *
 *     }
 *     implements：类实现接口的关键字
 *
 * 小结：
 *      一个类实现接口必须重写完这个接口中的所有抽象方法，否则这个类就要定义成抽象类
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Basketball b = new Basketball();
        b.competition();
        b.rule();
        b.run();
    }
}

class Basketball implements SportMan, Law{

    @Override
    public void run() {

    }

    @Override
    public void competition() {

    }

    @Override
    public void rule() {

    }
}

interface SportMan{
    void run();
    void competition();
}

interface Law{
    void rule();
}