package javaAssignments.Assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        Pangrams pangrams = new Pangrams();
        pangrams.isPangram(inp);
    }
}
