package com.codedifferently.labs.partB.ex03;

public class Challenge {
    public static String challenge(){
        String response = "";

        String[] names = {"Kaleb","Tariq","Gio","Sam","Steph","Michael"};
        for (String name : names) {
            System.out.println(name);
        }

        return response;
    }

    public static void main(String[] args) {

        String outputFromChallenge = challenge();
        System.out.println(outputFromChallenge);
    }
}
