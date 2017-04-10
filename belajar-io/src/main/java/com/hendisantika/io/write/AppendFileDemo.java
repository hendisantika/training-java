package com.hendisantika.io.write;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by hendisantika on 4/10/17.
 */
public class AppendFileDemo {
    public static void main( String[] args )
    {
        try{
            String content = "This is my content which would be appended " +
                    "at the end of the specified file";
            //Specify the file name and path here
            File file = new File("/tmp/myfile.txt");

    	/* This logic is to create the file if the
    	 * file is not already present
    	 */
            if(!file.exists()){
                file.createNewFile();
            }

            //Here true is to append the content to file
            FileWriter fw = new FileWriter(file,true);
            //BufferedWriter writer give better performance
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            //Closing BufferedWriter Stream
            bw.close();

            System.out.println("Data successfully appended at the end of file");

        }catch(IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }
}
