package com.example.multithreading;

public class threadMethod_yeild {
    public static void main(String[] args) {
        Thread threadOne = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread-1 step " + i);
                Thread.yield();
            }
        });

        Thread threadTwo = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread-2 step " + i);
            }
        });

        threadOne.start();
        threadTwo.start();
    }
}
