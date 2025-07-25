import java.util.Scanner;
public class Ch07_35_Practice12 {
    static void table(int a){
        System.out.println("The table of " + a + " is:");
        for (int i = 1; i<=10; i++){
            System.out.printf("%d X %d = %d\n" , a , i , a*i);
        }
    }
    static void star_pattern(){
        for (int x = 1; x<=5; x++){
            for (int y = 1; y<=x; y++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    static int sum(int u){
        if (u == 1){
            return 1;
        }
        else {
            return u + sum(u-1);
        }
    }
    static int fibonacci(int f){
        if (f==1){
            return 0;
        }
        else if(f == 2){
            return 1;
        }
        else {
            return fibonacci(f-1) + fibonacci(f-2);
        }
    }
    static int avg(int ...average){
         int total = 0;
         for (int element : average){
             total += element;
         }
         return (total)/average.length;
    }
    static int star_rec_dec(int rs1){
        if (rs1>0){
            for (int s1 = 0 ; s1 <rs1; s1++){
                System.out.print("*");
            }
            System.out.println();
            }
        else if (rs1 == 0){
            return 0;
        }
        return star_rec_dec(rs1 - 1);
    }
    static void star_rec_inc(int rs2){
        if (rs2>0){
            star_rec_inc(rs2 - 1); //Helps in going to previous number in order to print in increasing order
            for (int s2 = 0; s2 < rs2 ; s2++){ // Note : rs2 -1 command should be before pattern printing
                System.out.print("*");            // In order to first print the pattern for least number
            }
            System.out.println();
        }
    }
    static int sumiter(int summing) {
        int sum = 0;
        int s3 = 0;
        while (s3 <= summing){
         sum += s3;
         s3++;
        }
        return sum;
    }
    public static void main(String[] args) {
        // Table Print using method
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to print it's Table: ");
        int tab = input.nextInt();
        Ch07_35_Practice12.table(tab);

        System.out.println(" ");

        // Star Pattern
        star_pattern();

        System.out.println(" ");

        // sum of n numbers using recursion
        System.out.print("Enter a number: ");
        int u1 = input.nextInt();
        System.out.println("Sum of n terms is: " + sum(u1));

        System.out.println(" ");

        // Fibonacci nth term
        System.out.print("Enter the term you want of a fibonacci series: "); int fib = input.nextInt();
        System.out.printf("%d 'th term is: %d" ,fib, fibonacci(fib) );

        System.out.println(" ");

        // Average of argument
        System.out.println("Average of Given numbers are: " + avg(1,7,8,12));

        System.out.println(" ");

        //Star pattern with recursion (decreasing)
        star_rec_dec(5);

        System.out.println(" ");

        //Star pattern with recursion (increasing)
        star_rec_inc(5); // goes like - pattern(5) + 4 stars above then for 4 but 3 above and so on.

        System.out.println(" ");

        // Sum of n numbers using iteration
        System.out.print("Enter a num: "); int num = input.nextInt();
        System.out.println("Sum of n terms is: " + sumiter(num));
    }
}

