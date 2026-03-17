package org.string;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String input = "  Hello,   World!   ";
        String result = removeWhiteSpaces(input);
        System.out.println("Original String: \"" + input + "\"");
        System.out.println("String without spaces: \"" + result + "\"");
    }

    public static String removeWhiteSpaces(String str) {
        // Use the replaceAll() method with a regex to match all white spaces
        return str.replaceAll("\\s", "");
    }
}