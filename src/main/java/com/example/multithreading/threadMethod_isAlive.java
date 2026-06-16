package com.example.multithreading;

public class threadMethod_isAlive {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Worker thread interrupted");
            }
        });

        System.out.println("Before start: " + worker.isAlive());

        worker.start();
        System.out.println("After start: " + worker.isAlive());

        worker.join();
        System.out.println("After finish: " + worker.isAlive());
    }
}
