package com.thuduyen07.tutorialRemoteDebug;

public class Alphabet {
    public static void main(String[] args) {
        System.out.println("Starting");
        for (char c = 'A'; c <= 'Z'; c++) {
            try {
                Thread.sleep(250);  //java.lang
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(c);
        }
        System.out.println("Complete");
    }
}
