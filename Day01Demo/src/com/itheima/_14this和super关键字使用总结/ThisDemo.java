package com.itheima._14this和super关键字使用总结;

/**
 * 面试题
 总结和扩展：this、super关键字使用总结

 this代表了当前对象的引用（继承中指代子类对象）：
    this.子类成员变量
    this.子类成员方法
    this(...):可以根据参数匹配访问本类其他构造器（还没学）

 super代表了父类对象的引用（继承中指代了父类对象空间）
    super.父类成员变量
    super.父类成员方法
    super(...)：可以根据参数匹配访问父类的构造器

 拓展：
    this(...):可以根据参数匹配访问本类其他构造器
 注意：
    this(...)借用本类其他构造器
    super(...)借用父类的构造器
    this(...)和super(...)必须放在构造器的第一行，否则报错
    因此，this(...)和super(...)不能同时出现再构造器中

 */
public class ThisDemo {
    public static void main(String[] args) {
        Student s1 = new Student("KrisWu",18,"LA");
        Student s2 = new Student("Jasmine",17);
    }
}
class Student{
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String name, int age) {
        this(name,age,"LA");
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
