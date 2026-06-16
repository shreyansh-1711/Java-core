package com.example.multithreading;

public class threadexecutionorder {
    public static void main(String[] args) {
        MyThread threadOne = new MyThread("Thread-1");
        MyThread threadTwo = new MyThread("Thread-2");
        MyThread threadThree = new MyThread("Thread-3");

        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }

    static class MyThread extends Thread {
        private final String threadName;

        MyThread(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " executing step " + i);
            }
        }
    }
}
