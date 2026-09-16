public class Ch03_15_02_StringBuilder {
    public static void main(String[] args) {

        /* String Performances ->
           -> Constant adding to the string always takes up new space.
           -> On situations where we have to constantly concatenate on a single variable
           -> Always, a new memory space is created and the old memory is just wasted!

           Example: Concatenating all the alphabets in a single variable one by one  */


        String alphabets = "";

        for (int i = 0; i < 26; i++){
            alphabets += (char)('a' + i);
        }

        System.out.println("Alphabets in English are: " + alphabets);

        /* Complexity -> On adding string together! from 1 + -> + 26 -> n
           i.e. n(n+1)/2 = O(n²) is the complexity!  -> Not a good complexity! */


        System.out.println();


        /* To prevent this issue, We have

           ======================
            STRINGBUILDER CLASS
           ======================

           -> It allows to make changes to the existing one object rather than creating a new object again and again.
           -> The memory reference also remains the same, that is all changes to the same memory address!

           # Working ->
           It creates an array of values at a single memory address!
           -> We can target each of it's stored values using its methods

           Some methods ->
           1. append
           2. charAt
           3. insert
           4. deleteCharAt
           5. reverse
           6. indexOf etc. */



        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println("Alphabets using StringBuilder: " + builder.toString());


        /* On debugging, we will notice that -> StringBuilder uses the same memory address to store all the values
           -> Whereas the above will always target a new memory reference!  */
    }
}
