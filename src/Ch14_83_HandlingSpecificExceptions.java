public class Ch14_83_HandlingSpecificExceptions {
    public static void main(String[] args) {
        System.out.println();

        // We can handle specific exceptions like Arithmetic , Nullpoint etc. using try-catch
        /* Assume the code we created that gives arithmetic error but while composing try-catch
           We stated to catch - Runtime error now instead of runtime it could have been specific  */

        // Example 1 -
        int n1 = 9; int n2 = 0;
        try {
            int div = n1 / n2;
            System.out.println("Quotient is: " + div);
        }
        catch (ArithmeticException notdivisible){// **** Note: We here stated exact runtime error that occurs i.e. ArithmeticException
            System.out.println("Error reason: " + notdivisible);
        }

        System.out.println();

        // Example 2 -
        String [] squad = new String[4];
        squad [0] = "Leo";
        squad [1] = "Rohan";
        squad [2] = "Jeet";
        squad [3] = "Magnus";
        java.util.Scanner input = new java.util.Scanner(System.in);

        try{
            System.out.print("Enter the Index to display Squad Members: "); int index = input.nextInt();
            System.out.println("Member is: " + squad[index]);
        }
        catch (ArrayIndexOutOfBoundsException error){
            System.out.println("Only 4 Members are present in a squad");
            System.out.println("Player Search Exitting");
        }

        // Note : If there are multiple exceptions just go with , 'RuntimeException or Exception'

        System.out.println();

        // Two Exceptions can also occur in One Code i.e.
        int [] numbers = {43,54,223,90,14};
        try {
            System.out.print("Enter the Index you want to access: "); int index = input.nextInt();
            System.out.println("Number on the given index is: " + numbers[index]);
            System.out.println();
            System.out.print("Enter the number you want to divide the Array value with: "); int divisor = input.nextInt();
            System.out.println("Quotient is: " + numbers[index]/divisor);

            // Note two exceptions can occur i.e. Arithmetic and ArrayIndexoutofBound
        }
        catch (ArithmeticException arithexc){
            System.out.println("Arithmetic Exception Occurred!");
        }
        catch (ArrayIndexOutOfBoundsException indexexc){
            System.out.println("Array Index is beyond specified range of 5");
        }
        catch (RuntimeException error){
            System.out.println(error); // Any other error if occured
        }
    }
}

/* Point to be noted :
   1. It is not compulsory to tackle each Exception that is putting RuntimeException is enough as it catches a whole lot of exception
   2. Still to be precise and guide the user about the specific exception we can use them
   3. Each exception can have different sets of reactions as specified in catch block. */
