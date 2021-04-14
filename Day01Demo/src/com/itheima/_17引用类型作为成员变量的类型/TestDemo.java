package com.itheima._17引用类型作为成员变量的类型;

public class TestDemo {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("KrisWu");
        stu.setAge(18);

        Address addr = new Address("110", "LA", 001, 002);
        stu.setAddress(addr);

        Address addr1 = stu.getAddress();
        System.out.println(addr1.getCode() + " " + addr1.getName());
    }
}
