import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String ExceptionMessage) {
        super(ExceptionMessage);
    }
}

class BankAccount{
    protected double balance;

    BankAccount(double balance){
        this.balance = balance;
    }

    void Withdraw(double amount) throws InsufficientFundsException{
        if (amount>balance){
            throw new InsufficientFundsException("Withdrawal amount exceeds available balance");
        }
        else {
            System.out.println("Withdrawing " + amount);
            balance = balance - amount;
            System.out.println("Balance Left: " + balance);
        }
    }

    void Deposit(double amount) throws InvalidTransactionAmountException{
        if (amount<=100){
            throw new InvalidTransactionAmountException("Deposited Amount should at least be Rs.100");
        }
        else {
            System.out.println("Depositing " + amount);
            balance = balance + amount;
            System.out.println("Balance Left: " + balance);
        }
    }

    void transferFunds(BankAccount targetAccount , double amount) throws InvalidTransactionAmountException , InsufficientFundsException {
        // Using BankAccount in method, here calls the method itself with all of it's method
        this.Withdraw(amount);
        targetAccount.Deposit(amount);
        System.out.println("Transfferred Rs." + amount + " Succesfully!");
    }
}

class InvalidTransactionAmountException extends RuntimeException{
    InvalidTransactionAmountException(String InvalidTransactionMessaage){
        super(InvalidTransactionMessaage);
    }
}

public class Ch14_89_Practice23_Imp {

    static void performRiskyOperation(int divisor){
        try{
            if (divisor == 0){
                System.out.println("Attempting Division by 0");
                throw new ArithmeticException("Cannot be divided by 0");
            }
            else {
                System.out.println("Quotient is : " + 100/divisor);
            }
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Cleanup Operation Succesful!");
        }
    }

    static void processPayments(String cardID , String amountString){
        try{
            if (cardID.length() != 14) {
                throw new IllegalArgumentException("Invalid Card Number");
            }
            try {
                double amount = Double.parseDouble(amountString);
                System.out.println("Rs." + amount + " sending to: " + cardID);
            }
            catch (NumberFormatException e){
                System.out.println("Inner catch: Invalid amount format");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }



    public static void calculateInterest(double principle , double rate , int years){
        int perYearRate = (int) rate/years;
        System.out.println("Per year rate : " + perYearRate + " %");
    }

    public static void getPositiveInteger(){
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter a positive Integer: "); int positiveInteger = input.nextInt();

            if (positiveInteger<=0){
                System.out.println("Positive Integer required , Plesae try again!");
                getPositiveInteger();
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input. Please enter a whole number");
            getPositiveInteger();
        }
    }

    public static void displayTransaction(String [] transaction){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Index of Transaction: "); int index = input.nextInt();
        System.out.println("Transaction on S.No: " + index + " is : " + transaction[index]);
    }

    public static void processAmount(){
        Scanner input = new Scanner(System.in);
        double amount;
        try {
            System.out.print("Enter the amount to be parsed: ");
            String amountStr = input.nextLine();
            amount = Double.parseDouble(amountStr);
            System.out.println("Successfully Parsed amount: Rs." + amount);
        }
        catch (NumberFormatException invalidString){
            System.out.println("Error: Amount must be a valid number");
        }
    }

    public static void main(String[] args) {    System.out.println();

        // Q1. Basic Exception Handling ( includes try , catch and Specific Exception )
        // Arithmetic Exception - (surrounding with try catch to solve the problem)
        try {
            calculateInterest(-1, 10, 0);
        }
        catch (ArithmeticException e){
            System.out.println("Years cannot be zero for interest calculation");
        }

        System.out.println();

        // InputMismatchException -
        getPositiveInteger();

        System.out.println();

        // ArrayOutofBoundException -
        String [] bank = new String[3];
        bank[0] = "Debited: Rs.30,000";
        bank[1] = "Credited: Rs.45,0000";
        bank[2] = "Debited: Rs.15,000";
        try {
            System.out.println("- Welcome to Java Bank of Finance -");
            displayTransaction(bank);
        }
        catch (ArrayIndexOutOfBoundsException validTransaction){
            System.out.println("Error: Invalid transaction index. Please provide an index between 0 and " + (bank.length-1));
        }

        System.out.println();

        // NumberFormatException - (String to number conversion) using '.parseDouble()'
        processAmount();

        System.out.println("**************");

        // ***************** //
        System.out.println();
        // ***************** //

        // Q2. Throw , throws and Custom Exception Classes
        // Custom class making - InsufficientFundsException
        BankAccount BankService = new BankAccount(70000.50);
        System.out.println("- Welcome to Java Bank Services -");
        try {
            System.out.println("BALANCE IN A/C - " + BankService.balance);
            BankService.Withdraw(69999.50);
            BankService.Deposit(180);
            BankService.Deposit(50000);
        }
        catch (InsufficientFundsException | InvalidTransactionAmountException FundsError){
            System.out.println(FundsError);
        } System.out.println();

        System.out.println("**************");

        // InvalidTransactionAmount - Exception
        // Used in try-catch block above.

        // ***************** //
        System.out.println();
        // ***************** //

        // Q3. Finally-Block and Nested Try-Catch
        // Finally - Guaranteed Excecution (method performRiskyOperation)
        performRiskyOperation(0);
        performRiskyOperation(10);

        System.out.println();

        // nested try-catch - method processPayment
        // 1. No errors
        System.out.println("Processing Amounts...");
        processPayments("11YH-89G8-IH78" , "90000");
        // 2. InvalidAmountString
        processPayments("11YH-89G8-IH78" , "One Lakh");
        // 3. InvalidCardID
        processPayments("11YH89G8IH78" , "12000");
    }
}
