public class Ch02_10_ResultofArithOperations {
    public static void main(String[] args) {
        //Results have some set of rules if not assigned a type
        //Theory:
        // byte + short =  int                      // i.e. dbl >> flt >> int >> byte=short=char
        // short + int = int                        // if b,s,c occurs int is often formed if not intervened by f , d
        // long + flt = flt
        // int + float = flt
        // char + int = int
        // char + short = int
        // long + dbl = dbl
        // flt + dbl = dbl

        //Example:
        float a = 3.598f;
        double b = 8.47; // By default, double
        System.out.println(a + b); //Will be double
        // Printing the type of result of a+b
        System.out.println(((Object)(a+b)).getClass().getSimpleName()); // Will be double


        /* TypeCasting */
        int num = (int) 39479823.342f;
        System.out.println(num);

        /* Explanation: Even though the number provided is a float, we are typecasting it to int. So, the result will be an integer. */

        /* NOTE:::: That is: TypeCasting happens only from smaller to bigger datatypes.
           Ex. If input is for int and output is for float, then the result will be 'float'. But if input is for float and output is for int, then the result will be int.  */
    }
}
