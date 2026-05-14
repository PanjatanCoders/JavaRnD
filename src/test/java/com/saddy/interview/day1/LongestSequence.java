package com.saddy.interview.day1;

import java.util.Arrays;
import java.util.HashSet;

/*
    Longest Consecutive Sequence
    Given an integer array:
*/
public class LongestSequence {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(set::add);
        System.out.println(set);
        int maxSeqCount = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    count++;
                }
                maxSeqCount = Math.max(maxSeqCount, count);
            }
        }
        System.out.println(maxSeqCount);
    }
}
