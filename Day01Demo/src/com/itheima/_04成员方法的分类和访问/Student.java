package com.itheima._04成员方法的分类和访问;

/**
 * 目标：成员方法的分类和访问
 * <p>
 * 按照有无static修饰成员方法分为
 * 1.静态方法：有static修饰，属于类本身，直接用类名调用即可
 * 2.实例方法：无static修饰，属于类的每个对象的，必须先创建对象，再用对象来访问
 * 成员方法的访问语法：
 * 静态方法访问：
 * 1.类名.静态方法
 * 2.对象.静态方法（不推荐）
 * 实例方法访问：
 * 1.对象.实例方法
 */
public class Student {
    public static String schoolName = "西安交通大学";

    //2.实例成员变量：可以有无数个
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void handsome() {
        System.out.println("Kris Wu is the prince in " + Student.schoolName);
        System.out.println("Kris Wu is the prince in " + schoolName);
    }

    public void beautiful() {
        System.out.println(name + " is a " + age + " years old beautiful girl.");
    }

    public static void main(String[] args) {
        Student.handsome();

        Student stu = new Student("Kendall",25);
//        stu.handsome();//不推荐
        stu.beautiful();
    }


}
