package com.hendisantika.io.misc;

import java.io.File;
import java.io.IOException;

/**
 * Created by hendisantika on 4/10/17.
 */
public class ReadOnlyChangeExample {
    public static void main(String[] args) throws IOException
    {
        File myfile = new File("/tmp/Myfile.txt");
        //making the file read only
        boolean flag = myfile.setReadOnly();
        if (flag==true)
        {
            System.out.println("File successfully converted to Read only mode!!");
        }
        else
        {
            System.out.println("Unsuccessful Operation!!");
        }
    }
}
