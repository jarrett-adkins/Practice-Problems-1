package com.example.admin.practiceproblems;

/**
 * Created by Admin on 12/13/2017.
 * Write a pseudocode/function that returns the character with most occurrences in a given string.
 * <p>
 * Case sensitive?
 * Only Ascii?
 * Include not alphabet chars?
 * Is the string sorted?
 * <p>
 * The obvious solution is to use nested for loops to iterate through the string and store the count
 * in an array, but this is slow. n^2, I think.
 */

public class CharOccurrence {

    private static char occurrence(String s) {
        //this array will keep track of the character frequency. In java, each char has an integer
        //value that corresponds to it's place on the ascii table, ranging from 0 - 256. We will use
        //this value as the index in the array, and increment the value for each occurrence in the
        //string.
        int[] count = new int[256];

        for (char c : s.toCharArray())
            count[c]++;

        //Next we need to traverse the count array and find the highest value. To save time, we will
        //go through the input string, looking up each character frequency and returning the max.
        char result = ' ';
        int max = -1;

        for (int i = 0; i < s.length(); i++) {

            if (max < count[s.charAt(i)]) {
                max = count[s.charAt(i)];
                result = s.charAt(i);
            }

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println( occurrence("aabcddd") );
        System.out.println( occurrence("sample string") );
        System.out.println( occurrence("sample string%%#$^^^") );
    }
}
