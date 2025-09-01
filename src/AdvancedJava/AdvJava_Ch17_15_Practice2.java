package AdvancedJava;

import java.time.LocalDate;
import java.util.ArrayList;

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
}

public class AdvJava_Ch17_15_Practice2 {
    public static void main(String[] args) {
        System.out.println();

        // Q1 - class Event
        Event program1 = new Event("Hackathon" , "Dell" , LocalDate.of(2025, 10 , 13));
        Event program2 = new Event("DanceWell" , "Dance Club" , LocalDate.of(2026, 1 , 18));
        Event program3 = new Event("Code Run" , "IT Dept" , LocalDate.of(2026, 4 , 24));
        Event program4 = new Event("Cricket Mania" , "Sahara" , LocalDate.of(2025, 9 , 30));
        Event program5 = new Event("Engineered Sports" , "Esports Mamba" , LocalDate.of(2025, 4 , 25));

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
    }
}
