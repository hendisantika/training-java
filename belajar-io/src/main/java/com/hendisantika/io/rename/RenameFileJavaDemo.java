package com.hendisantika.io.rename;

import java.io.File;

/**
 * Created by hendisantika on 4/10/17.
 */
public class RenameFileJavaDemo {
    public static void main(String[] args)
    {
        //Old File
        File oldfile = new File("/tmp/myfile.txt");
        //New File
        File newfile = new File("/tmp/mynewfile.txt");
	/*renameTo() return boolean value
	 * It return true if rename operation is
	 * successful
	 */
        boolean flag = oldfile.renameTo(newfile);
        if(flag){
            System.out.println("File renamed successfully");
        }else{
            System.out.println("Rename operation failed");
        }
    }
}
