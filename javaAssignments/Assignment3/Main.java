package javaAssignments.Assignment3;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        PingHost pingHost = new PingHost();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter url to test ping:");
        String url = sc.nextLine();
        System.out.println("Enter no of time to check ping:");
        String rounds = sc.nextLine();
        System.out.println("Median:" + pingHost.runPing(url,rounds));
    }
}
