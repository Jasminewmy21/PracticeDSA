package com.itheima.array;
/*
    封装学生对象存入数组
    随后遍历数组，将学生信息输出在控制台
 */
import com.itheima.domain.Student;

/*
    封装3个学生对象并存入数组
 */
public class TestObjectArray {
    public static void main(String[] args) {
        {
        /*
            数组存储Student类对象
         */
            //动态初始化长度为3的数组，类型为Student类型
            Student[] arr = new Student[3];

            //根据需求创建3个学生对象
            Student s1 = new Student("Kris Wu", 30);
            Student s2 = new Student("Kendall", 25);
            Student s3 = new Student("Kim", 40);

            //将学生对象存入数组
            arr[0] = s1;
            arr[1] = s2;
            arr[2] = s3;

            //遍历数组
            for (int i = 0; i < arr.length; i++) {
                //System.out.println(arr[i]);
            /*
                com.itheima.domain.Student@7ef20235
                com.itheima.domain.Student@27d6c5e0
                com.itheima.domain.Student@4f3f5b24
                存的是地址
             */
                Student s = arr[i];
                System.out.println(s.getName() + " " + s.getAge());
            }
            /*
                容器长度固定，每次来一个或多个新数据，就需要重新定义容器长度，非常麻烦
             */
        }

    }
}
