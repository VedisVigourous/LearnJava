import javax.naming.LimitExceededException;
import java.util.InputMismatchException;
import java.util.Scanner;

// 1. Addition
class Addition{
    double number1;
    double number2;

    Scanner NumberInput = new Scanner(System.in);
    Addition() throws InvalidInputException , MaxInputException{
        try {
            System.out.println("\n- Welcome to Addition Calculator -");
            System.out.print("Enter Number 1: ");
            this.number1 = NumberInput.nextDouble();
            System.out.print("Enter Number 2: ");
            this.number2 = NumberInput.nextDouble();
            if (this.number1>100000 || this.number2>10000){
                throw new MaxInputException();
            }
        }
        catch (InputMismatchException e){
            throw new InvalidInputException();
        }
        catch (MaxInputException InputLimitExceeded){
            System.out.println(InputLimitExceeded);
            System.exit(101);
        }
    }

    void Sum(){
        System.out.println("~~ The Sum of specified Numbers are: " + (this.number1+this.number2));
    }
}

// 2. Subtraction
class Substraction{
    double number1;
    double number2;

    Scanner NumberInput = new Scanner(System.in);
    Substraction() throws InvalidInputException , MaxInputException{
        try {
            System.out.println("\n- Welcome to Substraction Calculator -");
            System.out.print("Enter Number 1: ");
            this.number1 = NumberInput.nextDouble();
            System.out.print("Enter Number 2: ");
            this.number2 = NumberInput.nextDouble();
            if (this.number1>100000 || this.number2>10000){
                throw new MaxInputException();
            }
        }
        catch (InputMismatchException e){
            throw new InvalidInputException();
        }
        catch (MaxInputException InputLimitExceeded){
            System.out.println(InputLimitExceeded);
            System.exit(101);
        }
    }

    void Difference(){
        System.out.println("~~ The Difference of specified Numbers are: " + (this.number1-this.number2));
    }
}

// 3. Multiplication
class Multiplication{
    double number1;
    double number2;

    Scanner NumberInput = new Scanner(System.in);
    Multiplication() throws InvalidInputException , MaxInputException , CannotMultiplyException{
        try {
            System.out.println("\n- Welcome to Multiplication Calculator -");
            System.out.print("Enter Number 1: ");
            this.number1 = NumberInput.nextDouble();
            System.out.print("Enter Number 2: ");
            this.number2 = NumberInput.nextDouble();
            if (this.number1>7000 || this.number2>7000){
                throw new CannotMultiplyException();
            }
            if (this.number1>100000 || this.number2>10000){
                throw new MaxInputException();
            }
        }
        catch (InputMismatchException e){
            throw new InvalidInputException();
        }
        catch (MaxInputException InputLimitExceeded){
            System.out.println(InputLimitExceeded);
            System.exit(101);
        }
        catch (CannotMultiplyException MultiplicationLimitExceededException){
            System.out.println(MultiplicationLimitExceededException);
            System.exit(102);
        }
    }

    void Product(){
        System.out.println("~~ The Product of specified Numbers are: " + (this.number1*this.number2));
    }
}

// 4. Division
class Division{
    double number1;
    double number2;

    Scanner NumberInput = new Scanner(System.in);
    Division() throws InvalidInputException , CannotDividebyZeroException , MaxInputException {
        try {
            System.out.println("\n- Welcome to Division Calculator -");
            System.out.print("Enter Number 1: ");
            this.number1 = NumberInput.nextDouble();
            System.out.print("Enter Number 2: ");
            this.number2 = NumberInput.nextDouble();
            if (this.number2 == 0) {
                throw new CannotDividebyZeroException();
            }
            if (this.number1>100000 || this.number2>10000){
                throw new MaxInputException();
            }
        }
        catch (InputMismatchException e){
            throw new InvalidInputException();
        }
        catch (MaxInputException InputLimitExceeded){
            System.out.println(InputLimitExceeded);
            System.exit(101);
        }
    }

    void Quotient(){
        System.out.println("~~ The Quotient of specified Numbers are: " + (this.number1/this.number2));
    }

}

// ~~ Exceptions
class InvalidInputException extends Exception{
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    @Override
    public String toString() {
        return RED + super.toString() +  ":" + GREEN + " Enter a Valid Input" + RESET;
    }
}

class CannotDividebyZeroException extends RuntimeException{
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    @Override
    public String toString() {
        return RED +  super.toString() + ":" + GREEN + " Numbers is indivisible by 0" + RESET;
    }
}

class MaxInputException extends Exception{
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    @Override
    public String toString() {
        return RED + super.toString() + ":" + GREEN + " Maximum Limit \'100,000\' Exceeded !" + RESET;
    }
}

class CannotMultiplyException extends Exception{
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    @Override
    public String toString() {
        return RED + super.toString() + ":" + GREEN + " Multiplication with Numbers Greater than \'7000\' are Prohibited !" + RESET;
    }
}


public class Ch14_91_CustomCalculator {
    public static void main(String[] args) {
        System.out.println();

        /* Excercise needs to consist of:
           1. It must be able to perform the following operations:
              1.1- Addition
              1.2- Subtraction
              1.3- Multiplication
              1.4- Division

           2. It must throw the following exception:
              2.1- Invalid input
              2.2- Cannot divide by Zero
              2.3- Max input (Numbers mustn't be greater than a specified number here - 100,000)
              2.4- Cannot multiply by a number greater than 7000. */

        // ************************************************************************************************** //

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Custom Calculator: ");
        System.out.println("Select one of the operation from the following to be Executed: ");
        System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n");

        System.out.print("Enter Your Choice: "); int choice = input.nextInt();

        if (choice == 1){
            try {
                Addition sum = new Addition();
                sum.Sum();
            }
            catch (Exception error){
                System.out.println(error);
            }
        }
        else if (choice == 2){
            try {
                Substraction difference = new Substraction();
                difference.Difference();
            }
            catch (Exception error){
                System.out.println(error);
            }

        }
        else if (choice == 3){
            try {
                Multiplication product = new Multiplication();
                product.Product();
            }
            catch (Exception error){
                System.out.println(error);
            }
        }
        else if (choice == 4){
            try {
                Division quotient = new Division();
                quotient.Quotient();
            }
            catch (Exception error){
                System.out.println(error);
            }
        }
        else {
            System.out.println("Enter a Valid Choice !!");
        }
    }
}
