package com.itheima._04Set系列集合;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 面试点：
 *      1.Set集合添加的元素是不重复的，如何去重复的？
 *      2.Set集合元素无序的原因是什么？
 *
 * 集合和泛型都只能支持引用数据类型
 *
 * 1.对于有值特性的，Set集合可以直接判断进行去重复
 * 2.对于引用数据类型的类对象，Set集合是按照如下流程进行是否重复的判断：
 *      --Set集合会让两两对象，先调用自己的hashCode()方法得到彼此的哈希值（所谓的内存地址，但不是）
 *      --然后比较两个对象的哈希值是否相同，
 *
 * 小结：
 *      如果希望Set集合认为两个对象只要内容一样就重复了，就要重写HashSet()和equals方法
 */
public class HashSetDemo02 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        //对于[有值特性]的，Set集合可以直接判断进行去重复
        set1.add(1);
        set1.add(1);
        set1.add(2);
        set1.add(3);

        //存储一些自定义类型数据
        Set<Apple> apples = new HashSet<>();

        Apple a1 = new Apple("红富士",59.9,"红色");
        Apple a2 = new Apple("青苹果",39.9,"青色");
        Apple a3 = new Apple("青苹果",39.9,"青色");
        System.out.println(a1.hashCode());//2129789493 哈希值，相当于是内存地址
        System.out.println(a2.hashCode());//668386784
        System.out.println(a3.hashCode());//1329552164
        apples.add(a1);
        apples.add(a1);
        apples.add(a2);
        apples.add(a3);
        System.out.println(apples);

    }
}

class Apple{
    private String name;
    private double price;
    private String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return Double.compare(apple.price, price) == 0 && Objects.equals(name, apple.name) && Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, color);
    }

    public Apple() {
    }

    public Apple(String name, double price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}