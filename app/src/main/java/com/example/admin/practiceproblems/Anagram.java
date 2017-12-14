package com.example.admin.practiceproblems;

import java.util.Arrays;

/**
 * Created by Admin on 12/14/2017.
 */

public class Anagram {

    private static boolean findAnagram(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

//        for( char c : arr1 )
//            System.out.println(c);

        // check if they are the same size
        if( arr1.length != arr2.length ) {
            System.out.println("Not same length");
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(findAnagram("geeksforgeeks", "forgeeksgeeks"));
    }
}
