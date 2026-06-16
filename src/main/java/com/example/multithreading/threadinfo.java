package com.example.multithreading;

public class threadinfo {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();

        System.out.println("Thread name: " + currentThread.getName());
        System.out.println("Thread ID: " + currentThread.threadId());
    }
}
