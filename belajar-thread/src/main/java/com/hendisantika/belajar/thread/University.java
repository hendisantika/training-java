package com.hendisantika.belajar.thread;

/**
 * Created by hendisantika on 4/13/17.
 */
public class University extends Thread {
    Output output;

    public University(Output output) {
        this.output = output;
    }

    public void run(){
        output.print("University Print.");
        output.scan("University Print.");
    }
}
