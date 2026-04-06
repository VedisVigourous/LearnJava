package AdvancedJava;

import java.util.HashMap;
import java.util.Map;

public class AdvJava_23_HashMap {
    public static void main(String[] args) {

        /* A dictionary is one which has a key object, and it's meaning known as Value and they both are known as
           Key - > Value Pair

           Just like a language dictionary where a word is mapped with its meaning the HashMap acts like a dictionary

           Syntax:
           Map < datatype , datatype > objectName = new HashMap <datatype_used , datatype_used>(Constructor);

           ** We need to import java.util. Map&HashMap;
           ** For constructors refer: https://docs.oracle.com/en/java/javase/25/

           Adding a key-value Pair:
           objectName.put(<KEY> , <VALUE>); -- key and value must be of the datatype defined */
           

        // Initializing and Inserting Key Value pairs:
        Map<Integer , String> weekDays = new HashMap<Integer , String>();
        weekDays.put(1 , "Monday");
        weekDays.put(2 , "Tuesday");
        weekDays.put(3 , "Wednesday");
        weekDays.put(4 , "Thursday");
        weekDays.put(5 , "Friday");
        weekDays.put(6 , "Saturday");
        weekDays.put(7 , "Sunday");

        // And to remove a key we use:
        weekDays.remove(7);

        // 1. Retrieving a Value by inserting a Key
        System.out.println("Value for Key 5: " + weekDays.get(9));

        System.out.println();

        // 2. To retrieve all the Keys Set we use keySet() - function
        System.out.println("The Key Set defined: ");
        System.out.println(weekDays.keySet());

        System.out.println();

        // 3. To retrieve all the corresponding Value or the Value set : .values() - function
        System.out.println("Corresponding Values: ");
        System.out.println(weekDays.values());

        System.out.println();

        // 4. Printing the Size of our dictionary
        System.out.println("Size of Dictionary: " + weekDays.size());

        System.out.println();
        System.out.println();

        // ==================== //
        // 5. Printing Key Value Pairs together using : .toString() function
        // ==================== //
        System.out.println("Key-Value Pairs: " + weekDays.toString());

        System.out.println();

        // 6. Clearing the Dictionary Set : .clear() function
        weekDays.clear();
        System.out.println("Is the dictionary Empty: " + weekDays.isEmpty()); // -- For confirming


    }
}
