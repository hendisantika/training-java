package com.hendisantika.belajar.thread;

/**
 * Created by hendisantika on 4/13/17.
 */
public class RunnableThread {
    public void run() {
        try {
            System.out.println("Runnable Thread:" + Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());

        }
    }
}
