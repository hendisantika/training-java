package com.hendisantika.io.misc;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * Created by hendisantika on 4/10/17.
 */
public class LastModifiedDateExample {
    public static void main(String[] args)
    {
        //Specify the file path and name
        File file = new File("/tmp/Myfile.txt");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println("Last Modified Date: " + sdf.format(file.lastModified()));
    }
}
