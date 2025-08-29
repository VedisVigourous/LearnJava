package AdvancedJava;

import java.time.*;

public class AdvJava_Ch17_12_TimePackage {

    /* Time Package -
       ~ Launched to simplify things and for easy access i.e. all the date and time etc in a same package
       ~ Launched after Java 8
       ~ It improved storing date and time in Java - It is even capable of storing nanoseconds.

       Syntax -
       import java.time.<class>;  */

    /* Some important class it consists -
       1. clock - provides current date , time etc using current time zone
       2. Duration - it is an amount based time. Ex. 56.81 seconds
       3. Localdate - date without the time (yyyy - mm - dd)
       4. LocalDateTime - includes both date and time
       5. offsetTime - shows time with the offset from standard Greenwich time ex. India = time + 5:30
       6. zoneID - shows the zone id: America/Chicago
       7. zoneOffset - shows the zone offset from Standard Greenwich - Ex. +4:00

       Also consists of a Exception -
       * DateTimeException - is thrown when faced problem in calculating time

       etc @ https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/package-summary.html#class-summary     */

    public static void main(String[] args) {
        System.out.println();

        // Note: Instead of creating and instance we use .now() method to print the Current Time info
        // There are many more methods related to different classes Ex. formatter , getDayOfMonth , getDayOfWeek , getMonth etc. which are similar to Calendar.get methods.

        // Printing the LocalDate
        LocalDate dateToday = LocalDate.now();
        System.out.println("Date today: " + dateToday);

        // Printing the LocalTime
        LocalTime timeNow = LocalTime.now();
        System.out.println("Time: " + timeNow); // Note the milliseconds - it improves accuracy a lot

        // Printing nano seconds
        System.out.println("Current Nanoseconds: " + timeNow.getNano()); // getNano() is a method of LocalTime etc. class's method.
    }
}
