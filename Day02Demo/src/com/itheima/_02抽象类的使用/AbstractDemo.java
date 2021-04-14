package com.itheima._02抽象类的使用;

/**
 抽象类作用：为了被子类继承
 小结：
    抽象类是为了被子类继承，约束子类必须重写抽象方法
    注意：一个类继承了抽象类，必须重写玩抽象类的所有抽象方法，否则这个类也必须定义成抽象类
 */
public class AbstractDemo {
}

class Manager extends Teacher{
    @Override
    public void teach(){
        System.out.println("班主任教学且管理学生");
    }

    @Override
    public void view(){
        System.out.println("改语文作业");
    }
}

class EnglishTeacher extends Teacher{
    @Override
    public void teach(){
        System.out.println("英语老师教英语");
    }

    @Override
    public void view(){
        System.out.println("改英语作业");
    }
}

abstract class Teacher{
    //子类都要完成教学和改作业的功能，但是每个子类完成内容不一样，就定义抽象方法
    public abstract void teach();
    public abstract void view();
}