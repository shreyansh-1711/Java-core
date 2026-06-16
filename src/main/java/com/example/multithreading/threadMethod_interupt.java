package com.example.multithreading;

public class threadMethod_interupt {
    public static void main(String[] args) {
//        Thread worker = new Thread(() -> {
//            try {
//                System.out.println("Worker thread is going to sleep");
//                Thread.sleep(5000);
//                System.out.println("Worker thread woke up normally");
//            } catch (InterruptedException e) {
//                System.out.println("Worker thread was interrupted");
//            }
//        });
//
//        worker.start();
//        worker.interrupt();


        Thread t1 = new Thread(() -> {
            while(!Thread.currentThread().interrupted()) {
                System.out.println("Running");
            }
        });

        t1.start();

        Thread.sleep(2000);

        t1.interrupt();
    }
}
