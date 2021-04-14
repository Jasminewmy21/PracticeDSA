package com.itheima._07继承的使用案例;
/*
    小结：
    --继承的优势可以把相同的代码定义在父类中，子类可以直接继承使用
    --这样就可以提高代码的复用性：相同的代码只需要在父类中写一次就可以
 */
public class TestMain {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("Kris Wu");
        t.setAge(18);

        System.out.println(t.getName() + " " + t.getAge());
        t.eat();
        t.teach();
    }
}
