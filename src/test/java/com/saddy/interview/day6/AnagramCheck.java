package com.saddy.interview.day6;

import java.util.Arrays;
import java.util.HashMap;

/*
    Check if Two Strings are Anagrams

    Input:
    String str1 = "listen";
    String str2 = "silent";
    Output: true

    Requirements:

    Solve using HashMap
    Bonus: solve using sorting
    Ignore case sensitivity
 */
public class AnagramCheck {
    static void main() {
        String str1 = "listen";
        String str2 = "silent";


        checkAnagram(str1,str2);
        checkAnagram1(str1, str2);
    }
    public static void checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return;

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            map.merge(ch, 1, Integer::sum);
        }

        for (char ch : str2.toCharArray()) map.merge(ch, -1, Integer::sum);

        System.out.println(map.values().stream().allMatch(v -> v == 0));
    }
    public static void checkAnagram1(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("Cannot be anagram");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        boolean isAnagram = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram) {
            System.out.println("Anagram");
        } else  {
            System.out.println("Not Anagram");
        }
    }
}
