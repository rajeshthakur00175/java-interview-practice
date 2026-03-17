package org.string;
import java.util.Scanner;
public class CountTheWords {
        public static void main(String[] args)
        {

            String s="Enter the string";
           // int len = s.length();
            String newStr = s.trim();
            String[] words = newStr.split(" ");
            System.out.println("Number of words in the string = "+words.length);
        }
}
