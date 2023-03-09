package javaAssignments.Assignment2;

public class Pangrams {
    void isPangram(String inp) {
        //array to keep track of letters present in input string


        int[] alphabetCnt  = new int[26];
        //converts all the characters in string to lower case and removes whitespaces
        inp = inp.toLowerCase().replaceAll("\\s", "");


        for(int i=0; i<inp.length();++i){
            int idx = inp.charAt(i) - 97;
            alphabetCnt[idx] = 1;
        }
        int sum = 0;
        for (int j : alphabetCnt) {
            sum += j;
        }
        if(sum==26)  System.out.println("Contains all letters");
        else System.out.println("Does not contain all letters in alphabet");
        /*
        Time complexity:O(n) where n is length of string
        Space complexity: O(1)
        */


    }
}
