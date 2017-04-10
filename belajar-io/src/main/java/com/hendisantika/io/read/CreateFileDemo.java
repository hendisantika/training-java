package com.hendisantika.io.read;

import java.io.File;
import java.io.IOException;

/**
 * Created by hendisantika on 4/9/17.
 */
public class CreateFileDemo {
    public static void main( String[] args )
    {
        try {
//            File file = new File("/tmp/newfile.txt");
            File file = new File("/tmp/myfile.txt");
	     /*If file gets created then the createNewFile()
	      * method would return true or if the file is
	      * already present it would return false
	      */
            boolean fvar = file.createNewFile();
            if (fvar){
                System.out.println("File has been created successfully");
            }
            else{
                System.out.println("File already present at the specified location");
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
    }
}
