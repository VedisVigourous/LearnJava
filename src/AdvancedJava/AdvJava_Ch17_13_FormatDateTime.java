package AdvancedJava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AdvJava_Ch17_13_FormatDateTime {
    public static void main(String[] args) {
        System.out.println();

        /* Fomat class within time api is made to create out prescribed Date-Time format.
           Syntax to import-
           import java.time.format.<Class>;

           <Classes>:-
           1. DateTimeFormatter
           2. DateTimeFormatterBuilder

           Exception Class -
           DateTimeParseException etc. @ https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/format/package-summary.html#class-summary  */

        // The Default Format is yyyy - mm - dd T hh:mm:ss:ns (ns - nanosecond)

        LocalDateTime defaultTime = LocalDateTime.now();
        System.out.println("Default Time Format is: " + defaultTime); System.out.println();

        /* To print date in our prescribes format 2 steps are needed:
           1. setting of format- Using ofPattern() method of DateTimeFormatter
           DateTimeFormatter <formatName> = DateTimeFormatter.ofPattern("Specify Pattern");
           ~ Symbols -
             a. d = date
             b. M = month
             c. y = year
             d. h = hour / H = 24 hour
             e. m = minutes
             f. s = seconds
             g. a = AM/PM
             h. E = day_of_Week (note multiple - E will give full Day Name , {4 Es} )

             more @ https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/format/DateTimeFormatter.html#patterns

             **** Some PreDefined Formats: https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/time/format/DateTimeFormatter.html#predefined

           2. Telling the System to parse the date in Specified Format
           String <name> = Date_To_Format.format(<formatName>);

           Then Print.     */

        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("|| dd-MM-yyyy - LLL || hh-mm-ss a || EEEE ||");
        String myDateTime = defaultTime.format(formattedDate);
        System.out.println("Formatted Date and Time: " + myDateTime);

        System.out.println();

        // Printing date in a predefined Format:
        DateTimeFormatter predefinedTime = DateTimeFormatter.ISO_LOCAL_TIME;
        String definedTime = defaultTime.format(predefinedTime);
        System.out.println("Pre-Defined Time Format: " + definedTime);
    }
}
