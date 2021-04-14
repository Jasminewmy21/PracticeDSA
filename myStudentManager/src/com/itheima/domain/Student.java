package com.itheima.domain;

public class Student {
    private String stuID;
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String stuID,String name, int age, String address) {
        this.stuID = stuID;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
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
