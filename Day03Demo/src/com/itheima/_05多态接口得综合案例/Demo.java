package com.itheima._05多态接口得综合案例;

/**
 * 拓展：面向对象思想设计一个电脑对象，可以接入个USB设备
 *      （鼠标，键盘：实现接入，调用独立功能，拔出）
 *
 * 分析：
 * --1.提供2个USB设备。（USB设备必须满足：接口和拔出得功能）
 * --2.定义一个USB的接口（申明USB设备的规范必须是：实现接入和拔出的功能）
 * --3.开始定义2个真实的实现类代表键盘和鼠标
 * --4.定义一个电脑类
 *
 *
 *小结：
 * --理解面向对象的设计思想
 */

public class Demo {
    public static void main(String[] args) {
        //1.买一台电脑
        Computer c = new Computer();
        //2.买一个鼠标
        USB u1 = new Mouse("mi");
        c.install(u1);
        //3.买一个键盘
        USB u2 = new Keyboard("LuoJi380");
        c.install(u2);
    }
}
class Computer{
    //提供一个安装USB设备的入口
    public void install(USB usb){
        usb.connect();

        if(usb instanceof Keyboard){
            Keyboard kb = (Keyboard) usb;
            kb.keyDown();
        }else if(usb instanceof Mouse){
            Mouse m = (Mouse) usb;
            m.click();
        }

        usb.unconnected();

    }
}

//定义2个USB设备：鼠标，键盘
class Keyboard implements USB{
    private String name;

    public Keyboard(String name) {
        this.name = name;
    }

    public void keyDown(){
        System.out.println(name+"写入");
    }

    @Override
    public void connect() {
        System.out.println(name+"成功接入");
    }

    @Override
    public void unconnected() {
        System.out.println(name+"成功拔出");
    }
}

class Mouse implements USB{
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    public void click(){
        System.out.println(name+"双击");
    }

    @Override
    public void connect() {
        System.out.println(name+"成功接入");
    }

    @Override
    public void unconnected() {
        System.out.println(name+"成功拔出");
    }
}

interface USB{
    void connect();//接入
    void unconnected();//拔出
}