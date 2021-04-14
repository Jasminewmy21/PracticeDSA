package com.practice.method;

import com.practice.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Method {

    public static boolean ifFlag(ArrayList<Student> list, String stuId) {
    boolean flag = true;
    for (int i = 0; i < list.size(); i++) {
        Student stu = list.get(i);
        if (stuId.equals(stu.getStuId())) {
            flag = false;
        }
    }
    return flag;
}

    public static void addStu(ArrayList<Student> list) {

        Scanner sc = new Scanner(System.in);
        //1.录入信息
        lo:while(true) {
            System.out.println("请输入要添加的学生学号：");
            String stuId = sc.next();
            boolean flag = ifFlag(list, stuId);
            if (flag) {
                System.out.println("请输入要添加的学生姓名：");
                String stuName = sc.next();
                System.out.println("请输入要添加的学生年龄：");
                int stuAge = sc.nextInt();
                System.out.println("请输入要添加的学生地址：");
                String stuAddress = sc.next();
                //2.封装 Student对象
                Student stu = new Student(stuId, stuName, stuAge, stuAddress);

                //3.将Student对象添加到ArrayList集合容器中
                list.add(stu);

                //4.提示信息
                System.out.println("添加成功");
                break lo;
            } else {
                System.out.println("学号存在，请重新输入。");
            }
        }
    }

    public static void viewStu(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("无学生信息，请先添加");
            return;
        } else {
            System.out.println("学号\t\t姓名\t\t年龄\t\t地址");
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                System.out.println(stu.getStuId() + "\t\t" + stu.getStuName() + "\t\t" + stu.getStuAge() + "岁\t\t" + stu.getStuAddress());
            }
        }
    }



    public static int getIndex(ArrayList<Student> list, String stuId){
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if(stuId.equals(stu.getStuId())){
                index = i;
            }
        }
        return index;
    }

    public static void deleteStu(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的学生信息的学号：");
        String deleteId = sc.nextLine();

        int index = getIndex(list, deleteId);
        if(index == -1){
            System.out.println("学号不存在，请查证后输入");
        }else{
            list.remove(index);
            System.out.println("删除成功");
        }
    }

    public static void updateStu(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生信息的学号：");
        String stuId = sc.next();

        int index = getIndex(list, stuId);

        if(index == -1){
            System.out.println("学号不存在，请查证后操作");
        }else{
            System.out.println("请输入姓名：");
            String stuName = sc.next();
            System.out.println("请输入年龄：");
            int stuAge = sc.nextInt();
            System.out.println("请输入地址：");
            String stuAddress = sc.next();

            Student stu = new Student(stuId,stuName,stuAge,stuAddress);
            list.set(index,stu);

            System.out.println("修改成功");
        }
    }
}
