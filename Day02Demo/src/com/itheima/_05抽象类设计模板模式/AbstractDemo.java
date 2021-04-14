package com.itheima._05抽象类设计模板模式;

/**
 什么是设计模式？23/24种
    设计模式是前任或者大佬或者软件行业在生产实践中发现的优秀软件设计架构和思想
    后来者可以直接用这些架构或者思想就可以设计出优秀、高开发效率、库扩展性、可维护性的软件
 【模板(Template)设计模式】就是一种经典的设计模式思想

 模板设计模式的作用：
    优化代码架构，提高代码的的复用性，相同功能的重复代码无需重复书写
    可以做到部分实现，部分抽象，抽象的东西交给使用模板的人重写实现

 作文模板：
    标题固定的：《我的妈妈》
    第一段固定：介绍妈妈
    正文部分：抽象出来
    结尾部分：我妈妈真棒！

 小结：
 可以做到部分实现，部分抽象，抽象的东西交给使用模板的子类重写实现
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.write();
    }
}

class Student extends Template{
    @Override
    public  String writeMain(){
        return "我妈妈会做饭会洗衣服会开车...";
    }
}

//1.设计一个模板类
abstract class Template{
    private String title = "\t\t\t\t《我的妈妈》\t\t\t\t";
    private String one = "介绍妈妈";
    private  String last = "我妈妈真棒";

    //2.写作文功能
    public void write(){
        System.out.println(title);
        System.out.println(one);
        //3.写正文部分：不能确定，交给使用的子类写

        System.out.println(writeMain());
        System.out.println(last);
    }

    protected abstract String writeMain();
}
