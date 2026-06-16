package com.example.multithreading;

public class runnable {
    public static void main(String[] args) {
        MyRunnable task = new MyRunnable();
        Thread thread = new Thread(task);
        thread.start();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Runnable is running");
        }
    }
}
