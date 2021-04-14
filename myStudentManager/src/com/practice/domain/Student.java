package com.practice.domain;
/*
    Student类
 */
public class Student {
    //属性：成员变量
    private String stuId;
    private String stuName;
    private int stuAge;
    private String stuAddress;

    //无参、带参构造方法

    public Student() {
    }

    public Student(String stuId, String stuName, int stuAge, String stuAddress) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuAddress = stuAddress;
    }

    //成员变量get/set方法

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }
}
