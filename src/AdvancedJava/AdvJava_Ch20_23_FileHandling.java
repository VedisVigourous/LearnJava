package AdvancedJava;
import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
            creation.createNewFile();
            System.out.println("Successfully Created a file !");
        }
        catch (IOException e){
            System.out.println("Unable to Create this file ! -- " + e);
        }

        */  // Commented in order to Handle the created file further [Used later too]

        // New Method : Writing to a file
        /* We use FileWriter Class:
           1. Object creation [ FileWriter <objName> = new FileWriter(<path>); ]
           2. writing using : .write(<String>) method
           3. closing the file.

           * Note Surround everything under : try catch to prevent IOException */

        /*
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Vedant\\Documents\\PlayGrounds\\MyJava\\src\\AdvancedJava\\HandledFile\\AdvJava_01_FileHandling.txt");
            fileWriter.write("* This is my First Handled file using Java \n  ~ Thank You");
            fileWriter.close();
            System.out.println("Succesfully Written the file !"); // Notes: Resets all the content of the file with the specified content.
        }
        catch (IOException e){
            System.out.println(e);
        }
        */

        /* Reading a file:
           Using File class and Scanner Class -- Handle FileNotFound Exception

           Syntax: Object creation with Path and -- Scanner <name> = new Scanner(Object_Name);
           As scanner class reads the content we need to run a loop to print the content and close the file */

        /*
        try {
            File readingFile = new File("C:\\Users\\Vedant\\Documents\\PlayGrounds\\MyJava\\src\\AdvancedJava\\HandledFile\\AdvJava_01_FileHandling.txt");
            Scanner reading = new Scanner(readingFile);

            while (reading.hasNextLine()){ // Runs till the file has string
                String line = reading.nextLine(); // allocates the string in this variable
                System.out.println(line); // Prints the variable
            }

            reading.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        */

        /* Deleting a file:
           * Creating an object with path
           * Using .delete() method
           * Writing in if-else - for a dynamic program  */

        /*
            File delFile = new File("C:\\Users\\Vedant\\Documents\\PlayGrounds\\MyJava\\src\\AdvancedJava\\HandledFile\\AdvJava_01_FileHandling.txt");
            if (delFile.delete()){
                System.out.println(delFile.getName() + " has been Deleted!"); // getName() - prints the name of the file
            }
            else {
                System.out.println("Unable to Delete !");
            }
        */
    }
}

// Note: Other methods on :: @https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/io/File.html#method-summary