import java.util.Scanner;
public class Ch14_87_FinallyBlock {

    public static int divide(){
        Scanner numbers = new Scanner(System.in);
        System.out.print("Number 1? "); int num1 = numbers.nextInt();
        System.out.print("Number 2? "); int num2 = numbers.nextInt();

        try {
            int quotient = num1/num2;
            return quotient; // Note if exception doesn't occur the code wraps here that is anything beyond this will not be printed in this divide() method.
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Exitting...");
        } // But due to finally statement even if code runs well "Exitting" will be printed. If 'finally' is not present here, on succesful execution nothing beyond return is printed.
        return -1;
    }

    public static void GroceryList() {
        Scanner itemRemove = new Scanner(System.in);
        System.out.println("Welcome to 5 Item Store !");
        String[] cart = {"Noodles", "Soft Drinks", "Pulses", "Biscuits", "Grocery", "Milk"};
        System.out.println("Your Cart contains: ");
        try {
            for (int list = 0; list <= 4; list++) {
                System.out.println(cart[list]);
                if (list >= 4) {
                    break;
                }
            }
        }
        finally {
            System.out.println();
            System.out.println("Items beyond the count of 5 ignored");
            System.out.println("!! You cannot carry more than 5 items !!");
            System.out.println("Your cart contains: " + cart.length + " items!");
            System.out.println();
            System.out.println("Please review your list!!");
        }
    }


    public static void main(String[] args) {
        System.out.println();

        /* Finally Block - It contains codes which are always executed even if exceptions occurs
           That is , developer puts important codes in finally block which must be executed.

           Codes like , closing system resources , closing a connection etc. are coded in Finally Block.

           Syntax -
           finally{
            // Piece of code which is must to be executed
           }
         */

        int [] wholeNo = {0,1,2,3,4,5,6,7,8,9,10};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Index uptil '10' which you want to access: "); int choiceIndex = input.nextInt();

        try{
            System.out.printf("Whole No at Index %d is: %d" , choiceIndex , wholeNo[choiceIndex]);
        }
        catch (Exception error){
            System.out.println(error);
        }
        finally {
            System.out.println("\nMaths Fact: Whole No always start from 0"); // Note: Even if any exception occurs the 'finally' - statement will be printed
        }

        System.out.println();

        // Point to be noted: Any block of code without finally is also printed. So , Is finally useless?
        // Answer : NO , depicting some cases where 'finally block' makes full sense.

        // Assume a code that returns something before even reaching the finally block - Line 11
        // That is code is wrapped before finally , execution "STILL FINALLY BLOCK WILL BE PRINTED"
        int result = divide();
        System.out.println("Ans: " + result);

        System.out.println();

        // In Code Quiz: Write a program which undergo a for loop and breaks at some point even after that , finally statement gets printed.
        GroceryList();
        // Notice even after breaking the code , finally block is executed !

        // Important note: The finally block will not be executed if program exits(either by calling System.exit() or by causing a fatal error that causes the process to abort)
    }
}

/* In a nutshell
   1. finally block is used to execute important set of commands which is executed even if any mishappenings happens when executing the code.
   2. It is used to do some important task , like clearing up of system resource on exitting a program etc.
   3. Also note , with try{} you can either use catch{} or final{} but one of each is compulsory.
 */
