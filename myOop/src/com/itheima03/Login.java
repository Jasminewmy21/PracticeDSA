package com.itheima03;

import java.util.Scanner;

/*
    Test类
 */
public class Login {
    public static void main(String[] args) {
        String username = "KrisWuBaby";
        String password = "MaMaAiNi";

        for (int i = 1; i <= 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please input your username:");
            String scUsername = sc.nextLine();
            System.out.println("Please input your password:");
            String scPassword = sc.nextLine();

            if ((username.equals(scUsername)) && (password.equals(scPassword))) {
                System.out.println("Landing success.");
                break;
            } else {
                if (i == 3) {
                    System.out.println("Landing failure.Try later.");
                }else{
                    System.out.println("Landing failure.You have " + (3 - i) + " more opportunities left.");
                }
            }
        }

    }
}
