package com.itheima._09内部类_局部内部类;

/**
 * 几乎不用
 *
 * 什么是局部内部类？
 *--定义在方法，构造器，代码块，for循环中的内部类
 *
 * 局部内部类中的成分特点：
 * --只能定义实例成员，不能定义静态成员
 * --可以定义常量的
 *
 * 小结：
 * --局部内部类没啥用
 */
public class InnerClass {
    static {
        abstract class A{//定义在代码块中

        }
    }

    public static void main(String[] args) {
        class A{//定义在main方法中
            private String name;

            public void test(){

            }

            public A() {

            }

            public A(String name) {
                this.name = name;
                class B{//定义在构造器中

                }
            }
        }

        A a = new A();
        a.test();
    }

    public static void test(){
        class Animal{//定义在方法中

        }
    }
}
