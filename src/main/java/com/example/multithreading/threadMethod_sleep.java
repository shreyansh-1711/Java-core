package com.example.multithreading;

public class threadMethod_sleep {
    public static void main(String[] args) {
        System.out.println("Main thread starts");

        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {}

        System.out.println("Main thread ends");
    }
}
