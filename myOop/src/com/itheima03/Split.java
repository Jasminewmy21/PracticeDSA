package com.itheima03;

import com.domain.Student;

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        //1.键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);
        System.out.println("输入信息：");
        String stuInfo = sc.nextLine();

        //2.根据逗号切割字符串，得到 ”姓名“ ”年龄“
        String[] sArr = stuInfo.split(",");

        /*
        for (int i = 0; i < sArr.length; i++) {
            System.out.println(sArr[i]);
        }
         */

        //3.从得到的字符串数组中取出元素内容，通过student类的有参构造方法封装为对象
        Student s = new Student(sArr[0], sArr[1]);

        //4.调用对象的getXxx方法，取出数据并打印
        System.out.println(s.getName() + " " + s.getAge());

    }
}
