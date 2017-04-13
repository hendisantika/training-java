package com.hendisantika.belajar.thread;

/**
 * Created by hendisantika on 4/13/17.
 */
public class MultiThreadingTutorial {
    public static void main(String[] args) {
        MultiThread multiThread1 = new MultiThread();
        multiThread1.setName("Thread1");
        multiThread1.setPriority(Thread.MIN_PRIORITY);

        MultiThread multiThread2 = new MultiThread();
        multiThread2.setName("Thread2");
        multiThread2.setPriority(Thread.MAX_PRIORITY);

        MultiThread multiThread3 = new MultiThread();
        multiThread3.setName("Thread3");

        multiThread1.start();
        multiThread2.start();
        multiThread3.start();
    }
}
