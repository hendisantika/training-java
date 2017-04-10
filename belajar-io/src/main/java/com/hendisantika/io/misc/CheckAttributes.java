package com.hendisantika.io.misc;

import java.io.File;
import java.io.IOException;

/**
 * Created by hendisantika on 4/10/17.
 */
public class CheckAttributes {
    public static void main(String[] args) throws IOException
    {
        File myfile = new File("/tmp/Myfile.txt");
        if (myfile.canWrite())
        {
            System.out.println("File is writable.");
        }
        else
        {
            System.out.println("File is read only.");
        }
    }
}
