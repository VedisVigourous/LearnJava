public class Ch02_09_ResultofArithOperations {
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
    }
}
