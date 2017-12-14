package com.example.admin.practiceproblems;

import java.util.HashSet;

/**
 * With an array of repeated numbers from 1 to 100, find the repeated number in the array.
 *
 * Do I need to return them? Can I just print them?
 * Do you want every duplicate printed? If there are three '1's, do I report the 2 extras, or do you
 * just want one?
 */

public class RepeatedNumber {

    private static void findRepeat(int[] arr) {
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if( !h.add(arr[i]) )
                System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        findRepeat( new int[] {0,1,3,2,1,4,5,10,4,1});
    }
}
