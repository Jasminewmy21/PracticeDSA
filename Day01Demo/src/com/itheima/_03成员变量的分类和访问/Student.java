package com.itheima._03成员变量的分类和访问;

/**
 * 目标：成员变量的分类和访问
 * <p>
 * 按照有无static修饰成员变量分为
 * 1.静态成员变量：有static修饰，属于类本身，与类一起加载一次，直接用类名调用即可
 * 2.实例成员变量：无static修饰，属于类的每个对象的，必须先创建对象，再用对象来访问
 *
 * 成员变量的访问语法：
 * --静态成员变量访问：
 * 1.类名.静态成员变量
 * 2.对象.静态成员变量（不推荐）
 * --实例成员变量访问：
 * 1.对象.实例成员变量
 */
public class Student {
    //1.定义一个静态成员变量:只有一份
    public static String schoolName = "西安交通大学";

    //2.实例成员变量：可以有无数个
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void main(String[] args) {
        //静态成员变量
        System.out.println(Student.schoolName);
        System.out.println(schoolName);//同一个类中，访问静态成员变量可以省略类名不写

        //实例成员变量
//        System.out.println(Student.name);//直接访问，报错
        Student stu = new Student();
        stu.name = "KrisWu";
        System.out.println(stu.name + " " + stu.age);

//        System.out.println(stu.schoolName);//(不推荐)
    }
}
