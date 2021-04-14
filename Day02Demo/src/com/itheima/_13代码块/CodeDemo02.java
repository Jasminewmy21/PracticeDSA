package com.itheima._13代码块;

/**
 * 实例代码块(用的少)
 *
 * 格式:{}
 * --必须无static修饰.属于【类的每个对象的】,会与【类的每个对象】一起加载,
 *   每次创建对象的时候,实例代码块就会触发执行一次
 * --实例代码块可【用于初始化实例资源】(拓展)
 * --实例代码块的代码实际上是提取到每个构造器中执行的(拓展 了解)
 *
 * 小结:记住语法
 */
public class CodeDemo02 {
    private String name;
    {
        //每次创建对象的时候,实例代码块就会触发执行一次
        System.out.println("每次创建对象,实例代码块执行一次");
        name = "KrisWu";
    }

    public static void main(String[] args) {
        CodeDemo02 c1 = new CodeDemo02();
        CodeDemo02 c2 = new CodeDemo02();
        new CodeDemo02();
        new CodeDemo02();
    }
}
