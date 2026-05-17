package org.array;

public class EqualityOfTwoArraysUsingIterative {
    public static boolean areEqual(int[] arrayOne, int[] arrayTwo) {
        if (arrayOne == null || arrayTwo == null) {
            return arrayOne == arrayTwo;
        }
        if (arrayOne.length != arrayTwo.length) {
            return false;
        }
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] != arrayTwo[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arrayOne = {2, 5, 1, 7, 4};
        int[] arrayTwo = {2, 5, 1, 7, 4};
        boolean equalOrNot = areEqual(arrayOne, arrayTwo);
        if (equalOrNot) {
            System.out.println("Two Arrays Are Equal");
        } else {
            System.out.println("Two Arrays Are Not equal");
        }
    }
}
