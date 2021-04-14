package com.itheima._04Set系列集合;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet集合自排序的方式：
 *      1.有值特性的元素可以直接升序排序(浮点型，整型)
 *      2.String类型的元素会按照首字母的编号排序
 *      3.对于自定义的引用数据类型，TreeSet默认无法排序，执行的时候直接报错，
 *          因为不知道排序规则
 *
 * 自定义的引用数据类型的排序实现
 *      对于自定义的引用数据类型，TreeSet默认无法排序
 *
 *      所以需要定制排序的大小规则，程序员定义大小规则的方案有两种：
 *
 *      1.直接为对象的类实现比较器规则【接口Comparable】，重写比较方法(拓展方式)
 *           //Java规则，如果程序员认为比较者>被比较者，返回正数
 *           //Java规则，如果程序员认为比较者<被比较者，返回复数
 *           //Java规则，如果程序员认为比较者=被比较者，返回0
 *
 *      2.直接为集合设置【比较器Comparator对象】，重写比较方法
 *           //Java规则，如果程序员认为比较者>被比较者，返回正数
 *           //Java规则，如果程序员认为比较者<被比较者，返回复数
 *           //Java规则，如果程序员认为比较者=被比较者，返回0
 *       注意：如果类和集合都带有比较规则，优先使用集合自带的比较器规则
 *
 *  小结：
 *      TreeSet集合对自定义引用数据类型排序，默认无法进行
 *      但是程序员有两种方法可以实现比较
 */
public class TreeSetDemo05 {
    public static void main(String[] args) {
        //TreeSet：排序不重复集合
        Set<String> sets = new TreeSet<>();
        sets.add("Kris");
        sets.add("Wu");
        sets.add("12");
        sets.add("90");
        sets.add("Anna");
        sets.add("瑶");
        sets.add("anna");
        System.out.println(sets);
        //[12, 90, Anna, Kris, Wu, anna, 瑶]

        //引用数据类型定义TreeSet集合
        Set<Employee> employees = new TreeSet<>();
        employees.add(new Employee("Kris",100,22));
        employees.add(new Employee("Kendall",100,25));
        employees.add(new Employee("Kim",120,29));
        System.out.println(employees);
        System.out.println("------------------");
        //没办法排序这样的自定义的对象数据，ClassCastException

        //2.
        // public TreeSet(Comparator<? super E> comparator)
        //集合自带比较器对象(加了一个匿名内部类)
        //集合自带比较器和类实现比较器接口同时存在，优先哪一个？优先遵循集合自带的比较器
        Set<Employee> es = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //Java规则，如果程序员认为比较者>被比较者，返回正数
                //Java规则，如果程序员认为比较者<被比较者，返回复数
                //Java规则，如果程序员认为比较者=被比较者，返回0
                //o1是比较者，o2是被比较者
//                return o1.getAge() - o2.getAge();
                return o2.getAge() - o1.getAge();
            }
        });
        es.add(new Employee("Kris",100,22));
        es.add(new Employee("Kendall",100,25));
        es.add(new Employee("Kim",120,29));
        System.out.println(es);

    }
}

class Employee implements Comparable<Employee>{//1.第一种
    private String name;
    private double salary;
    private int age;

    //重写了比较方法
    @Override
    public int compareTo(Employee o) {
        //Java规则，如果程序员认为比较者>被比较者，返回正数
        //Java规则，如果程序员认为比较者<被比较者，返回复数
        //Java规则，如果程序员认为比较者=被比较者，返回0

        /*
        if(this.age > o.age){
            return 1;
        }else if(this.age < o.age){
            return -1;
        }

         */
        return this.age - o.age;//上面的if语句，一句代替
    }


    public Employee() {
    }

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}