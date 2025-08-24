package AdvancedJava;

public class AdvJava_Ch16_08_DatenTime {

    public static String White = "\u001B[0m";
    public static String Green = "\u001B[32m";
    public static String Red = "\u001B[31m";

    // The java.time was launched in Java 8 and earlier it was a part of java.util package
    // The java.util even though deprecated still has use because of its implications.

    /* Date : It is stored in form of a Long Number
       Calculations = Counting milliseconds since " 1 Jan 1970 " for precision
       Ex. A music if counted in milliseconds give accurate results of how much time it was being played.

       Year: Java accounts year "1900" as the first year
       All the calculations are being done since then.
       Ex. If we are in 1947, java will return '47 years passed'     */

    /* Methods:
       System.currentTimeMillis() - returns the milliseconds elapsed since start i.e. 1 Jan 1970  */


    public static void main(String[] args) {

        // Printing Current MilliSeconds elapsed
        System.out.println(Green + "Note all the Conversions will be from: " + Red + "1 Jan 1970" + White);
        System.out.println();
        System.out.println("Milli Seconds Elapsed: " + System.currentTimeMillis());

        // Some Fun Conversions
        // 1. Milli Seconds to Seconds
        System.out.println("Time elapsed in seconds: " + System.currentTimeMillis()/1000);

        // 2. Milli Seconds to Hours
        System.out.println("Time elapsed in Hours: " + System.currentTimeMillis()/1000/3600);

        // 3. Milli Seconds to Days
        System.out.println("Time elapsed in Days: " + System.currentTimeMillis()/1000/3600/24);

        // 4. Milli Seconds to Years (taking average Days in a year - 365)
        System.out.println("Time elapsed in Years: " + System.currentTimeMillis()/1000/3600/24/365);
    }
}
