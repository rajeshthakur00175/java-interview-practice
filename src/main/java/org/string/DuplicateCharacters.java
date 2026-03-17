package org.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "Hello, World!";
        findDuplicateCharacters(input);
    }

    public static void findDuplicateCharacters(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Loop through each character in the string
        for (char c : str.toCharArray()) {
            int key = charCountMap.getOrDefault(c,0);
            charCountMap.put(c,  key+ 1);
        }

        // Print characters that have a count greater than 1
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " times");
            }
        }
    }
}
