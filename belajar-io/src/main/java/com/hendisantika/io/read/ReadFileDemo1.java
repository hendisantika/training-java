package com.hendisantika.io.read;

import java.io.*;

/**
 * Created by hendisantika on 4/9/17.
 */
public class ReadFileDemo1 {
    public static void main(String[] args) {
        //Specify the path of the file here
//        File file = new File("/tmp/newfile.txt");
        File file = new File("/tmp/myfile.txt");
        BufferedInputStream bis = null;
        FileInputStream fis = null;

        try
        {
            //FileInputStream to read the file
            fis = new FileInputStream(file);

          /*Passed the FileInputStream to BufferedInputStream
           *For Fast read using the buffer array.*/
            bis = new BufferedInputStream(fis);

          /*available() method of BufferedInputStream
           * returns 0 when there are no more bytes
           * present in the file to be read*/
            while( bis.available() > 0 ){
                System.out.print((char)bis.read());
            }

        }catch(FileNotFoundException fnfe)
        {
            System.out.println("The specified file not found" + fnfe);
        }
        catch(IOException ioe)
        {
            System.out.println("I/O Exception: " + ioe);
        }
        finally
        {
            try{
                if(bis != null && fis!=null)
                {
                    fis.close();
                    bis.close();
                }
            }catch(IOException ioe)
            {
                System.out.println("Error in InputStream close(): " + ioe);
            }
        }
    }
}
