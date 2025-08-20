package AdvancedJava;

public class AdvJava_Ch15_06_HashingTechnique {

    /* Hashing Technique -
     * It bounds a KeyValue to an Index (KeyValue ----> Discrete Index) */

    /* ~ Internal Working -
       * used a Fn = f(x) = x % (number of Indices)
         -> x here is the value that we want to insert in our HashTable
       Example:
         |  |  |  |  |  |  |  |  |  |  |
          0  1  2  3  4  5  6  7  8  9

        Here fn = f(x) = x % 10 as there is 10 indexes present
        And value will be put on basis like: 29 , 58 , 25 , 13
        1. f(29) = 29 % 10 = 9 (9th index alloted)
        2. f(58) = 58 % 10 = 8 (8th index alloted)
        2. f(25) = 25 % 10 = 5 (5th index alloted)
        2. f(13) = 13 % 10 = 3 (3rd index alloted)

        * i.e. this technique is very fast in index alloting

        *** Known Problems ***
        1. HashCollision - When two numbers are to be alloted on an same index ex. 11 & 21 both will get 1st index
           1.1 Solution 1 [Open Addressing- Increasing indexes i.e. Empty spaces are kept in HashTable so that the other number be alloted to nearest empty index.
           1.2 Solution 2 [Chaining] - We link a linked list within the index and adds all the colliding value to it. {Like Multidimensional Arrays i.e. each index holding more indexes}

        2. HashTable Capacity Exhaustion - When the hash-table is smaller than required, i.e. no more indexes left to insert other values
           2.1 Solution - Creating a new HashTable with more indexes  */
    
    /* *** Concept *** -> 
       Load Factor - It is the measure of how much values can be inserted to a Hash-Table before increasing it's Size.


       ~~ Classes that use Hashing Technique -
          1. HashSet
          2. HashMap
          3. Linked HashMap
          4. HashTable */
    public static void main(String[] args) {

    }
}