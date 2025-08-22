package AdvancedJava;

import java.util.HashSet;

public class AdvJava_Ch15_07_HashSet {

    // HashSet = Hash + Set i.e. it follows Hashing Technique and Set rules such as no repitition of elements.

    /* Constructors:
       1. empty - **** Default capacity = 16 and LoadFactor = 0.75)
       2. (initial capacity) - pre defines the capacity of HashSet
       3. (initial capacity , loadfactor) - predefines the capacity and also loadfactor
       4. (collection) - creates a new set, with elements of specified collection  */

    /* Method: old knowleadgable methods
       1. add(element)
       2. remove(element)
       3. clear
       4. clone etc... https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/HashSet.html#method-summary  */

    /* Q. Why to use Hashing Technique instead of Arrays?
       Ans. To reduce searching time in elements, In arrays program finds element linearly whereas In Hashing each elements receives, a unique index denoted using a f(x)  */

    public static void main(String[] args) {
        System.out.println();

        // Initializing the HashSet =
        HashSet <String> graphicCards = new HashSet<>();
        graphicCards.add("Nvidia RTX 1080TI");
        graphicCards.add("Nvidia RTX 3050");
        graphicCards.add("Nvidia GTX 920M");
        graphicCards.add("AMD Ryzen 7230HS");

        System.out.println(graphicCards);

        System.out.println();

        // We know that Set doesn't allow reptition i.e.
        HashSet<Integer> birthYears = new HashSet<>(3);
        birthYears.add(2007);
        birthYears.add(2008);
        birthYears.add(2007);

        System.out.println(birthYears); // Notice that it will only have two elements
    }
}
