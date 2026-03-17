package org.string;

public class ReverseStringIteretiveMethod {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        // Use two pointers to swap characters from the start and end
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            // Swap the characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the pointers
            left++;
            right--;
        }

        // Convert the char array back to a string
        return new String(charArray);
    }
}
