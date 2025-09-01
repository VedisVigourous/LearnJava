package AdvancedJava;

// For Q1
import java.util.ArrayList;
// For Q2
import java.util.Date;
import java.text.SimpleDateFormat;

// For Q3
import java.util.Calendar;

// For Q4
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// For Q5
import java.util.HashSet;

public class AdvJava_Ch17_14_Practice1 {
    public static void main(String[] args) {
        System.out.println();

        // Question 1 - Creating an ArrayList with 10 students name and printing it using for-each loop
        ArrayList<String> students = new ArrayList<>();
        students.add("Harish");
        students.add("Shourya");
        students.add("Vedant");
        students.add("Rajiv");
        students.add("Neha");
        students.add("Sabrina");
        students.add("Rocky");
        students.add("Raveena");
        students.add("Isabella");
        students.add("Ruchika");

        int sNo = 1;

        System.out.println("Students List: ");
        for (String elements : students){
            System.out.printf("%d. %s\n" , sNo , elements);
            sNo++;
        }

        System.out.println();
        System.out.println("********************");
        System.out.println();

        // Question 2: Date Class to print time in format (HH:mm:ss)
        Date dateNow = new Date();
        System.out.println("Formatted Date: " + dateNow.getHours() + ":" + dateNow.getMinutes() + ":" + dateNow.getSeconds());

        System.out.println();
        System.out.println("********************");
        System.out.println();

        // Question 3: Q2 by using Calendar Class
        Calendar myCalendar = Calendar.getInstance();
        System.out.println("Calendar: " + myCalendar.get(Calendar.HOUR_OF_DAY) + ":" + myCalendar.get(Calendar.MINUTE) + ":" + myCalendar.get(Calendar.SECOND));

        System.out.println();
        System.out.println("********************");
        System.out.println();

        // Question 4: Q2 Using Time API
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("HH:mm:ss");
        String myTime = time.format(formattedDate);
        System.out.println("Formatted Time: " + myTime);

        System.out.println();
        System.out.println("********************");
        System.out.println();

        // Question 5: Creating a HashSet with duplicate elements. Verifying all duplicates are counted as 1 element
        HashSet<Integer> years = new HashSet<>();
        years.add(2000); //1
        years.add(2000); //2 ~~ Duplicate
        years.add(2007); //3
        years.add(2008); //4
        years.add(1980); //5
        years.add(1981); //6
        years.add(1981); //7 ~~ Duplicate

        // Length should be: 7

        System.out.println("Elements of HashSet: " + years);
        System.out.println("Length: " + years.size());

        // Note: Length printed will be 5 deleting the duplicate items: Hence Proved - Sets doesn't allow duplicate elements.
    }
}
