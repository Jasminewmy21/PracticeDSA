package com.itheima03;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        /*
        String s = "18903984833";
        String s1 = s.substring(3);
        System.out.println(s1);

        String s2 = s.substring(0, 3);
        System.out.println(s2);
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Phone number:");
        String s = sc.nextLine();

        String sPhoneNum = s.substring(0, 3);
        String ePhoneNum = s.substring(7);
        System.out.println(sPhoneNum + "****" + ePhoneNum);
    }
}
