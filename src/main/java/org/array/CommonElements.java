package org.array;

import java.util.HashSet;

public class  CommonElements {
    public static void main(String[] args) {
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

        HashSet<String> set = new HashSet<>();

        for (String s : s1) {
            for (int j = 0; j < s2.length; j++) {
                if (s.equals(s2[j])) {
                    set.add(s);
                }
            }
        }

        System.out.println(set);     //OUTPUT : [THREE, FOUR, FIVE]
    }

}
