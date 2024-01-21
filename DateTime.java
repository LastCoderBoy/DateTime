package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main (String[] args){

        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date

        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime); //display the current time

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Before: " + dateTime); //Display Current Date and Time

        DateTimeFormatter myFormObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDateTime = dateTime.format(myFormObj);
        System.out.println("After: " + formattedDateTime); //After Formatting
    }
}
