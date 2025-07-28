class AreaException extends Exception{
    @Override
    public String toString() {
        return "Dimensions can't be negative!";
    }
}

public class Ch14_86_throw_throws {
    public static void divide(int num1 , int num2) throws ArithmeticException {
        // Made by Programmer 1
        System.out.println("Quotient is: " + num1/num2);
    }

    public static void circleArea(double radius) throws AreaException{
        if (radius<0){
            throw new AreaException();
        }
        System.out.println("The Area of Circle is: " + (22*radius*radius)/7);
    }

    public static void main(String[] args) {
        System.out.println();

        /* 1.throw - it is used to push an Exception wherever required.
             Syntax -
             throw new (RuntimeException e) in between try-catch block

           2.throws - it is just used to tell a programmer about the possible error which could occur , now the one accessing the method needs to solve so that no exception occurs
             Syntax -
             class <ClassName> throws RuntimeException{     ~~ Already warns the user that Exception could occur.
             // Piece of vulnerable code
             }     */

        // Example: Using with arithmeticException (throws)
        // Accessed by User 1 - needs to tackle any possible exceptions
        System.out.println("Example 1-");
        try {
            divide(10, 0);
        }
        catch (ArithmeticException div){
            System.out.println("A Number cannot be divided by 0");
        }
        // The Programmer can tackle any query aksed by user , by saying Possible Exceptions are already mentioned

        // **************************************************

        // Example 2- throw , creation of custom exception on putting negative integer as Circle Radius
        // 'throw' an exception and also warns that the method 'throws' the Exception , that is the user have to tackle it now using try-catch
        System.out.println("Example 2-");
        try {
            circleArea(-7);
        }
        catch (AreaException dimension){
            System.out.println(dimension.toString());
        }
    }
}

/* In a nutshell -
   throw:
   Used to throw any exception if it is desirable at that place , Like in Example 2 where on putting negative dimension customException is thrown.

   throws:
   Used to warn the upcoming programmer that the program may throw a particular Exception so , please Tackle it using try-catch block.
 */