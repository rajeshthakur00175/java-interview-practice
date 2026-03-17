package org.string;

public class CountCharacterOcceranceWithOutLoop {

        public static void main(String[] args)
        {
            String s = "Java is java again java again";

            char c = 'a';
            int len = s.length();
            String newString = s.replace("a", "");
            int count = len - newString.length();

            System.out.println("Number of occurances of 'a' in "+s+" = "+count);
        }

}
