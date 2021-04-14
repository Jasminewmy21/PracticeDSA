package com.itheima._10内部类_匿名内部类;

/**
 *
 */
public class Anonymity02 {
    public static void main(String[] args) {
        Swim p1 = new Swim() {
            @Override
            public void swim() {
                System.out.println("Kris Wu has a gift of swimming.");
            }
        };
        competition(p1);
        System.out.println("-----------------------------");

        Swim p2 = new Swim() {
            @Override
            public void swim() {
                System.out.println("Cassie is not good at swimming. It's not her type.");
            }
        };
        competition(p2);
        System.out.println("-----------------------------");

        competition(new Swim() {
            @Override
            public void swim() {
                System.out.println("Kendall loves swimming.");
            }
        });
    }

    public static void competition(Swim s){
        System.out.println("Start:");
        s.swim();
        System.out.println("End:");
    }
}

interface Swim{
    void swim();
}
