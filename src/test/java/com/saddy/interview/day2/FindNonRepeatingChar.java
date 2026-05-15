package com.saddy.interview.day2;

import java.util.HashMap;

/*
    Find First Non-Repeating Character
    Input: automation
    Output: u

    Requirements:
    - Use HashMap
    - Return first non-repeating character
    - If no unique character exists, return null
*/
public class FindNonRepeatingChar {
    static void main() {
        String str = "automation";
        System.out.println(findNonRepeatingChar(str));
        System.out.println(findNonRepeatingChar1(str));
    }

    static Character findNonRepeatingChar1(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return null;
    }

    static Character findNonRepeatingChar(String str) {
        int count = 1;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                continue;
            }
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    break;
                }
            }
            map.put(str.charAt(i), count);

            if (count == 1) {
                return str.charAt(i);
            }
            count = 1;
        }
        return null;
    }
}
