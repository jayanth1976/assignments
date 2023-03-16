package javaAssignments.Assignment11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        CharCount charCount = new CharCount();
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        File file = new File(fileName);
        if (!file.exists() || !file.isFile()) {
            System.out.println("Invalid file name: " + fileName);
            return;
        }
        charCount.count(fileName);
    }
}
