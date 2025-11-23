package AdvancedJava;
import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AdvJava_Ch20_23_FileHandling {
    public static void main(String[] args) {
        System.out.println();

        /* File handling is an important aspect of a coding language.
           * It includes : Reading and Writing to files.
           * File class is used: to manipulate.  */

        // Note: import java.io.File;

        /* Syntax: File <objName> = new File(<Path>); and then use .createNewFile() method
           Need to surround the method with tryCatch to avoid IOException
         */

        /*


        File creation = new File("C:\\Users\\Vedant\\Documents\\PlayGrounds\\MyJava\\src\\AdvancedJava\\HandledFile\\AdvJava_01_FileHandling.txt");
        try {
            //noinspection ResultOfMethodCallIgnored
            creation.createNewFile();\
            System.out.println("Successfully Created a file !");
        }
        catch (IOException e){
            System.out.println("Unable to Create this file ! -- " + e);
        }


         */ // Commented in order to Handle the created file further.

        // New Method : Writing to a file
        /* We use FileWriter Class:
           1. Object creation [ FileWriter <objName> = new FileWriter(<path>); ]
           2. writing using : .write(<String>) method
           3. closing the file.

           * Note Surround everything under : try catch to prevent IOException */

        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Vedant\\Documents\\PlayGrounds\\MyJava\\src\\AdvancedJava\\HandledFile\\AdvJava_01_FileHandling.txt");
            fileWriter.write("* This is my First Handled file using Java \n  ~ Thank You");
            fileWriter.close();
            System.out.println("Succesfully Written the file !");
        }
        catch (IOException e){
            System.out.println(e);
        }

    }
}
