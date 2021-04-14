package com.itheima.array;

import com.itheima.domain.Student;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = getStudent();
        Student stu2 = getStudent();
        Student stu3 = getStudent();
        Student stu4 = getStudent();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + " " + stu.getAge());
        }
        System.out.println("------------------------");
        //list.remove("KrisWu");//只会删除第一个匹配的，之后就不管，所以要遍历集合删除

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if ("KrisWu".equals(stu.getName())) {
                list.remove(i);
                i--;//一定要记得i--，因为删除一个所有数据就会向前移动一格，如果最后一个也匹配，它会进到前一个，但是索引已经走到最后一个了
            }
        }

        /*
        for (int i = list.size() - 1; i >= 0; i--) {
            Student stu = list.get(i);
            if ("KrisWu".equals(stu.getName())) {
                list.remove(i);
            }
        }//索引倒着来，不用最后i--
         */

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + " " + stu.getAge());
        }


    }

    public static Student getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        String name = sc.next();//next接收数据不能有空格
        System.out.println("Age:");
        int age = sc.nextInt();

        Student stu = new Student(name, age);

        return stu;
    }
}
