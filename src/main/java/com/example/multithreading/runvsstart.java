package com.example.multithreading;

public class runvsstart {
    public static void main(String[] args) {
        MyThread thread = new MyThread();

        System.out.println("Calling run():");
        thread.run();

        System.out.println();

        System.out.println("Calling start():");
        thread.start();
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Running inside thread: " + Thread.currentThread().getName());
        }
    }
}

•
//run() behaves like a normal method call, so it runs on main.
//        •
//start() creates a new thread, then Java calls run() inside that new thread.
