package com.itheima.array;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList04 {
    public static void main(String[] args) {
        Student stu1 = ArrayList03.getStudent();
        Student stu2 = ArrayList03.getStudent();
        Student stu3 = ArrayList03.getStudent();
        Student stu4 = ArrayList03.getStudent();

        ArrayList<Student> list = new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        ArrayList<Student> newList = getList(list);
        for (int i = 0; i < newList.size(); i++) {
            Student stu = newList.get(i);
            System.out.println(stu.getName() + " " + stu.getAge());
        }
    }

    public static ArrayList<Student> getList(ArrayList<Student> list) {
        ArrayList<Student> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            int age = stu.getAge();
            if (age < 18) {
                newList.add(stu);
            }
        }

        return newList;
    }
}
