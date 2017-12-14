package com.example.admin.practiceproblems;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Admin on 12/13/2017.
 *
 * Two elements whose sum is closest to zero: Given an array with both positive and negative
 * numbers, find the two elements such that their sum is closest to zero.
 *
 * Example: 1, 60, -10, 70, -80, 85
 * should give -80 and 85:
 *
 * What to do when there is a tie?
 */

public class SumCloseToZero {

    private static void findSum( int[] arr ) {
        Arrays.sort( arr );

        for( int i : arr )
            System.out.print( i + ", ");

        System.out.println();

        //left and right had indexes, will be incremented in the loops
        int i = 0;
        int j = arr.length - 1;

        //Indices of the desired values.
        // -1 indicates uninitialized min value
        int minI = -1;
        int minJ = -1;
        int min = 0;

        // finding maximal sum among negative sums
        while (i < j) {
            int cur = arr[i] + arr[j];
            System.out.println(arr[i] + " + " + arr[j] + " = " + cur);

            // Check if this is our first iteration, or if the current sum is lower than the
            // absolute value of the current lowest sum.
            if (minI == -1 || Math.abs(cur) < Math.abs(min)) {
                min = cur;
                minI = i;
                minJ = j;
            }

            // if current sum is below zero, increase it
            // by trying the next, larger element
            if (cur < 0) {
                i++;
            } else { // sum is already non-negative, move to the next element
                j --;
            }
        }

        if (minI >=0) {
            System.out.printf("%d, %d, sum=%d\n", arr[minI], arr[minJ], min);
        } else {
            System.out.println("No solution");
        }
    }

    public static void main(String[] args) {
        findSum( new int[] {1, 60, -10, 70, -80, 85} );
        findSum( new int[] {1, 60, -10, 70, -80, 85, -60} );
        findSum( new int[] {1, 60, -10, 70, -80, -61} );
    }
}