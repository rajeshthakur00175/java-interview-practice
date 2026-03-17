package org.string;

public class ReverseWordInAStringAnotherApproch {


    public static void main(String[] args) {
        String input = "Hello World";
        String result = reverseEachWord(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed Words String: " + result);
    }

    public static String reverseEachWord(String str) {
        // Split the string into words
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        // Reverse each word and append it to the result
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse().toString()).append(" ");
        }

        // Remove the trailing space and return the result
        return reversedString.toString().trim();
    }
}

