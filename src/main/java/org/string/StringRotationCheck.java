package org.string;

public class StringRotationCheck {


    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "lohel";

        if (isRotation(str1, str2)) {
            System.out.println(str2 + " is a rotation of " + str1);
        } else {
            System.out.println(str2 + " is not a rotation of " + str1);
        }
    }

    public static boolean isRotation(String str1, String str2) {
        // Check if lengths are equal and strings are not null
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        // Concatenate str1 with itself and check if str2 is a substring of it
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
}
