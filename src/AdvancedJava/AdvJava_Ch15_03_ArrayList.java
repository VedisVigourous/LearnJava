package AdvancedJava;
import java.util.*;

public class AdvJava_Ch15_03_ArrayList {

    /* ArrayList - These are modified arrays which helps the user to, program with variable or resizable arrays with convinience.

       ~ Syntax to Initialize an ArrayList-
         - ArrayList<datatype> ArrayList_Name = new ArrayList<>();

       ~ Important ArrayList Methods-
         1. AL_name.add(int index , E element_to_add) - Adds an specified element to a specified index
         2. AL_name.size() - same as array.length() , here size gives the total entries of an ArrayList
         3. AL_name.addfirst(element) - adds the specified element to first position
         4. AL_name.addLast(element) - adds the specified element to last position
         5. AL_name.clear() - deletes all the element in an arrayList
         6. AL_name.remove() - removes the element at specified index ~~ Similar commands - removeFirst() & removeLast()
         7. AL_name.clone() - copies all the element in an arrayList to another arrayList (Syntax important)
         8. AL_name.indexOf(element) - returns the first time occured index of element specified (lastIndexOf() - specifies the index from the last)
         9. AL_name.get(int index) - returns the element at the specified index ~~ similar methods> getFirst() and getLast()... so on */

    public static void main(String[] args) {
        // Creating an ArrayList with RollNo. of 12th Class Students-
        ArrayList<Integer> rollNo = new ArrayList<>();
        rollNo.add(12010);
        rollNo.add(12020);
        rollNo.add(12030);
        rollNo.add(12040);
        rollNo.add(12050);

        System.out.println("Students Enrolled in 12th: " + rollNo.size());
        for (int elements : rollNo){
            System.out.println(elements);
        }

        System.out.println();
        // To print the whole array as one entity:
        System.out.println("Database Entries: ");
        System.out.println(rollNo);

        System.out.println();

        // To Print Particular Element of arrayList -
        System.out.println("3rd Student: " + rollNo.get(2));
        System.out.println("First Student: " + rollNo.getFirst());
        System.out.println("Last Student: " + rollNo.getLast());

        System.out.println();

        // Manipulation - Adding elements at Indexes
        rollNo.add(2,12021);
        rollNo.add(2,12022);
            // Note: Here first , 12011 will be added to 2nd Index but then 12012 will be there as java goes downward executing , the element at last will be counted latest entry.
            // i.e. you will notice 12022 appearing before 12021
        System.out.println(rollNo);
    }
}
