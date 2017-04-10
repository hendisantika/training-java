package com.hendisantika.io.misc;

import java.io.File;
import java.io.IOException;

/**
 * Created by hendisantika on 4/10/17.
 */
public class HiddenPropertyCheck {
    public static void main(String[] args) throws IOException, SecurityException
    {
        // Provide the complete file path here
        File file = new File("/tmp/myfile.txt");

        if(file.isHidden()){
            System.out.println("The specified file is hidden");
        }else{
            System.out.println("The specified file is not hidden");
        }
    }

}
