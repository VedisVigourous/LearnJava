import java.util.Scanner;

class PrimeRange{
    int start;
    int stop;

    PrimeRange(int start , int stop){
        this.start = start;
        this.stop = stop;
    }

    void Check(){
        System.out.println("Prime No in the Range is: ");
        for (int number = this.start; number <= stop; number++){
            int divisorCount = 0;
            for(int divisor = 1; divisor <= number; divisor++){
                if (number % divisor == 0){
                    divisorCount++;
                }
                }
            if (divisorCount == 2){
                System.out.println("* " + number);
            }
        }
    }
}
public class Ch13_79_ExtraCodes_PrimeNos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();

        // Code 1 - To find if a number is prime or not
        System.out.print("Enter a number to check whether it's prime or not: "); int numberToCheck = input.nextInt();
        int count = 0;

        for (int divisors = 1; divisors<=numberToCheck; divisors++){
            if(numberToCheck % divisors == 0){
                count++;
            }
        }

        if (count == 2){
            System.out.println(numberToCheck + " is a Prime Number!");
        }
        else if (count > 2){
            System.out.println(numberToCheck + " is not a Prime number");
        }

        System.out.println();

        // Code 2 - To print all prime numbers within a range
        PrimeRange primechecker = new PrimeRange(1 , 50);
//        primechecker.Check();
    }
}
