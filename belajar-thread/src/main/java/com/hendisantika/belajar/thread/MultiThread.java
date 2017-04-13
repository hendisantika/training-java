package com.hendisantika.belajar.thread;

/**
 * Created by hendisantika on 4/13/17.
 */
public class MultiThread extends Thread{
    public void run(){
        System.out.println("Running Thread Name: "+ this.currentThread().getName());
        System.out.println("Running Thread Priority: "+ this.currentThread().getPriority());
    }
}
