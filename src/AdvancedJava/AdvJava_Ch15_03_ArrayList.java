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
         4. AL_name.addLast(element) - adds the specified element to last position (called Append)
         5. AL_name.clear() - deletes all the element in an arrayList
         6. AL_name.remove() - removes the element at specified index ~~ Similar commands - removeFirst() & removeLast()
         7. AL_name.clone() - copies all the element in an arrayList to another arrayList (Syntax important)
         8. AL_name.indexOf(element) - returns the first time occured index of element specified (lastIndexOf() - specifies the index from the last)
         9. AL_name.get(int index) - returns the element at the specified index ~~ similar methods> getFirst() and getLast()... so on
         9. AL_name.contains(element) - returns boolean value after checking the element in the List */

    public static void main(String[] args) {
        // Creating an ArrayList with RollNo. of 12th Class Students-
        ArrayList<Integer> rollNo12 = new ArrayList<>(); // Constructor 1 in use : Read more below
        rollNo12.add(12010);
        rollNo12.add(12020);
        rollNo12.add(12030);
        rollNo12.add(12040);
        rollNo12.add(12050);

        System.out.println("Students Enrolled in 12th: " + rollNo12.size());
        for (int elements : rollNo12){
            System.out.println(elements);
        }

        System.out.println();
        // To print the whole array as one entity:
        System.out.println("Database Entries: ");
        System.out.println(rollNo12);

        System.out.println();

        // To Print Particular Element of arrayList -
        System.out.println("3rd Student: " + rollNo12.get(2));
        System.out.println("First Student: " + rollNo12.getFirst());
        System.out.println("Last Student: " + rollNo12.getLast());

        System.out.println();

        // Manipulation - Adding elements at Indexes
        rollNo12.add(2,12021);
        rollNo12.add(2,12022);
            // Note: Here first , 12011 will be added to 2nd Index but then 12012 will be there as java goes downward executing , the element at last will be counted latest entry.
            // i.e. you will notice 12022 appearing before 12021
        System.out.println(rollNo12);

        System.out.println();

        /* Constructors in ArrayList
           These helps us to define various things within the ArrayList eg. Capacity or extending another Collection

           Syntax:
           ArrayList<DataType> Name = new ArrayList <> (**Constructor here**);

           Types of Constructors:
           1. ArrayList()
           2. ArrayList(int Capacity)
           2. ArrayList(collection) */

        ArrayList<Integer> rollNo11 = new ArrayList<>(3); // Constructor 2 in use
        rollNo11.add(11001);
        rollNo11.add(11002);
        rollNo11.add(11003);
        rollNo12.addAll(0, rollNo11);
        System.out.println("Combined Students Appearing from 11th and 12th: ");
        for (int students = 0; students<rollNo12.size(); students++){
            System.out.println("-" + rollNo12.get(students));
        }

        // The same above .addall() can be achieved by 3rd type of ArrayList Constructor 3
        // ArrayList<Integer> rollNo11 = new ArrayList<>(rollNo12); ~~ Using this syntax

        System.out.println();
        // Clearing all the elements of rollNo11
        rollNo11.clear();
        System.out.println("After Clearing Class 11: " + rollNo11);

        System.out.println();

        // .contains() - Checking an element whithin the list
        System.out.println("Is 12030 participating? " + rollNo12.contains(12030));

        System.out.println();

        // Note: To at least define a minimum capacity of a List we use .ensureCapacity(int minimumCapacity);
        rollNo11.ensureCapacity(5);

        // Fun Method: .retainsAll(collection);
        ArrayList<String> carParts = new ArrayList<>(3);
        carParts.add("Engine");
        carParts.add("Tyres");
        carParts.add("Steering");

        ArrayList<String> bikeParts = new ArrayList<>(3);
        bikeParts.add("Engine");
        bikeParts.add("Tyres");
        bikeParts.add("Handle");

        // retainsAll - retains common elements within two specified list i.e. trims non-common element
        carParts.retainAll(bikeParts);
        System.out.println("Common Parts in Bike and Car is: " + carParts);


        // For more Methods: https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/ArrayList.html#method-summary

    }
}
