package com.itheima.test;

import com.itheima.domain.Student;
import com.itheima.method.Operator;

import java.util.ArrayList;
import java.util.Scanner;

public class SystemTest {
    public static void main(String[] args) {
        //创建集合容器对象
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        lo:
        while (true) {
            Operator.mainInterface();

            int num = sc.nextInt();

            switch (num) {
                case 1:
                    Operator.insertInfo(list);
                    break;
                case 2:
                    Operator.queryInfo(list);
                    break;
                case 3:
                    Operator.deleteInfo(list);
                    break;
                case 4:
                    Operator.updateInfo(list);
                    break;
                case 5:
                    System.out.println("Thanks for using!");
                    break lo;
                default:
                    System.out.println("Wrong choice.Please re-enter.");
            }
        }
    }
}
