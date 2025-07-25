import java.util.Scanner;
public class Ch06_28_Array_Operations {
    public static void main(String[] args) {
        System.out.println(" ");
        // Note array can be typecast into different data type (Even strings can be taken into accnt)
        int [] rate = {95,238,39,93,103};
        String [] list = {"Milk" , "Fruits", "Veggies" , "Chocolate" , "Dry Fruits"};

        //Array operations:
        //1. rate.length - determines the length of an array
        System.out.println("Length of array is:" + rate.length);
        System.out.println("Length of grocery list is:" + list.length);

        System.out.println(" ");

        //2. Displaying arrays with another way (Using for loop)
        System.out.println("Your grocery list is: ");
        for (int i = 0; i < list.length ; i++){
            System.out.println(list[i]);
        }

        System.out.println(" ");

        //3. Using for-each loop
        System.out.println("Your grocery list using for-each loop: ");
        for (String i1 : list){     //  for (datatype name : array) , syntax of for each loop
            System.out.println(i1);
        }
    }
}
