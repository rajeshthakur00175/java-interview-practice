package org.string;

public class ReverseStringWithPreservingSpacesAnotherApproch {


    public static void main(String[] args) {
        String input = "ab cd efgh i J K lmno";
        String reversed = reverseWithSpacesPreserved(input);
        System.out.println("Original String: \"" + input + "\"");
        System.out.println("Reversed String: \"" + reversed + "\"");
    }

    public static String reverseWithSpacesPreserved(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        // Loop to reverse characters while skipping spaces
        while (left < right) {
            // Skip spaces on the left
            if (charArray[left] == ' ') {
                left++;
                continue;
            }
            // Skip spaces on the right
            if (charArray[right] == ' ') {
                right--;
                continue;
            }
            // Swap the characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move pointers
            left++;
            right--;
        }
        return new String(charArray);
    }
}

