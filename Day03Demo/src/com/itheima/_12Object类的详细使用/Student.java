package com.itheima._12Object类的详细使用;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String gender;


    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student() {

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //判断是否是自己和自己比较，如果是同一个对象比较直接返回true
        if (this == o) return true;
        //判断被比较者是否是null，以及是否是学生类型
        if (o == null || getClass() != o.getClass()) return false;
        //o一定是学生类型，强制转换为学生，开始比较内容
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(gender, student.gender);
    }

}
