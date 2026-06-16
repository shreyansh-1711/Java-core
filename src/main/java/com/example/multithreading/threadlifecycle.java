package com.example.multithreading;

public class threadlifecycle {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Worker thread interrupted");
            }
        });

        System.out.println("After creating thread: " + worker.getState());

        worker.start();
        System.out.println("After calling start(): " + worker.getState());

        Thread.sleep(100);
        System.out.println("While thread is sleeping: " + worker.getState());

        worker.join();
        System.out.println("After thread finishes: " + worker.getState());
    }
}
