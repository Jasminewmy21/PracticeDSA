package com.itheima.method;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Operator {
    public static void mainInterface() {

        System.out.println("----------Welcome to Student Management System----------");
        System.out.println("1.Insert Student.");
        System.out.println("2.View Student.");
        System.out.println("3.Delete Student.");
        System.out.println("4.Reset Student.");
        System.out.println("5.Exit.");
        System.out.println("Please input your choice:");

    }

    public static void insertInfo(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        String stuId;
        while (true) {
            System.out.println("Please enter the student ID:");
            stuId = sc.next();

            int index = getIndex(stuId, list);

            if (index == -1) {
                break;
            }
        }
        Student stu = packageInfo(stuId);

        //将封装好的学生对象，添加到ArrayList集合
        list.add(stu);

        //提示信息
        System.out.println("Add Success.");
    }

    public static Student packageInfo(String stuId) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the student name:");
        String name = sc.next();
        System.out.println("Please enter the student age:");
        int age = sc.nextInt();
        System.out.println("Please enter the student address:");
        String address = sc.next();

        //将键盘录入的信息封装为Student对象
        Student stu = new Student(stuId, name, age, address);

        return stu;
    }

    public static void queryInfo(ArrayList<Student> list) {
        //判断集合是否存在数据，不存在，给出提示
        if (list.size() == 0) {
            System.out.println("There is no data. Insert first.");
            return;
        }

        System.out.println("stuID\tName\tAge\tAddress");

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getStuID() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    public static int getIndex(String stuId, ArrayList<Student> list) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stuId.equals(stu.getStuID())) {
                index = i;
            }
        }
        return index;
    }

    public static void deleteInfo(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the student ID you want to delete:");
        String stuID = sc.nextLine();

        int index = getIndex(stuID, list);

        if (index == -1) {
            System.out.println("The student ID you entered doesn't exist. Please check it.");
        } else {
            list.remove(index);
            System.out.println("delete successfully.");
        }
    }

    public static void updateInfo(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter student id you want to set:");
        String stuId = sc.next();

        int index = getIndex(stuId, list);

        if (index == -1) {
            System.out.println("The student ID you entered doesn't exist. Please check it.");
        } else {
            Student stu = packageInfo(stuId);
            list.set(index, stu);
            System.out.println("Update Successful.");
        }
    }
}
