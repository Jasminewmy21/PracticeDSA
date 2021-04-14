package com.practice;

import com.domain.Student;

import java.util.Scanner;

/*
    切割字符串
 */
public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("字符串：");
        String s = sc.nextLine();

        String[] strings = s.split(",");
        Student stu = new Student(strings[0], strings[1]);

        System.out.println(stu.getName() + " " + stu.getAge());

    }
}
