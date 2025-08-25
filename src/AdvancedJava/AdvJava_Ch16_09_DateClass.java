package AdvancedJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AdvJava_Ch16_09_DateClass {
    public static void main(String[] args) {
        System.out.println();

         // Date class: It is used to print the current date and time calculated using the MilliSeconds by java
         // Syntax = import needed : java.util.date;    &    initialization : Date date_name = new Date();

        Date todays_date = new Date();
        System.out.println("Constructor 1");
        System.out.println("Todays Date is: " + todays_date);

        System.out.println();

        /* Some important constructors in Java.util.date;
           1. empty() - returns current date and time
           2. (1900 + specified year , int month (JAN = 0) , int date) - prints the year with number added to 1900 and Jan here is 0 [DEPRECATED]
           3. (1900 + specified year , int month (JAN = 0) , int date , hrs , min) - aditionally prints hrs and minutes specified [DEPRECATED]
           4. constructor 3 + int sec - adittionally prints seconds [DEPRECATED]
           5. long = cnonverts specified milli seconds to date
           6. String of form = MMMM d, yyyy hh:mm:ss a :: d = date , a = AM , PM
              Need to use specify DateFormat
              Syntax = DateFormat formatName = new simpleDateFormat(MMMM d, yyyy hh:mm:ss a);
              initialization = Date name = formatName.parse(Specified Date);
         */

        // Example of Constructor 2:
        Date specified_date1 = new Date(107 , 0 , 1); // 107 = 1900 + 107 = 2007 and 0 = Jan
        System.out.println("Constructor 2");
        System.out.println("Date is: " + specified_date1);

        System.out.println();

        // Exmaple of Constructor 3
        Date specified_date2 = new Date(107 , 0 , 1 , 14 , 30); // Time = 2:30 PM = 14:30
        System.out.println("Constructor 3");
        System.out.println("Date is: " + specified_date2);

        System.out.println();

        // Exmaple of Constructor 4
        Date specified_date3 = new Date(107 , 0 , 1 , 14 , 30 , 55); // Time = 2:30 PM = 14:30 and seconds = 55th
        System.out.println("Constructor 4");
        System.out.println("Date is: " + specified_date3);

        System.out.println();

        // Exmaple of Constructor 5
        Date long_date = new Date(403985430); // Time = 2:30 PM = 14:30 and seconds = 55th
        System.out.println("Constructor 5");
        System.out.println("Long converted Date is: " + long_date);

        System.out.println();

        // Exmaple of Constructor 6
        DateFormat String_Date = new SimpleDateFormat("MMM d , yyyy , hh:mm:ss a");

        try {
            Date specifiedDate = String_Date.parse("Jan 01 , 2000 , 02:02:02 AM");
            System.out.println("Constructor 6");
            System.out.println("String Captured Date = " + specifiedDate);
        }
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println();

        // ****************************************************************************************** //

        /* Some Methods:
           1. datetoCheck.after( specified date) : check if the specified date is after date to check
           2. before - same as after
           3. specifiedDate.getTime() - returns long of the specified date

           4. getYear = it returns secified Year - 1900 as the result

           some other deprecated methods @ https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Date.html#method-summary      */

        // Example:
        System.out.println(todays_date.after(specified_date1));
        System.out.println("Todays date in Long: " + todays_date.getTime());
        System.out.println("Todays day : " + todays_date.getDay()); // Deprecated method
        System.out.println("Todays month : " + todays_date.getMonth()); // Deprecated Methods
        System.out.println("This Year after 1900: " + todays_date.getYear()); // Deprecated Methods
    }
}
