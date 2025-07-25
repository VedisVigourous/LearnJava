public class Ch07_36_Practice13 {
    static void greet(String name){
        System.out.printf("Hello %s!" , name);
    }
    static boolean even_odd(int a){
        boolean isEven = false;
        if (a%2==0){
            isEven = true;
        }
        return isEven;
    }
    static double findMax(double ...max){
        double maximum = Integer.MIN_VALUE;
        for (double element : max ){
            if (element > maximum){
                maximum = element;
            }
        }
        return maximum;
    }
    static int sumDigit(int y){
        // To get the last digit we divide the num by 10 and get the remainder
        // To get front digit we use y/10
        if (y==0){
            return 0;
        }
        return (y%10) + sumDigit(y/10); //For numbers greater than 2 digit we need to do recursion.
    }
    public static void main(String[] args) {
        System.out.println(" ");

        // Declaration of Array -
        String [] fruits;
        fruits = new String [] {"Apple", "Banana", "Cherry", "Date"};
        System.out.println("Fruit list: ");
        for (String elements : fruits){ // For each loop to print the list.
            System.out.println(elements);
        }
        System.out.println(" ");
        System.out.println("Fruit list in rev order: ");
        for (int x = (fruits.length-1); x>=0 ; x--){ // For loop to print list in rev order
            System.out.println(fruits[x]);
        }

        System.out.println(" ");

        //Multidimensional Arrays-
        int [][][] matrix = {{{2,3,4},
                              {4,6,7},
                              {7,9,8}}};
        for (int i=0;i<(matrix.length);i++){
            for (int j=0; j < matrix[i].length;j++){
                System.out.print("| ");
                for (int k=0;k< matrix[i][j].length;k++) {

                    System.out.print(matrix[i][j][k] + " ");
                }
                System.out.print("|");
                System.out.print("\n");
            }
        }
        int sum=0;
        for (int i=0;i<(matrix.length);i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    sum += matrix[i][j][k];
                }
            }
        }
        System.out.println(" ");
        System.out.println("The sum is: " + sum);
        System.out.println(" ");

        // Methods
        greet("Vedant");
        System.out.println("\n");

        int inp1 = 677;
        int inp2= 579;
        int inp3 = 862;
        System.out.printf("Is %d Even: %b\n" , inp1 , even_odd(inp1));
        System.out.printf("Is %d Even: %b\n" , inp2 , even_odd(inp2));
        System.out.printf("Is %d Even: %b\n" , inp3 , even_odd(inp3));

        System.out.println(" ");

        // VarArgs
        System.out.println("Max val: " + findMax(12));
        System.out.println("Max val: " + findMax(8,2,7));
        System.out.println("Max val: " + findMax(90.8,89,56,4,90));

        System.out.println(" ");

        // Recursion
        int rec1 = 6969;
        int rec2 = 567;
        int rec3 = 89;
        int rec4 = 0;
        System.out.printf("Sum of %d is: %d\n" , rec1 , sumDigit(rec1));
        System.out.printf("Sum of %d is: %d\n" , rec2 , sumDigit(rec2));
        System.out.printf("Sum of %d is: %d\n" , rec3 , sumDigit(rec3));
        System.out.printf("Sum of %d is: %d\n" , rec4 , sumDigit(rec4));
    }
}
