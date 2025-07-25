public class Ch06_30_Practice11_Imp {
    public static void main(String[] args) {
        System.out.println(" ");

        // Sum of array
        float [] sumarr = {9.8f , 282.23f , 92.2f , 39.23f , 100.23f};
        System.out.println("Sum of array values is: " + (sumarr[0]+sumarr[1]+sumarr[2]+sumarr[3]+sumarr[4]));
                // Smart method
        float sum = 0;
        for (float i : sumarr){
            sum = sum + i;
        }
        System.out.println("Sum of array values is: " + sum);

        System.out.println(" ");

        // Value checker in array
        boolean isinarray = false;
        for (float j : sumarr){
            if (j == 91.38f) {
                isinarray = true;
                break;
            }
        }
        if (isinarray){
            System.out.println("Your array has the given value");
        }
        else {
            System.out.println("Your array doesn't contain the given value");
        }

        System.out.println(" ");

        // Average calculator of an array
        int [] marks = {98 , 100 ,78 , 89 , 63};
        int total = 0;
        for (int i : marks){
            total = total + i;
        }
        float average = (float) ((total)/(marks.length));
        System.out.println("Average of your marks are: " + average);

        System.out.println(" ");

        // Addition of matrices
        // Multidimensional arrays can be formed using multiple {}
        int [][] matrice1 = {{20 , 50 , 60},
                             {58 , 29 , 70}};
        int [][] matrice2 = {{80 ,40 ,16},
                             {20 , 50 ,85}};
        int [][] result = {{0,0,0},
                            {0,0,0}};

        System.out.println("Matrice 1 is");
        for (int a = 0; a<matrice1.length; a++){
            for (int b =0; b<matrice1[a].length; b++){
                System.out.print(matrice1[a][b]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        System.out.println("Matrice 2 is");
        for (int c = 0; c<matrice2.length; c++){
            for (int d =0; d<matrice2[c].length; d++){
                System.out.print(matrice2[c][d]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        for (int e = 0; e<matrice1.length; e++){
            for (int f =0; f<matrice1[e].length; f++){
                result[e][f] = matrice1[e][f] + matrice2[e][f];
            }
        }

        System.out.println(" ");

        System.out.println("Result is");
        for (int g = 0; g<result.length; g++){
            for (int h =0; h<result[g].length; h++){
                System.out.print(result[g][h]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        // Printing array in reverse order
        String [] grocery_list = { "Cold drink" , "Milk" , "Veggies" , "Ketchup" , "Bread"};
        System.out.print("Array in reverse order is: {");
        for (int p = grocery_list.length-1; p>=0 ; p--) {
            System.out.print(grocery_list[p]);
            if (p == 0){
                break;
            }
            System.out.print(" , ");
        }
            System.out.print("}\n");

        System.out.println(" ");

        /* Doing the above problem with memory swapping
        that is if an array has length(l) = 5 then 0 index is swapped by **(l-1-index) = 5-1-0 = 4th index */

        // no of swapping to be done can be estimated by length/2. Example. for l = 5 swapping = 5/2 = 2.5 = 2
        // can be achieved by using math module specifically , math.floordiv() (divides given number)

        int [] array = {37, 48 , 78 , 23 ,99};
        int xyz = Math.floorDiv(array.length , 2); // (numerator , denominator) //Determines number of swaps
        int l = array.length;
        int swap;
        // now swapping grocery.length[i] with grocery.length[l-1-i] using swapping logic
        for (int index = 0; index<xyz ; index++){
            swap = array[index]; // swap = array[0] // Initialization step
            array[index] = array[l-1-index]; // array[0] = array[4] //First swap
            array[l-1-index] = swap; // array[4] = array[0] //Second swap
        }
        for (int e : array){
            System.out.print(e + " , ");
        }
        System.out.println(" \n");

        //Finding maximum value in an array
        int max = Integer.MIN_VALUE;
        for (int num : array){
            if (num>max){
                max = num;
            }
        }
        System.out.println("Greatest number in array is: " + max);

        System.out.println(" ");

        // Finding minimum number in an array
        // max is defined above
        for (int num1 : array ){
            if (num1 < max){
                max = num1;
            }
        }
        System.out.println("Smallest number in array is: " + max);

        // Above questions can be solved by .MAX_VALUE and .MIN_VALUE by replacing int max = 0
        // (denotes the least supported integers)

        System.out.println(" ");

        // Telling whether an array is sorted or not
        int [] array1 = {1,2,1,4};
        boolean sorted = true;
        for (int sort = 0; sort<array1.length-1; sort++){
            if (array1[sort] > array1[sort+1]){
                sorted = false;
            }
        }
        System.out.println("Array is sorted(except last value): " + sorted);
    }
}

