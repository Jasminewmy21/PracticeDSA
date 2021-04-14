package com.practice.method;

import com.practice.domain.Student;
import com.sun.jdi.event.MethodEntryEvent;

import java.util.ArrayList;
import java.util.Scanner;


/*
    主界面菜单
 */
public class Menu {
    public static void mainInterface() {
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        lo:
        while (true) {
            System.out.println("--------学生管理系统--------");
            System.out.println("1.添加学生信息");
            System.out.println("2.删除学生信息");
            System.out.println("3.查看学生信息");
            System.out.println("4.修改学生信息");
            System.out.println("5.退出系统");

            System.out.println("请输出你的选择:");
            int menuChoice = sc.nextInt();

            switch (menuChoice) {
                case 1:
                    Method.addStu(list);
                    break;
                case 2:
                    Method.deleteStu(list);
                    break;
                case 3:
                    Method.viewStu(list);
                    break;
                case 4:
                    Method.updateStu(list);
                    break;
                case 5:
                    System.out.println("感谢使用");
                    break lo;
                default:
                    System.out.println("选项不存在，请输入正确选项。");
                    break;
            }
        }
    }
}
