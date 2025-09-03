package AdvancedJava;

import javax.sound.midi.SysexMessage;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Event {
    String title;
    String organizer;
    java.time.LocalDate date;

    Event(String title , String organizer , LocalDate date){
        this.title = title;
        this.organizer = organizer;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getOrganizer() {
        return organizer;
    }

    // equals - indicate whether a particular object is equal to specified object
    @Override
    public boolean equals(Object obj) {
        if  (this.title.equals(obj)){
            return true;
        }
        else {
            return false;
        }
    }

    // hashCode() - provides a unique id to an object //
    @Override
    public int hashCode() {
        return Objects.hash(organizer);
    }
}

public class AdvJava_Ch17_15_Practice2 {
    public static void main(String[] args) {
        System.out.println();

        // Q1 - class Event
        Event program1 = new Event("Hackathon" , "Lenovo" , LocalDate.of(2025, 10 , 13));
        Event program2 = new Event("DanceWell" , "Dance Club" , LocalDate.of(2025, 11 , 18));
        Event program3 = new Event("Code Run" , "Lenovo" , LocalDate.of(2025, 12 , 24));
        Event program4 = new Event("Cricket Mania" , "Sahara" , LocalDate.of(2026, 2 , 28));
        Event program5 = new Event("Engineered Sports" , "Esports Mamba" , LocalDate.of(2026, 3 , 25));

        // LocalDate.of() - used to create an instance of Specified Date

        ArrayList<Event> programsList = new ArrayList<>();
        programsList.add(program1);
        programsList.add(program2);
        programsList.add(program3);
        programsList.add(program4);
        programsList.add(program5);

        for (Event elements : programsList){
            System.out.println("Program Info: ");
            System.out.println("Title: " + elements.getTitle());
            System.out.println("Organizer: " + elements.getOrganizer());
            System.out.println("Date: " + elements.getDate());
            System.out.println(); System.out.println("*******"); System.out.println();
        }

        System.out.println();
        System.out.println("********************");
        System.out.println();

        // Q2: Creating a to-do list
        LinkedList<String> tasks = new LinkedList<>();
        // High Priority as - offerFirst()
        tasks.offerFirst("Project 1");
        tasks.offerFirst("Assessments");
        tasks.offerFirst("Test Preparation");

        // Low Priority as - offerLast()
        tasks.offerLast("Gaming Session");
        tasks.offerLast("Netflix");
        tasks.offerLast("Software Updates");

        System.out.println("To Do List");
        for (String taskToDo : tasks){
            System.out.println("* " + taskToDo);
        }

        boolean taskDone = true;
        Scanner input = new Scanner(System.in);

        while (taskDone){
            try {
                // Task Completion confirmation //
                System.out.print("Any Task Completed? ");
                String confirmation = input.nextLine();

                // Completed Task Remover //
                if (confirmation.equalsIgnoreCase("yes")) {
                    System.out.print("Enter The Task: ");
                    String completedTask = input.nextLine();

                    // Valid Task Entry Checker //
                    if (tasks.contains(completedTask)) {
                        tasks.remove(completedTask);
                        System.out.println();

                        // Printing of New and Updated To-Do List //
                        System.out.println("New To-Do List");
                        for (String taskToDo : tasks) {
                            System.out.println("* " + taskToDo);
                        }
                        System.out.println();
                    }
                    else {
                        System.out.println("⚠️ Enter A Valid Task !");
                    }

                } else if (confirmation.equalsIgnoreCase("no")) {
                    System.out.println();
                    System.out.println("** Hope You Finish Your Tasks Soon...");
                    taskDone = false;
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }

        /* In-Code Question - Why is LinkedList better than ArrayList?
           Ans: Because upon insertion or deletion ArrayList requires, elements shifting that takes time and system resources whereas
           in LinkedList, all elements are interconnected we just need to connect the previous and succeeding element to the new one for list manipulation. */

        System.out.println();
        System.out.println("********************");
        System.out.println();

        // Q3 - Managing queue of Events in Q1 and using offer , poll and peek methods

        // Using collection constructor to get the old entries in ArrayDeque //
        ArrayDeque<Event> eventManager = new ArrayDeque<>(programsList);


        // Using offerLast();
        eventManager.offerLast(new Event("Genesis" , "College Admins" , LocalDate.of(2026 , 5 , 5)));
        eventManager.offerLast(new Event("TheVocal" , "RockerZ Group" , LocalDate.of(2026 , 7 , 12)));

        System.out.println("Initial Event List: ");
        for (Event events : eventManager) {
            System.out.println("Program Info: ");
            System.out.println("Title: " + events.getTitle());
            System.out.println("Organizer: " + events.getOrganizer());
            System.out.println("Date: " + events.getDate());
            System.out.println();
            System.out.println("*******");
        }

        // Using peekFirst()
        System.out.println("!! The Very Next Event is: " + eventManager.peekFirst().getTitle() + " on: " + eventManager.peekFirst().getDate());

        /* In-code Q: What is the difference between peek and poll?
           Ans: peek retrieves the element and doesn't delete it from the original list whereas poll also deletes it from the Original List. */

        System.out.println();

        // Using pollFirst()
        System.out.println("!! Removing the upcoming event..."); eventManager.pollFirst();

        System.out.println();

        // Using peekLast()
        System.out.println("!! The Last Event decided is: " + eventManager.peekLast().getTitle() + " on: " + eventManager.peekLast().getDate());
        System.out.println("*******");
        System.out.println();

        // Printing the manipulated ArrayDeque collection
        System.out.println("Manipulated Event List: ");
        for (Event events : eventManager){
            System.out.println("Program Info: ");
            System.out.println("Title: " + events.getTitle());
            System.out.println("Organizer: " + events.getOrganizer());
            System.out.println("Date: " + events.getDate());
            System.out.println(); System.out.println("*******"); System.out.println();
        }

        System.out.println();
        System.out.println("********************");
        System.out.println();

        // Question 4: HashSet to store organizers of the events and using equal() method
        HashSet<String> organizersList = new HashSet<>();
        int noOfOrganizers = 1;

        // Extracting the names of Organizers //
        for (Event uniqueOrganizers : eventManager){
            organizersList.add(uniqueOrganizers.getOrganizer());
        }

        System.out.println("Unique organizer: ");
        for (String organizers : organizersList){
            System.out.println(noOfOrganizers + ". " + organizers);
            noOfOrganizers++;
        }

        // Note: HashSet includes only unique organizers as, Sets are designed to store unique elements only and Lenovo had 2 entries, hence it was counted as One

        System.out.println();
        System.out.println("********************");
        System.out.println("********************");
        System.out.println("********************");
        System.out.println();

        // Question 5 - Printing LocalDate and LocalTime
        LocalDate todaysDate = LocalDate.now();
        System.out.println("Today's Date is: " + todaysDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time is: " + currentTime);

        System.out.println();

        // Printing year , month , Date and Day respectively
        System.out.println("Year: " + todaysDate.getYear());
        System.out.println("Month: " + todaysDate.getMonth());
        System.out.println("Date: " + todaysDate.getDayOfMonth());
        System.out.println("Day: " + todaysDate.getDayOfWeek());

        System.out.println();
        System.out.println("********************");
        System.out.println();

        // Question 6 - Scheduling a meeting code with followups meetings
        LocalDateTime date_n_time = LocalDateTime.of(2026 , 5 , 15 , 10 , 30);
        System.out.println("Meeting Scheduled for: " + date_n_time);

        // Extending both days and time by 2 days and 3 hours //
        System.out.println("Following meeting: " + date_n_time.plusDays(2).plusHours(3));

        System.out.println();
        System.out.println("********************");
        System.out.println();

        // Question 7 - Creating a zoned-time for international webinar

        // Step1 - Create LocalDateTime of specified time //
        LocalDateTime losAngelesTime = LocalDateTime.of(2026 , 8 , 20 , 14 , 0);

        // Step2 - Create ZoneID //
        ZoneId losAngelesID = ZoneId.of("America/Los_Angeles");

        // Step3 - Create ZonedDateTime //
        ZonedDateTime losAngelesZonedTime = ZonedDateTime.of(losAngelesTime , losAngelesID);
        System.out.println("Meeting acc/ Los Angeles: " + losAngelesZonedTime); // time will be followed by zonedOffset here -7:00

        // Converting the time to Asia/Calcutta

        // Step1 : Creating zoneID of Asia/Calcutta //
        ZoneId indiaZoneID = ZoneId.of("Asia/Calcutta");

        // Step2 : Converting the London Time to India
        ZonedDateTime convertedIndiaTime = losAngelesZonedTime.withZoneSameInstant(indiaZoneID);
        System.out.println("Converted Time to India: " + convertedIndiaTime);

        System.out.println();
        System.out.println("********************");
        System.out.println();

        // Question 8 - Duration calculator (Duration Class usage)
        LocalDateTime eventStart = LocalDateTime.of(2025 , 9 ,4 , 9 , 0);
        LocalDateTime eventEnd = LocalDateTime.of(2025 , 9 , 4 , 17 , 30);

        // Calculative method //
        Duration eventDuration = Duration.between(eventStart , eventEnd);
        long duration = eventDuration.getSeconds();
        int hours = (int) duration/3600;
        int minutes = (int) (duration%3600)/60; // Remaining seconds divided by 60 to get minutes
        System.out.println("Calculated:");
        System.out.println("Duration of Event is: "  + "Hours:Minutes - " + (hours) + ":" + (minutes));

        System.out.println();

        // Smart method //
        long hoursDuration = eventDuration.toHours();
        long minutesDuration = eventDuration.toMinutes() % 60; // Calculating remaining hours as hours are already calculated
        System.out.println("Methods Used");
        System.out.println("Duration of Event is: "  + "Hours:Minutes - " + hoursDuration + ":" + minutesDuration);

        System.out.println();
        System.out.println("********************");
        System.out.println();

        // Question 9 - Calculating time to an event (Period used to calculate left time) in java.time api
        LocalDate eventStartDate = LocalDate.of(2025 , 9 , 5);
        Period timeLeft = Period.between(todaysDate , eventStartDate);
        int daysLeft = timeLeft.getDays();
        System.out.println("Time Left till event is: " + daysLeft + " days !");

        System.out.println();
        System.out.println("********************");
        System.out.println();

        // Question 10 - Formatting Date
        ZonedDateTime currentDateTime = ZonedDateTime.now(); // Since we are printing zone also , zonedDateTime is important or parsing error occurs.
        // Initializing format //
        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd LLLL yyyy - hh:mm a z");
        // Converting to Pattern
        String formattedDate = formatDateTime.format(currentDateTime);
        System.out.println("Today\'s Date: " + formattedDate);

        System.out.println();
        System.out.println("********************");
        System.out.println();

        // Question 11 - Using Modern Calendar API
        Calendar myCalendar = Calendar.getInstance();
        // Using .getMethods
        System.out.println("Date Today: " + myCalendar.get(Calendar.DAY_OF_MONTH) + "/" + (myCalendar.get(Calendar.MONTH) + 1) + "/" + myCalendar.get(Calendar.YEAR));

        /* Why java.time is better than Calendar and Date etc.?
           Ans : Immutable - Methods of java.time are immutable hence, thread safety exists
                 Clarity - No cluttering of time methods with others due to dedicated API
                 No-Zero Based Index - In Calendar Month start from 0 that makes no sense
                 TimeZones - java.time includes support for time zones      */
    }
}
