package com.saddy.practices;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateChar {
    static void main() {
//        String str = "Saddam Hossain";
//
//        Map<Character, Integer> hsMap = new HashMap<Character, Integer>();
//
//        for (char ch : str.toCharArray()) {
//            hsMap.put(ch, hsMap.getOrDefault(ch, 0) + 1);
//        }
//
//        hsMap.forEach((key, value) -> {
//            if (value > 1) {
//                System.out.println(key + " " + value);
//            }
//        });
        String str = "Saddam Hossain";
        Map<Character, Integer> hsMap = new HashMap<>();
        for(char ch : str.toCharArray()) {
            hsMap.put(ch, hsMap.getOrDefault(ch, 0) + 1);
        }

        hsMap.forEach((key, value) -> {
            if(value > 1) {
                System.out.println(key + ": " + value );
            }
		});
    }
}
