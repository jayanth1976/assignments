package javaAssignments.Assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KycRange {
    void getRange(LocalDate signupDate,LocalDate currentDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        int yearsToAdd = currentDate.getYear() - signupDate.getYear();
        LocalDate fromRange = signupDate.plusYears(yearsToAdd).minusDays(30);
        LocalDate toRange = signupDate.plusYears(yearsToAdd).plusDays(30);
        if(currentDate.getYear() <= signupDate.getYear()) {
            System.out.println("No range");
            return;
        }
        else if(currentDate.isAfter(fromRange) && currentDate.isBefore(toRange)) {
            System.out.println(fromRange.format(formatter) + " " + currentDate.format(formatter));
        }
        else{
            System.out.println(fromRange.format(formatter) + " " + toRange.format(formatter));
        }
    }
}
