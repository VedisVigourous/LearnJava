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
    | Primitive Data   |
    |------------------|
    | Primitive Data   |
    |------------------|

    For primitive values, Java copies the value during assignment.
    The original variable is not modified when the copied variable changes.
*/

public class Ch01_02_IntroToMemories {
    public static void main(String[] args) {
        String originalName = "Vedant";
        String nickName = originalName;
        nickName = "Vedu";

        System.out.println("\nSTACK MEMORY:-\n");
        System.out.printf("Original Name: %s%n", originalName);
        System.out.printf("Nick Name: %s%n", nickName);

        /* Explanation:
         * The moment we assign the value of originalName to nickName,
         * a copy of the reference value is assigned.
         * Since String is immutable in Java, changing nickName by reassigning it
         * does not affect originalName.
        */

        /* HEAP MEMORY REPRESENTATION -
            |-----------------|                        ============================
            |------STACK------|                        ||                         ||
            |-----------------|                        ||                         ||
            |-----------------|                        ||        OBJECTS          ||
            |------STACK------|  ------------------>   ||          ARRAYS         ||
            |-----------------|        Pointer         ||        FUNCTIONS*       ||
            |-----------------|                        ||                         ||
            |------STACK------|                        ||                         ||
            |-----------------|                        ============================

            (* In Java, methods belong to classes and objects are stored in heap.)

            Variables of reference types store memory addresses (references)
            to objects in the heap, not the full object value directly.
        */

        // Example:
        User user1 = new User("Vedant");
        User user2 = user1;
        user2.name = "Vedu"; // Updating object through user2

        System.out.println("\nHEAP MEMORY:-\n");
        System.out.printf("User 1 Name: %s%n", user1.name);
        System.out.printf("User 2 Name: %s%n", user2.name);

        /* Explanation:
         * When we assign user1 to user2, both references point to the same object in heap memory.
         * Therefore, when we update the object through user2, it also reflects in user1.
        */

        /* Think of it Like:
           * A person named Vedant is:
             - A human
             - A student
             - A son
             - A brother etc.

             = All these roles are like different references pointing to the same person.

           * If one role changes the person:
             - e.g., brother changes hairstyle, all roles observe the updated person.

             = Hence, same reference behavior with heap objects.

             In short: Same person may be assigned to different roles,
             but if the person changes, all roles observe that change.
        */
    }

    static class User {
        String name;

        User(String name) {
            this.name = name;
        }
    }
}
