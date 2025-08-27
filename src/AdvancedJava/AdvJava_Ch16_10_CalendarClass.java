package AdvancedJava;

import java.util.Calendar;
import java.util.TimeZone;

public class AdvJava_Ch16_10_CalendarClass {

    /* Calendar Class - An abstract class
       * Even though it is an abstract class, but it provides a static method which helps to get an instance of the class.

       * Syntax to intialize the calendar:
         Calendar name = Calendar.getInstance(); // WE have now got instance of the calendar
         Calling methods now: name.getCalendarType(); Prints the calendar type ex. Hebrew , gregorian etc.

         * Constructors:
           1. empty
           2. (timeZone (timezone type) , locale (locale type)) - Creates a calender with specified timezone or lacale [Locale refers to region ex. Hindi India , France etc]


         * Methods -
           1. getCalendarType()
           2. getFirstDayOfWeek()
           3. getTimeZone
           4. getID() - gives id of time zone like +5:30 for India...... etc @ https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Calendar.html#constructor-summary
     */

    public static void main(String[] args) {

        System.out.println("My Calendar"); // If not specified it will give info according to your Systems language and Region
        Calendar myCalendar = Calendar.getInstance(); // Empty Constructor
        System.out.println("Type of calendar : " + myCalendar.getCalendarType());
        System.out.println("My TimeZone : " + myCalendar.getTimeZone());
        System.out.println("My Time Zone ID: " + myCalendar.getTimeZone().getID()); // note: We are getting time zone's id so it must be used after getTimeZone

        int FirstDay = myCalendar.getFirstDayOfWeek();
        String dayName = "Sunday";
        if (FirstDay == 1){
            dayName = "Monday";
        }
        System.out.println("First Day of Week is: " + dayName);

        System.out.println();

        System.out.println("American Calendar");
        Calendar AmericanCalendar = Calendar.getInstance(TimeZone.getTimeZone("America/Chicago")); // As mentioned we need to use TimeZone type hence used TimeZone.getTimeZone
        System.out.println("Type of Chicago : " + AmericanCalendar.getCalendarType());
        System.out.println("Chicago TimeZone : " + AmericanCalendar.getTimeZone());
        System.out.println("Chicago Time Zone ID: " + AmericanCalendar.getTimeZone().getID());

        System.out.println();

        // Note: getTime() returns date
        System.out.println("Time Right Now is: " + myCalendar.getTime());

        // Important Note:
        // There are specified Calendar Classes : Ex. java.util.GregorianCalendar;
    }
}
