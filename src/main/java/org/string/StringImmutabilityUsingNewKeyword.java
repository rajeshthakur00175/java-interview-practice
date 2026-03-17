package org.string;

public class StringImmutabilityUsingNewKeyword {

    public static void main(String[] args) {
        String s1 = new String("JAVA");

        System.out.println(s1);         //Output : JAVA

        s1.concat("J2EE");

        System.out.println(s1);         //Output : JAVA
    }
}

