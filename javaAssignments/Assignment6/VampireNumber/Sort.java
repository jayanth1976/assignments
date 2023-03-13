package javaAssignments.Assignment6.VampireNumber;

import java.util.Arrays;

public class Sort {
    String sortString(String str){
        char[] strArr = str.toCharArray();
        Arrays.sort(strArr);
        return new String(strArr);
    }
}
