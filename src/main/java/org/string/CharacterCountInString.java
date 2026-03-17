package org.string;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountInString {

    public static void main(String[] args) {
        String input = "Hello World!";
        countCharacterOccurrences(input);
    }

    public static void countCharacterOccurrences(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Loop through each character in the string
        for (char c : str.toCharArray()) {
            // Update the count in the map
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print the character counts
        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}
