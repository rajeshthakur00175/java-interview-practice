package org.string;

import java.util.Scanner;

public class RemoveVowelsFromString {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string...");
        String inputString = sc.nextLine();
        String newInputString = inputString.replaceAll("[AEIOUaeiou]", "");
        System.out.println("The string without vowels...");
        System.out.println(newInputString);
        sc.close();
    }
}

