package com.saddy.interview.day5;

/*
    Java Question
    Find Second Largest Number in Array

    Input: int[] arr = {10, 5, 20, 8, 25, 18};
    Output: 20

    Requirements:

    Solve without sorting
    Use single traversal
    Handle duplicates also
 */

public class SecondHighest {
    static void main() {
//        int[] arr = {10, 5, 20, 8, 25, 18};
        int[] arr = {10,20,20,5};
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num == largest) {
                continue;
            }

            if (num > largest) {
                secLargest = largest;
                largest = num;
            } else if (num > secLargest) {
                secLargest = num;
            }
        }
        System.out.println(secLargest);

    }
}
