package com.saddy.interview.day4;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*
    Find Missing Number in an Array
    Given:
    int[] arr = {1,2,3,5,6};
    Find the missing number.

    Expected Output:4

    Requirements:

    Solve using a loop first
    Bonus: optimize using formula
*/
public class MissingNumber {
    static void main() {
//        prntMissingNumber1();
        prntMissingNumber2();
    }
    static void prntMissingNumber2() {
        Integer[] arr = {1,2,3,4,6,9,11};
        Arrays.sort(arr);
        int maxNum = arr[arr.length-1];
        for (int i = 1; i <= maxNum; i++) {
            if (!Arrays.asList(arr).contains(i)) {
                System.out.println(i);
            }
        }

    }
    static void prntMissingNumber1() {
        int[] arr = {1,2,3,4,6,9,11};
        Arrays.sort(arr);
        int maxNum = arr[arr.length-1];
        for (int i = 1; i <= maxNum; i++) {
            if (Arrays.binarySearch(arr, i) < 0) {
                System.out.println(i);
            }
        }
    }
}
