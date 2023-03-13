package javaAssignments.Assignment1;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        SearchFile sf = new SearchFile();
        sf.searchFile(path);
    }
}
