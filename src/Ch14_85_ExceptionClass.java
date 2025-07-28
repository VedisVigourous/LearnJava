class CustomException extends Exception{
    @Override
    public String toString() {
        return "toString() , Caught an Exception";
    }

    @Override
    public String getMessage() {
        return "getMessage() , Caught an Exception";
    }
}

public class Ch14_85_ExceptionClass {
    public static void main(String[] args) {
        System.out.println();

        /* If we want we can make our own Exception using an Exception class.

           1. Syntax -
              public class <ClassName> extends Exception{ // constructors can also be made using specific messages etc.
                // Methods need to be overridden
             }

           2. Important methods in Exception class-
              2.1 - String toString() - this method is executed when we want to Print the Exception.
              2.2 - printStackTrace() - It prints all the 1. All the methods invoked
                                                          2. All sets of actions and
                                                          3. Exception occured at which line , before getting an error at the end of code
              2.3 - String getMessage() - it allows the programmers to print the custom Exception message.
              and much more refer to MethodSummary in: https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html
         */

        int num;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a number greater than 10: ");
        num = input.nextInt();

        if(num<10){
            try {
                throw new CustomException();
            }
            catch (Exception error){
                System.out.println(error.getMessage()); // This prints the custom msg we set to getMessage()
                System.out.println(error.toString());  // This prints the Exception we set to toString()

                // Note if method is not specified , toString() is considered default i.e. on Printing only error we will recieve the custom toString() exception
                System.out.println(error); // toString() will be printed

                error.printStackTrace();
                // Note : It is not an error don't misjudge by its font colour , any code written after printStackTrace will be printed, but before printStackTrace as it is sprinted at last.
                System.out.println("PrintStackTrace is not an error");
            }
        }

        // throw keyword - it is used to Invoke an Exception if it occurs. Ex. In line 40
        // Note: any type of Exception can be invoked. But if customException are not shown , Predefined msgs in methods like toString() for different types of Exception will be printed

        // Example
        int numGreaterThan20;
        System.out.print("Enter a number > 20: "); numGreaterThan20 = input.nextInt();
        if (numGreaterThan20<20){
            try{
                throw new ArithmeticException("Number Greater than 20 needs to be thrown"); // The Dialogue written is direclty sent to getMessage() method
            }
            catch (Exception e){
                System.out.println(e.getMessage()); // Only prints Dialogue
                System.out.println(e.toString()); // Specifies the type of Exception along with Message Specified.
            }
        }
    }
}

/* In a nutshell:
   1. Exception Class helps us to show our custom Exceptions in front of user , which help user to be vigilant by what they are doing wrong.
   2. ExceptionClass consist of some important methods all having different sets of action by them. Ex. toString shows the type of Exception along with a message defined
   3. toString() method is default that will be printed if a particular method is not invoked.
   4. printStackTrace is an important method to notify user where all the things went wrong.
   5. throw keyword is used to send the Exception at an instance where required.  */