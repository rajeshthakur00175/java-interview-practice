package org.string;

import java.util.Scanner;

public class CapitalizeWords {

    static String capitalize(String word) {
        if (word.isEmpty()) {
            return word;
        }
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(capitalize(word)).append(" ");
        }
        System.out.println("Output: " + result.toString().trim());
        sc.close();
    }
}