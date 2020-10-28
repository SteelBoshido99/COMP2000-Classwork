package com;

public class Login {
        private static String userName = " bob";
        private static String passWord = "pass";

        static void login(){
            System.out.println("Checking Password.....");
            if (passWord == "pass" && userName == " bob"){
                System.out.println("Logging in" + userName);
            } else {
                System.out.println("Incorrect password or username");
            }
        }
    }
