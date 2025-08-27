package AdvancedJava;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class AdvJava_Ch16_11_GregorianClass {
    public static void main(String[] args) {
        System.out.println();

        /* Gregorian Calendar is a widely Used calendar :
           Because of its, usage in almost each and every Place, specific class is made for it.

           Note: Calendar was an abstract class hence getting instance was requied
                 But, GregorianCalendar is a concrete class and sub-class of Calendar    */

        /* Mehods:
           ~ .get Methods-
           1. Initialization of a Calendar -
              calendar.get(Calendar.get_methods);
              1.1- Calendar.DATE - returns the Date with time etc
              1.2- Calendar.HOUR - returns the current hour
              1.3- Calendar.SECOND - returns the current second
              1.4- Calendar.MINUTE - returns the Current minute          */

        Calendar myCalendar = Calendar.getInstance();
        System.out.println("Date today: " + myCalendar.get(Calendar.DATE));
        System.out.println("Month: " + myCalendar.get(Calendar.MONTH));
        System.out.println("Year: " + myCalendar.get(Calendar.YEAR));

        System.out.println();

        System.out.println("Brief: " + myCalendar.get(Calendar.DATE) + "|" + myCalendar.get(Calendar.MONTH) +"|" +  myCalendar.get(Calendar.YEAR));

        System.out.println("Long Date: " + myCalendar.getTime());

        System.out.println();

        // HOUR vs HOUR_OF__DAY
        System.out.println("Hour in 12hr Format: " + myCalendar.get(Calendar.HOUR)); // It is used for 12hr format = 8PM
        System.out.println("Hour in 24hr Format: " + myCalendar.get(Calendar.HOUR_OF_DAY)); // It is used for 24hr format: 8PM = 20:00

        System.out.println();
        System.out.println("*******************");
        System.out.println();

        // Time in 12hr and 24hr
        int AmPm = myCalendar.get(Calendar.AM_PM);
        String text_ampm;
        if (AmPm == 0){
            text_ampm = "AM";
        }
        else {
            text_ampm = "PM";
        }
        System.out.println(myCalendar.get(Calendar.HOUR) + ":" + myCalendar.get(Calendar.MINUTE) + ":" + myCalendar.get(Calendar.SECOND) + " " + text_ampm);
        System.out.println(myCalendar.get(Calendar.HOUR_OF_DAY) + ":" + myCalendar.get(Calendar.MINUTE) + ":" + myCalendar.get(Calendar.SECOND));

        // ******************************************* //
        // ******************************************* //
        // ******************************************* //

        /* Gregorian Calendar Constructors:
           Contains all the constructors of Calendar including:
           1. Locale
           2. timezone as independent constructors

           Gregorian Calendar Methods:
           1. add(field , amount) - adds the amount to the specified field - Line 72
           2. isLeapYear(year) - tells whether the year is leap or not (boolean)
           3. setGregorianChange(changed initialDate) - gregorian calendar started from Oct 15 , 1582 we can change it to specified initial date
           4. setWeekDate(int Year , int Date , int Day) - sets the current date to specified
          ~~  etc. @ https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/GregorianCalendar.html#method-summary      */

        GregorianCalendar myGregCalendar = new GregorianCalendar(); // No need to getInstance as it is an concrete class
        myGregCalendar.add((GregorianCalendar.HOUR) , 2);

        System.out.println();

        System.out.println("2 Hours from now: " + myGregCalendar.get(GregorianCalendar.HOUR) + ":" + myGregCalendar.get(GregorianCalendar.MINUTE) + " " + text_ampm);

        System.out.println("Is 2025 a Leap Year: " + myGregCalendar.isLeapYear(2025));

        System.out.println();
        System.out.println();

        // ******************************************* //
        // ******************************************* //
        // ******************************************* //

        /* TimeZones -
           TimeZone class is used to create different timezones in java for ex. For Ex. In USA setting timezone to IST to get track of IST
           Standard - Taken from Greenwich that is from GreenWich - IST = +5:30

           Methods:
           1. getAvailableIDs()[int id] - specify the zone of give ID
           2. getDefault() - prints the default timezone
           3. getID() - prints id of a timezone
         */

        System.out.println("TimeZone of : " + TimeZone.getAvailableIDs()[7]);
        System.out.println("Default Timezone: " + TimeZone.getDefault());
        System.out.println("ID of India: " + TimeZone.getTimeZone("Asia/Calcutta").getID());

    }
}
