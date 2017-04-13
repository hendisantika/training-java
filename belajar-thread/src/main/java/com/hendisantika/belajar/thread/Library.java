package com.hendisantika.belajar.thread;

/**
 * Created by hendisantika on 4/13/17.
 */
public class Library {
    Output output;

    public Library(Output output) {
        this.output = output;
    }

    public void run() {
        output.print("Library Print.");

    }
}
