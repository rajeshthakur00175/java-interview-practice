package org.string;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString {

        static void duplicateWords(String inputString)
        {
            //Splitting inputString into words
            String[] words = inputString.split(" ");
            //Creating one HashMap with words as key and their count as value
            HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
            //Checking each word
            for (String word : words)
            {
                //whether it is present in wordCount
                if(wordCount.containsKey(word.toLowerCase()))
                {
                    //If it is present, incrementing it's count by 1
                    wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
                }
                else
                {
                    //If it is not present, put that word into wordCount with 1 as it's value
                    wordCount.put(word.toLowerCase(), 1);
                }
            }
            //Extracting all keys of wordCount
            Set<String> wordsInString = wordCount.keySet();
            //Iterating through all words in wordCount
            for (String word : wordsInString)
            {
                //if word count is greater than 1
                if(wordCount.get(word) > 1)
                {
                    //Printing that word and it's count
                    System.out.println(word+" : "+wordCount.get(word));
                }
            }
        }
        public static void main(String[] args)
        {
            duplicateWords("Rajesh Thakur Rajesh Thakur Rajesh Thakur Rajesh");
            duplicateWords("Java is java again java");
            duplicateWords("Super Man Bat Man Spider Man");
        }
}
