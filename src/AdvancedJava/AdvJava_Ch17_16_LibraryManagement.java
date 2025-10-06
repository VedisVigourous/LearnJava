package AdvancedJava;
import java.util.*;

public class AdvJava_Ch17_16_LibraryManagement {

    /* Guidelines of Project - Library Management System :

       * Must be capable of Issuing Books.
       * Info must be like 1. Bookname
                           2. Author
                           3. Issued to
                           4. Issue Date

       * Must be Iterative until user don't want to access the LMS again
       * User must be able to add books and return issue books (better if created to spaces consumer and owner)
       * Books issuing must be only available to card-holders     */

    public static void main(String[] args) {
        // Defining Scanner - object
        Scanner input = new Scanner(System.in);

        // Welcome, Page and designation selector
        System.out.println("Welcome to Library Management System::");
        System.out.print("Enter Your Name: "); String name= input.nextLine();
        System.out.println("Select Designation: \n1.Admin\n2.Student");
        System.out.print("Enter Choice: "); int designation = input.nextInt();

        // Defining Books and related terms
    }
}
