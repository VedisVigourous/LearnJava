/* Types of Memory in Java
   1. Stack Memory
      - Primitive data types (int, double, boolean, char, etc.) are stored as values.
      - Stack memory is used for static and method-scope allocation.
      - It is fast because of its LIFO (Last In First Out) call structure.

   2. Heap Memory
      - Reference data types (objects, arrays, classes) are stored in heap memory.
      - Heap memory is used for dynamic allocation.
      - It is comparatively slower than stack memory but more flexible.
*/

/* STACK MEMORY REPRESENTATION -

    |------------------|
    | Primitive Data   |
    |------------------|
    | Primitive Data   |
    |------------------|

    For primitive values, Java copies the actual value during assignment.
    The original variable is not modified when the copied variable changes.
*/

public class Ch01_02_IntroToMemories {
    public static void main(String[] args) {

        // --- PROPER STACK EXAMPLE USING PRIMITIVES ---
        int originalScore = 100;
        int newScore = originalScore;
        newScore = 50;

        System.out.println("\nSTACK MEMORY:-\n");
        System.out.printf("Original Score: %d%n", originalScore);
        System.out.printf("New Score: %d%n", newScore);

        /* Explanation:
         * The moment we assign originalScore to newScore, Java makes a
         * brand new copy of the number 100 on the Stack.
         * Changing newScore to 50 does absolutely nothing to originalScore.
         */

        /* HEAP MEMORY REPRESENTATION -
            |-----------------|                        ============================
            |------STACK------|                        ||                         ||
            |-----------------|                        ||        OBJECTS          ||
            |------STACK------|  ------------------>   ||          ARRAYS         ||
            |-----------------|        Pointer         ||                         ||
            |-----------------|                        ============================

            Variables of reference types store memory addresses (references)
            to objects in the heap, not the full object value directly.
        */

        // --- HEAP EXAMPLE USING OBJECTS ---
        User user1 = new User("Vedant");
        User user2 = user1;
        user2.name = "Vedu"; // Updating object through user2

        System.out.println("\nHEAP MEMORY:-\n");
        System.out.printf("User 1 Name: %s%n", user1.name);
        System.out.printf("User 2 Name: %s%n", user2.name);

        /* Explanation:
         * When we assign user1 to user2, both references point to the exact
         * same object in heap memory. Therefore, when we update the object
         * through user2, it also reflects in user1.
         */

        /* ====================================================================
           PASS BY VALUE (Explained for a 7-year-old... who is a genius)
           ====================================================================
           Imagine you have a piece of paper with the number 5 on it.
           Your friend asks for it. You don't give them your paper!
           Instead, you put it in a copy machine, print a PHOTOCOPY,
           and hand the photocopy to your friend.

           If your friend takes a red crayon and scribbles "99" over
           THEIR photocopy, does your original paper change? Nope!
           Yours still says 5.

           THAT is "Pass by Value". Java NEVER gives away the original
           variable. It ALWAYS hands out a photocopy.

           BUT WAIT! What about Objects (like our User class)?
           Imagine you have a treasure map (a Reference) pointing to a
           real-life Toy Box (an Object in the Heap).

           Java STILL just makes a photocopy of the MAP.
           But think about it: If your friend uses their copied map to go
           find the Toy Box and takes a toy out... when YOU use your map
           to go to the Toy Box later, that toy is gone!

           Java passed the value (a copy of the map), but both maps
           point to the exact same Toy Box.
           ==================================================================== */
    }

    static class User {
        String name;

        User(String name) {
            this.name = name;
        }
    }
}