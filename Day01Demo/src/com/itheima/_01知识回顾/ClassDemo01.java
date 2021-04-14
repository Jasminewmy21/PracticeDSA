package com.itheima._01知识回顾;
/*
    小结：
        类的五大成分
        构造器的作用

    面向对象：
        用代码去高度模拟现实世界，以便为人类的业务服务
        Java是一种面向对象的高级编程语言
        高级编程语言：代码风格很像人类的自然语言
        zhubajie.eat("西瓜");
    面向对象最重要的两个概念：类和对象

    类：描述相同事物的共同特征的抽象 eg：人类
    对象：是具体存在的实例，是真实的 实例==对象

    在代码层面：必须先有类，才能创建出对象

    定义类的格式：
        修饰符 class 类名{
           类中有且仅有的五大成分（五大金刚）：
            1.成员变量（Field：描述类和对象的属性信息的）
            2.构造器（Constructor：[初始化]一个类的对象并返回引用）
            3.成员方法（Method：描述类或者对象的行为信息的）
            4.代码块
            5.内部类
            --注意：只要不是这五大成分放在类里面就会报错
        }
        注意：
        --类名的首字母应该大写，满足”驼峰写法“
        --一个Java代码文件中可以定义多个类。但是只能有一个类用public修饰
          而且public修饰的类必须成为源代码的文件名


            构造器：
                作用：[初始化]一个类的对象并返回引用
                格式：
                    修饰符 类名(形参){
                    }
                构造器初始化对象的格式：
                    类名 对象名称 = new 构造器; (理解类名 构造器）
                 注意：
                    一个类默认会自带一个无参数构造器，即使不写也存在，
                    但是如果一个类它写了一个构造器，默认的无参构造器就被覆盖了
                    所以，都是无参、有参都写


 */
public class ClassDemo01 {
    //System.out.println("Hello World");
    //所以为什么上一句会报错，这时候用sout打不出来语句，就是因为这是执行代码，不属于五类
    //这句可以放在方法、构造器、代码块里
}
