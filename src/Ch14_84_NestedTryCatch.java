import java.util.Scanner;
public class Ch14_84_NestedTryCatch {
    public static void main(String[] args) {
        System.out.println();

        // When you think a particular block of code within a try catch can give error - you can surround it with a nested try - catch block

        Scanner input = new Scanner(System.in);
        String [] branches = {"CSE" , "ECE" , "Mechanical" , "Chemical" , "Civil"};

        try{
            System.out.println("Welcome To College DBMS!");
            System.out.print("Enter Your Name: "); String name = input.nextLine();
            System.out.print("Enter Your Roll No: "); int rollno = input.nextInt();

            // Note Exceptions like putting a String Value can occur in these so sorroudning it using try-catch block
            // Now asking branch to use the specified array and tackling exceptions which could occur.

            System.out.println("Branches:\n0.CSE\n1.ECE\n2.Mechanical\n3.Chemical\n4.Civil");

            try{ //Nested Try Catch - Only Exception that could occur is - ArrayOutOfBoundException
                System.out.print("Enter Your Branch S.No: "); int branch = input.nextInt();System.out.println("*******");

                System.out.println("Accessing Databases:");
                System.out.println("Name: " + name);
                System.out.println("Roll No: " + rollno);
                System.out.println("Branch: " + branches[branch]);System.out.println();

                System.out.println("Records Found...");
            }
            catch (ArrayIndexOutOfBoundsException error){ // Level 2
                System.out.println("!! Invalid Branch S.No Filled !!");
            }
        } catch (Exception e) {
            System.out.println("Invalid  Queries"); // Level 1
        }

        // Note: try-catch blocks are reffered to as Levels i.e. for a nested try catch block it will be Level 2 and obviously the main try-catch is level 1
        /* try{
            * Level 1
              try{
                * Level 2
               }
               catch () {
               }
           }
           catch(){
           } */

        // That is with each nested try-catch block the Levels Increase - infinite try-catch block can be inserted

        /* In a nutshell -
           1. a try - catch can have another try-catch within it if you think a particular code block can give you an error
           2. try - catch are reffered as array that is\
              First try-catch - Level 1
              Second try-catch within first - Level 2 and so on
           3. a try catch can have infinite nested try-catch blocks   */

        // ***************************************************************** //

        // Quick quiz - Write a program to access array again and again unti ArrayOutofBoundIndex Exception occurs
        // Solution: Using a while loop to access a block of code again and again

        System.out.println();
        System.out.println();

        int [] tables = {0 , 1 , 2 , 3 , 5 , 5 , 6 , 7 , 8 , 9 , 10};
        int [] number1to10 = {0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
        try {
            while (true){
                System.out.print("* Enter the number (0 to 10): "); int number = input.nextInt();
                System.out.print("* Number you want to multiply with (0 to 10): "); int mulitply = input.nextInt();
                System.out.println("* Product: " + tables[number]*number1to10[mulitply]);
                System.out.println();
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("~ Error: Invalid Indexes Filled !!");
        }
    }
}
