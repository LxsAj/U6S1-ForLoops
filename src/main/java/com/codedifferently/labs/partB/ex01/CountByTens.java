package com.codedifferently.labs.partB.ex01;

public class CountByTens {
    public static String countingByTens() {
        String response = "";
        for(int i = 10; i <=100; i+=10){
            response += i + " ";
        }

        return response;

    }

    public static void main(String[] args) {
        String counting = countingByTens();
        System.out.print(counting);
    }
}
