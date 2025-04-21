package com.codedifferently.labs.partB.ex02;

public class FixThisLoop {

    public static String hello(){
        String response = "";

        for (int i = 1; i<= 5; i++){
            System.out.println("Hello");
        }

        return response;

    }
    public static void main(String[] args) {

        String outputFromHello = hello();
        System.out.println(outputFromHello);
    }
}
