package com.itheima._07内部类_静态内部类;

/**
 * 了解语法
 *
 * 什么是静态内部类？
 * --有static修饰，属于外部类本身，只会加载一次
 *
 * 成分研究：
 * --类的成分它都有，静态内部类属于外部类本身，只会加载一次
 * --所以它的特点与外部类是完全一样的，只是位置在别的类里而已
 *      外部类=宿主
 *      内部类=寄生
 * 访问格式：
 *      外部类名称.内部类名称
 * 创建对象的格式：
 *      外部类名称.内部类名称  对象名称 = new  外部类名称.内部类构造器；
 *
 * 访问拓展：
 * --静态内部类中是否可以直接访问外部类的静态成员?可以，外部类的静态成员只有一份，可以被共享
 * --静态内部类中是否可以直接访问外部类的实例成员？不可以，静态内部类属于外部类，而外部类的实例成员必须用外部类对象访问
 */
public class InnerDemo {
    public static void main(String[] args) {
        Out.Inner in = new Out.Inner();
        in.setName("zhang");
        in.setAge(18);
        in.show();
    }
}

class Out{
    public static int age = 12;
    public String school;


    //静态内部类
    public static class Inner{
        private String name;
        private int age;

        public void show(){
            Out o = new Out();
            //静态内部类中是否可以直接访问外部类的实例成员？不可以
            System.out.println(o.school);//但是可以通过创建外部类的对象来访问

            System.out.println(name+" "+age);
            System.out.println(getName()+" "+getAge());
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Inner() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }

}
