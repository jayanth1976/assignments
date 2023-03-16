package javaAssignments.Assignment9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        Regex regex = new Regex();
        regex.checkString(str);
    }
}
