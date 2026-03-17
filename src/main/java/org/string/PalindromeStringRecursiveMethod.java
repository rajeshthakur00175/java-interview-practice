package org.string;

import java.util.Scanner;

public class PalindromeStringRecursiveMethod {


    private static boolean isItPalindrome(String inputString) {
        //If inputString has only one or zero char, return true

        if (inputString.length() < 2) {
            return true;
        } else {
            //Check both ends of inputString for equality

            if (inputString.charAt(0) != inputString.charAt(inputString.length() - 1)) {
                //if both ends are not equal, return false

                return false;
            } else {
                //if both ends are same, call isItPalindrome() with chars at both ends removed

                return isItPalindrome(inputString.substring(1, inputString.length() - 1));
            }
        }
    }

    public static void main(String[] args) {
        //Take input string from the user

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Input String :");

        String inputString = sc.nextLine();

        //Clean inputString by removing spaces and negating the case of the letters
        String cleanInputString = inputString.replaceAll("\\s+", "").toLowerCase();
        if (isItPalindrome(cleanInputString)) {
            System.out.println(inputString + " is a palindrome");
        } else {
            System.out.println(inputString + " is not a palindrome");
        }
        sc.close();
    }
}

