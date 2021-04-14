package com.itheima._13super调用父类构造器;

/**
 * 特点：
 * 子类的全部构造器的默认一定会先访问父类的无参数构造器
 * <p>
 * super(...)：可以根据参数选择调用父类的某个构造器
 *
 * 小结：
 * 1.可以在子类构造器中通过super()根据参数选择调用父类的构造器，
 *   【以便调用父类构造器初始化继承自父类的数据】
 */
public class TestDemo {
    public static void main(String[] args) {
        Tiger t = new Tiger("Kris Wu",18,'m');
        t.eat();
    }
}

class Tiger extends Animal {

    public Tiger(String name, int age, char gender) {
        super(name,age,gender);//根据参数匹配调用父类的带参构造器
    }

    public void eat() {
        System.out.println(getName() + " " + getAge() + " " + getGender() + " " + "eat banana.");
    }

    public Tiger() {
    }
}

class Animal {
    private String name;
    private int age;
    private char gender;

    public Animal() {
    }

    public Animal(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
