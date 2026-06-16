package com.example.multithreading;

public class threadMethod_Daemon {
    public static void main(String[] args) throws InterruptedException {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread is running");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Daemon thread interrupted");
                }
            }
        });

        daemonThread.setDaemon(true);
        daemonThread.start();

        System.out.println("Main thread starts");
        Thread.sleep(2000);
        System.out.println("Main thread ends");
    }
}
