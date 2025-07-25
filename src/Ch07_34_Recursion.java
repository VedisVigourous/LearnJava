public class Ch07_34_Recursion {

    // Factorial of  n = n * factorial(n-1)
    static int factorial(int n){
        if(n==0 || n ==1){
            return 1;
        }
        return n * factorial(n-1);
    }
    static int fact(int x){
        int fact1 = 1;
        for (int f = x; f!=1;f--){
            fact1 = fact1 * (f-1);
        }
        return fact1;
    }
    static int fibonacci(int t){
        if (t<=0){
            return 0;
        }
        else if (t == 1){
            return 1;
        }
        else {
            return fibonacci(t-1) + fibonacci(t-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(" ");
        // When a function calls itself without the need of external commands
        // Factorial - 5! = 5x4x3x2x1;
        //Can be done by For Loop (iterative) or with recursion
        // Using recursion:-
        System.out.print("Factorial of 5 is: ");System.out.println(factorial(5)); // Factorial of 5

        // Using Iterative approach
        System.out.println("Factorial of 5 using iterative approach: " + fact(6));

        System.out.println(" ");

        // Fibonacci Sequence using recursion
        System.out.println("Fibonacci Series till 5 is: ");
            for (int i = 0 ; i<=5; i++){
                System.out.print(fibonacci(i) + ", ");
                // Expected answer = 0,1,1,2,3,5
            }
    }
}
