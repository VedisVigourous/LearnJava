import java.util.Scanner;
public class Ch4_17_Conditionals {
    public static void main(String[] args) {
        //Conditions are used to enter decisions making in program

        //If-Else Statement
        int age = 18;
        if (age>=18){
            System.out.println("Yes you can drive");
        }
        else{       //Else is optional
            System.out.println("You cannot drive");
        }
        //Relational Operators to be used in Java Conditionals
        // 1. == - equals
        // 2. >= - greater than or equals to , <=
        // 3. != - not equals to etc.

        // Note: '=' is assignment operator and '==' is comparison operator
        if(age == 18) {
            System.out.println("Because you can Apply for DL");
        }
        else{
                System.out.println("Still not applicable for DL");
            }

        }

    }

