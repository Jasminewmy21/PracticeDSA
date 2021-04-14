package com.itheima._11JDK1_8开始后新增的方法;

/**
 * 目标：JDK1.8开始之后接口新增的三个方法（Lambda、Stream、函数式接口：sun公司底层在用，Java底层的技术，了解语法，我们开发基本不用）
 *
 * JDK1.8之前接口中只能是抽象方法和常量
 * JDK1.8开始后接口不再纯洁
 * JDK1.8开始后接口新增了三个方法：
 *      1.默认方法：其实就是我们之前写的实例方法(因为1.8之前只有抽象方法和常量,sun公司不能自己打脸,所以引入一个新的定义,叫默认方法,实质和类的成员方法没区别)
 *          --必须用default修饰
 *          --默认会加public修饰,省略即可
 *          --只能用接口的实现类的对象来调用
 *          那为什么不叫实例方法，叫默认方法？有哪位欸不能打脸
 *      2.静态方法：
 *          --可以直接加static修饰
 *          --默认加public修饰
 *          --接口的静态方法只能用接口的名称本身调用
 *      3.私有方法：（其实是从JDK1.9开始才支持的）
 *          --其实就是私有的实例方法，必须加private修饰
 *          --私有方法：私有的实例方法，只能在本接口中被访问
 *          --私有方法通常是给私有方法或默认方法调用的
 * 小结:
 *      记住语法!
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        BasketballMan bm = new BasketballMan();
        bm.run();
//        bm.inAddr();//接口的静态方法不能用实现类的名称调用，只能用接口名称调用
    }
}

class BasketballMan implements SportMan{

}

interface SportMan{
    default void run(){
        go();
        System.out.println("跑得很快");
    }

    //2.静态方法：可以直接加static修饰，默认会加public修饰
    //静态方法只能用接口的类名称本身调用
//    public static void inAddr(){
    static void inAddr(){
        System.out.println("");
    }

    //私有方法：私有的实例方法，只能在本接口中被访问
    //私有方法通常是给私有方法或默认方法调用的
    private void go(){
        System.out.println("开始跑：");
    }
}
