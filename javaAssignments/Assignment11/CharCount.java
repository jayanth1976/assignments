package javaAssignments.Assignment11;

import java.io.IOException;
import java.util.HashMap;
import java.io.*;
import java.util.Map;

public class CharCount {
    public void count(String fileName) throws IOException {

        Map<Character, Integer> charCountMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int intValue;
            while ((intValue = reader.read()) != -1) {
                char character = (char) intValue;
                int count = charCountMap.getOrDefault(character, 0);
                charCountMap.put(character, count + 1);
            }
        }
        try (PrintWriter writer = new PrintWriter(new FileWriter("result.txt"))) {
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                writer.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        System.out.println("Character count saved to char_count.txt");
    }
}

