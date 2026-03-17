package org.string;

public class ReverseStringRecursiveMethod {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        // Base case: if the string is empty or has only one character
        if (str == null || str.length() <= 1) {
            return str;
        }
        String subStr = str.substring(1);
        char subChar =  str.charAt(0);
        // Recursive case: reverse the rest of the string and append the first character
        return reverseString(subStr) + subChar;
    }
}
