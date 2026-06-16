package com.example.multithreading;

public class threadMethod_priority {
    public static void main(String[] args) {
        Thread lowPriorityThread = new Thread(() -> {
            System.out.println("Low priority thread running");
        });

        Thread highPriorityThread = new Thread(() -> {
            System.out.println("High priority thread running");
        });

        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Low thread priority: " + lowPriorityThread.getPriority());
        System.out.println("High thread priority: " + highPriorityThread.getPriority());

        lowPriorityThread.start();
        highPriorityThread.start();
    }
}
