package org.string;
import java.util.Scanner;

public class SwapChracterInWordInString {
    static String swapWord(String word) {
        if (word.length() <= 1) {
            return word;                      // nothing to swap
        }
        char[] ch = word.toCharArray();
        char temp = ch[0];
        ch[0] = ch[ch.length - 1];
        ch[ch.length - 1] = temp;
        return new String(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(swapWord(word)).append(" ");
        }

        System.out.println("Output: " + result.toString().trim());
        sc.close();
    }
}

