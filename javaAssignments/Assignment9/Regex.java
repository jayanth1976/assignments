package javaAssignments.Assignment9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public void checkString(String str){
        Pattern pattern = Pattern.compile("^[A-Z].*\\.$");
        Matcher matcher = pattern.matcher(str);
        if(matcher.find()) System.out.println("Pattern matched");
        else System.out.println("Pattern does not matched");
    }

}
