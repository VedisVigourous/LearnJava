import java.util.Scanner;
public class Ch07_33_VariableArguments {
    static int sum(int a , int b){
        return a+b;
    }
    static int sum2(int ...add){
        int addition = 0;
        for (int elements : add){
            addition += elements;
        }
        return addition;
    }
    static float bill(float Concession , float ...value){
        float total_value = 0;
        for (float addon : value){
            total_value += addon;
        }
        return total_value - Concession;
    }
    public static void main(String[] args) {
        System.out.println(" ");

        /* VarArgs refers that if arguments are increasing significantly for a method then rather
        than doing method overloading , we create an array taking infinite arguments.

        Syntax: (here)
        static int sum(datatype ...array_name)*/


        Scanner input = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int x = input.nextInt();
        System.out.print("Enter second num: ");
        int y = input.nextInt();
        System.out.println("The sum of given numbers are: " + sum(x,y));

        System.out.println(" ");

        // Using VarArgs
        //Sum of natural numbers till 5 in different lines
        System.out.println("Sum of 1 and 2: " + sum2(1,2));
        System.out.println("Sum of 1 , 2 and 3: " + sum2(1,2,3));
        System.out.println("Sum of 1 , 2 , 3 and 4: " + sum2(1,2,3,4));
        System.out.println("Sum of 1 , 2 , 3 , 4 and 5: " + sum2(1,2,3,4,5));

        System.out.println(" ");

        // We can make an argument to be necessary by adding in Method arguments section
        System.out.print("Enter Base Value: "); float bv = input.nextFloat();
        float tax = 0.28f*bv;
        System.out.print("Tax Value is: " + tax);
        System.out.print("\nEnter Concession Received: "); float con = input.nextFloat();
        System.out.println("Bill due is: " + bill(con,bv,tax));

        // Note: If using only arrays and Value is not defined while accessing method , it's not a problem.
        // But if a necessary argument is asked  , then value must be defined else error occurs.
    }
}
