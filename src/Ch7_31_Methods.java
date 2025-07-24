import java.util.Scanner;
public class Ch7_31_Methods {
    //Method making
    int logic(int x , int y){
        int z=0;
        if (x>y){
            System.out.printf("%d is greater than %d" , x, y);
        }
        else{
            z = y+5;
            System.out.printf("%d is greater than %d and 5 added value is: %d" , x, y , z);
        }
        return z;
    }
    public static void main(String[] args) {
        // Method;s help in using a logic as a separate function rather than including it in the code repeatedly.
        // Works on DRY principle - Don't repeat yourself

        /*Syntax:
        static datatype name(){
            method
         }
         ** Written above the main method (inside a class) **/

        //Calling of a method (using name and required parameters)
        //Commented out in order to run the object calling method

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int c;
//        int c = logic(a,b);

//        System.out.println(" ");

        //Calling of a method by creating an object
        /* Used by creating a method in a class which is not static
         That is by creating an object each place will have separate copies of the method */

        // Syntax:
        /* className obj = new className(); ** Object creation
           var = method_name(parameters to be used) ** Calling of an object */


        Ch7_31_Methods obj = new Ch7_31_Methods();
        c = obj.logic(a,b);

        System.out.println(" ");

        // Note even after changing values of x and y and calling through a, b there will be no effect on a,b
        // As there copies are inserted in method not themselves
    }
}
