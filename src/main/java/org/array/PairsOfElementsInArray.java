package org.array;

import java.util.Arrays;

public class PairsOfElementsInArray {
    static void findThePairs(int[] inputArray, int inputNumber)
    {
        //Sorting the given array

        Arrays.sort(inputArray);

        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");

        //Initializing i to first index

        int i = 0;

        //Initializing j to last index

        int j = inputArray.length-1;

        //Till i crosses j, perform the following task

        while (i < j)
        {
            //If inputArray[i]+inputArray[j] is equal to inputNumber

            if(inputArray[i]+inputArray[j] == inputNumber)
            {
                //then Print inputArray[i] and inputArray[j]

                System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);

                //Increment i

                i++;

                //Decrement j

                j--;
            }

            //If inputArray[i]+inputArray[j] is smaller than inputNumber

            else if (inputArray[i]+inputArray[j] < inputNumber)
            {
                //then increment i

                i++;
            }

            //If inputArray[i]+inputArray[j] is greater than inputNumber

            else if (inputArray[i]+inputArray[j] > inputNumber)
            {
                //then decrement j

                j--;
            }
        }
    }

    public static void main(String[] args)
    {
        findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);

        findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);

        findThePairs(new int[] {12, 13, 10, 15, 8, 40, -15}, 25);

        findThePairs(new int[] {12, 23, 10, 41, 15, 38, 27}, 50);
    }
}
