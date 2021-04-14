package com.itheima._11继承后_方法重写;

/**
    目标：静态方法、私有方法是否可以被重写？

       都不可以
        静态方法：因为父类静态方法就【没有被子类继承】，更不可能被重写
        私有方法：它喜欢，就不让你重写


 */
public class ExtendsDemo03 {
}

class Mac extends Computer{
    /*
    //私有方法不能被重写
    @Override //它喜欢
    public void go(){

    }

    //静态方法
    @Override
    public static void test(){

    }
     */

}

class Computer{

    private void go(){

    }

    public static void test(){

    }

}
