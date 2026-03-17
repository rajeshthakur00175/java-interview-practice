package org.string;


import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class CommonCharsOfTwoStrings {
    private static void printCommonChars(String firstString, String secondString) {
        char[] firstStringToCharArray = firstString.replaceAll("\\s+", "").toCharArray();
        char[] secondStringToCharArray = secondString.replaceAll("\\s+", "").toCharArray();
        Set<Character> firstStringSet = new TreeSet<>();
        Set<Character> secondStringSet = new TreeSet<>();
        for (char c : firstStringToCharArray) {
            firstStringSet.add(c);
        }
        for (char c : secondStringToCharArray) {
            secondStringSet.add(c);
        }
        firstStringSet.retainAll(secondStringSet);
        System.out.println("Common characters in alphabetical order : " + firstStringSet);
        System.out.println("Count : " + firstStringSet.size());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two input strings :");
        String firstString = sc.nextLine();
        String secondString = sc.nextLine();
        printCommonChars(firstString, secondString);
        sc.close();
    }
}

