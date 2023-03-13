package javaAssignments.Assignment4;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        KycRange kycRange = new KycRange();
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0){
            String signupDateStr = sc.next();
            String currentDateStr = sc.next();
            LocalDate signupDate = LocalDate.parse(signupDateStr, formatter);
            LocalDate currentDate = LocalDate.parse(currentDateStr, formatter);
            kycRange.getRange(signupDate,currentDate);
        }
    }
}
