package Ch12_Packages;

import java.util.Scanner;

class Calculator {
    double num1;
    double num2;
    void Add(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter your first number: "); this.num1 = input.nextDouble();
        System.out.print("Enter your second number: "); this.num2 = input.nextDouble();
        
        System.out.println("Sum of the numbers is = " + (this.num1 + this.num2));
    }
    
    void Subtract(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter your first number: "); this.num1 = input.nextDouble();
        System.out.print("Enter your second number: "); this.num2 = input.nextDouble();
        
        System.out.println("Difference of the numbers is = " + (this.num1 - this.num2));
    }
    
    void Multiply(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter your first number: "); this.num1 = input.nextDouble();
        System.out.print("Enter your second number: "); this.num2 = input.nextDouble();
        
        System.out.println("Product of the numbers is = " + (this.num1 * this.num2));
    }
    
    void Division(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter your first number: "); this.num1 = input.nextDouble();
        System.out.print("Enter your second number: "); this.num2 = input.nextDouble();
        
        System.out.println("Quotient of the numbers is = " + (this.num1 / this.num2));
    }
}

class ScientificCalculator{
    double num3;
    
    ScientificCalculator(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter your number: "); this.num3 = input.nextDouble();
    }
    
    void Answers(){
        System.out.println("Sine of the number is: " + (Math.sin(Math.toRadians((this.num3)))));
        System.out.println("Cosecant of the number is: " + (Math.cos(Math.toRadians((this.num3)))));
        System.out.println("Tangent of the number is: " + (Math.tan(Math.toRadians((this.num3)))));
    }
}

class HybridCalculator{
    double num4;
    double num5;
    
    HybridCalculator(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter your number: "); this.num4 = input.nextDouble();
        System.out.print("Enter your second number: "); this.num5 = input.nextDouble();
    }
    
    void calculations(){
        System.out.println("Sum - " + (this.num4+this.num5));
        System.out.println("Difference - " + (this.num4-this.num5));
        System.out.println("Product - " + (this.num4*this.num5));
        System.out.println("Quotient - " + (this.num4/this.num5)); System.out.println();
        
        System.out.println("Sine of first number - " + (Math.sin(Math.toRadians(this.num4))));
        System.out.println("Sine of second number - " + (Math.sin(Math.toRadians(this.num5)))); System.out.println();
        
        System.out.println("Cosecant of first number - " + (Math.cos(Math.toRadians(this.num4))));
        System.out.println("Cosecant of second number - " + (Math.cos(Math.toRadians(this.num5)))); System.out.println();
        
        System.out.println("Tangent of first number - " + (Math.tan(Math.toRadians(this.num4))));
        System.out.println("Tangent of second number - " + (Math.tan(Math.toRadians(this.num5)))); System.out.println();
        
        /* Imp - using with Math trigonometric fn machine always calculate in radians hence while putting degrees in query
                 to get answer in degrees we tell machine toRadians i.e. why toRadians is written here */
    }
}

class Letter {
    String name;
    String myName;
    String date;
    
    Letter(){
        Scanner input = new Scanner(System.in);
        System.out.print("Who is writing this letter: "); this.myName = input.nextLine();
        System.out.print("Date: "); this.date = input.nextLine();
        System.out.print("To whom is the letter being written: "); this.name = input.nextLine();
        System.out.println();
    }
    
    void body(){
        String mainBody = "\nDear <Name>,\n<date>\n\nHope this letter finds you in good health!\nIt's been a long time , Let's Meet soon\n\nBest Wishes,\n<myName>";
        
        mainBody = mainBody.replace("<Name>" , this.name);
        mainBody = mainBody.replace("<date>" , this.date);
        mainBody = mainBody.replace("<myName>" , this.myName);
        
        System.out.println(mainBody);
    } 
}

public class Ch12_69_Practice5 {
    
    //Properties written for Q3
    protected String publicName = "I am Vedant";
    String defDob = "DOB = 01-01-01";
    
    public static void main(String[] args) {
        
     // Q1 - Making of three calculators in a same package - 
        
     java.util.Scanner choice1 = new java.util.Scanner(System.in);   
     System.out.println("1. Simple Calculator\n2. Scientific Calculator\n3. Hybrid Calculator");
     System.out.print("Enter the Calculator You Want to use: "); int calc = choice1.nextInt();
        
        if (calc == 1){  
            Calculator obj1 = new Calculator();
            java.util.Scanner choice2 = new java.util.Scanner(System.in); 
            System.out.println("Welcome to Calculator-");
            System.out.println("1. Sum\n2. Difference\n3. Product\n4. Quotient");
            System.out.print("Enter Your Choice: "); int YourChoice = choice2.nextInt();
        
            System.out.println();
        
            switch (YourChoice){
                case 1 -> obj1.Add(); 
                case 2 -> obj1.Subtract(); 
                case 3 -> obj1.Multiply(); 
                case 4 -> obj1.Division();
                default -> System.out.println("Enter Correct Choice");
            }
        }
        
        else if (calc == 2){
            System.out.println("\nWelcome to Scientific Calculator: ");
            ScientificCalculator obj2 = new ScientificCalculator(); System.out.println();
            obj2.Answers();
            }
            else if(calc == 3){
                System.out.println("\nWelcome to Hybrid Calculator: ");
                HybridCalculator obj3 = new HybridCalculator(); System.out.println();
                obj3.calculations();
            }
        
        System.out.println();
        
        // Q2 - Taking a msg from user and Displaying it 
        Letter obj4 = new Letter();
        obj4.body();
        
        System.out.println();
        
        // Q3 - Demonstration that protected can be accessed within subclass but default doesn't
        // Class is written here (Line 112)
        // Ans in C12_69_Practice5_2.java
    }
}