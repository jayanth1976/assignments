package javaAssignments.Assignment1;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchFile {
    void searchFile(String homeDirPath){
        File homeDir = new File(homeDirPath);

        //Array to store all file names in given directory(including subdirectories)
        ArrayList<String> nameArr = new ArrayList<>(Arrays.asList((Objects.requireNonNull(homeDir.list()))));

        //searches whether given file in current directory
        while(true) {
            System.out.println("Enter file to search or enter stop to exit:");
            Scanner sc = new Scanner(System.in);
            String inp = sc.nextLine();
            if(!inp.equals("stop")) {
                Pattern pattern = Pattern.compile(inp,Pattern.CASE_INSENSITIVE);
                for (String s : nameArr) {
                    Matcher match = pattern.matcher(s);
                    if (match.find()) System.out.println(s + " in " + homeDir.getAbsolutePath());
                }
                System.out.println("\n");
            }
            else break;
        }
    }
}
