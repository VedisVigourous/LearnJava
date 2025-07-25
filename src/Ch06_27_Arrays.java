public class Ch06_27_Arrays {
    public static void main(String[] args) {
        System.out.println(" ");

        /* Arrays are - set of similar data type
         Example -  a class of 5 students with their respective marks
         Rather than creating multiple variable it helps in storing large data */

        //1.Syntax of Arrays
        // Consist of two steps - Declaration (array making step) and memory allocation 
        int [] marks = new int [5]; // [] represents array formation , we now need to allocate memory to array
        //   arrays  =   object
        /*Memory allocation can be done in same line like variables or in different line.
        each number (called object) store one byte , i.e. for this code the memory allocated =
        7 (integers) * 6 bytes (start from 0) = 42 bytes = 336 bits */

       // Q. Why do we use arrays ? Ans. They are very fast and easily accessible.
        // Arrays are overwritable

        // Accessing arrays =
        marks[0] = 89;
        marks[1] = 87;
        marks[2] = 70;
        marks[3] = 77;
        marks[4] = 78;
        System.out.println("Marks in fifth subject is: " + marks[4]);

        //2.For allocating memory in a new line;
        int [] mark; // Array creating step
        mark = new int [4]; // Memory allocation step
        mark [3] = 89; // Accessing array
        System.out.println("Marks in fourth subject is: " + mark[3]);

        //3.For creating an array along with adding values
        int [] marks1 = {100 , 90 , 80};
        // Here memory allocation and indexing is done by java itself
        System.out.println("Marks in second subject is: " + marks1[1]);
     }
}
