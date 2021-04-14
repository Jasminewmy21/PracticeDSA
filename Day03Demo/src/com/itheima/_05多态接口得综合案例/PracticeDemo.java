package com.itheima._05多态接口得综合案例;

/**
 * 拓展：面向对象思想设计一个电脑对象，可以接入个USB设备
 * （鼠标，键盘：实现接入，调用独立功能，拔出）
 */
public class PracticeDemo {
    public static void main(String[] args) {
        Computer01 c = new Computer01();

        Mouse01 m = new Mouse01("Logitech");
        c.install(m);

        KeyBoard kb = new KeyBoard("LuoJi");
        c.install(kb);

    }
}


interface Usb {
    void connect();
    void unconnected();
}

class Computer01 {
    public void install(Usb usb) {
        usb.connect();

        if(usb instanceof Mouse01){
            Mouse01 mouse = (Mouse01) usb;
            mouse.click();
        }else if(usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.writeDown();
        }
        usb.unconnected();
    }
}

class Mouse01 implements Usb {

    private String name;

    public Mouse01() {
    }

    public Mouse01(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println("Mouse " + name + " connect.");
    }

    @Override
    public void unconnected() {
        System.out.println("Mouse " + name + " unconnected.");
    }

    public void click() {
        System.out.println("Mouse " + name + " click.");
    }
}

class KeyBoard implements Usb {

    private String name;

    @Override
    public void connect() {
        System.out.println("Keyboard " + name + " connect.");
    }

    @Override
    public void unconnected() {
        System.out.println("Keyboard " + name + " unconnected.");
    }

    public void writeDown() {
        System.out.println("Keyboard " + name + " write.");
    }

    public KeyBoard() {
    }

    public KeyBoard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}