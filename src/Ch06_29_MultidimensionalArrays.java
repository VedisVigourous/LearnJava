public class Ch06_29_MultidimensionalArrays {
    public static void main(String[] args) {
        System.out.println(" ");

        /* In multidimensional array , each element of an array consist of a new array
        and the number of times an element is assigned as an array , gives it's dimension */

        // 1. Syntax of multidimensional arrays
        // for 2D array-
        int [][] list_rate;
        list_rate = new int [3][1];
        list_rate [0][0] = 90;
        list_rate [1][0] = 108;
        list_rate [2][0] = 78;
        System.out.println("Grocery item list: ");
        System.out.printf("Rate of first item: %d\n" , list_rate[0][0]);
        System.out.printf("Rate of second item: %d\n" , list_rate[1][0]);
        System.out.printf("Rate of third item: %d\n" , list_rate[2][0]);

        System.out.println(" ");

        // Best example
        // Flats - [represents floor] [represent flat]
        int[][] floor_flat;
        floor_flat = new int[3][4];
        floor_flat [0][0] = 11; // [Ground-floor] [First-flat] and so on
        floor_flat [0][1] = 12;
        floor_flat [0][2] = 13;
        floor_flat [0][3] = 14;
        floor_flat [1][0] = 21;
        floor_flat [1][1] = 22;
        floor_flat [1][2] = 23;
        floor_flat [1][3] = 24;
        floor_flat [2][0] = 31;
        floor_flat [2][1] = 32;
        floor_flat [2][2] = 33;
        floor_flat [2][3] = 34;

//        System.out.println(floor_flat.length); // Represents 1D length
//        System.out.println(floor_flat[i].length); //Represents 2D length

        System.out.println("Flat list in Block A:");
        for (int i = 0; i<floor_flat.length; i++){ //loops within 1D
            for (int j = 0 ; j<floor_flat[i].length; j++){ //loops within 2D
                System.out.print(floor_flat[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        System.out.println("   ");
        System.out.println("***");

    }
}
