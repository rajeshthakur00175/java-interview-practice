package org.string;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class MaximumOccurringCharProgram
{
    private static void printMaxOccurringChar(String inputString)
    {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] charArray = inputString.replaceAll("\\s+", "").toCharArray();
        for (char c : charArray)
        {
            if (charCountMap.containsKey(c))
            {
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                charCountMap.put(c, 1);
            }
        }
        Set<Entry<Character, Integer>> entrySet = charCountMap.entrySet();
        int maxCount = 0;
        char maxChar = 0;
        for (Entry<Character, Integer> entry : entrySet)
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println("Input String : "+inputString);
        System.out.println("Maximum Occurring char and its count :");
        System.out.println(maxChar+" : "+maxCount);
    }
    public static void main(String[] args)
    {
        printMaxOccurringChar("Java Concept Of The Day");
        System.out.println("========================");
        printMaxOccurringChar("Java J2ee Android Hibernate JSP");
        System.out.println("========================");
        printMaxOccurringChar("abbcccddddeeeeeffffff");
        System.out.println("=========================");
        printMaxOccurringChar("12233344445555566");
    }
}