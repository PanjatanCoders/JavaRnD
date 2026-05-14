package com.saddy.practices;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MaxCalculationFromMap {
    static void main() {
        Map<String, Integer> hsMap = new HashMap<String, Integer>();
        hsMap.put("a", 1);
        hsMap.put("b", 2);
        hsMap.put("c", 8);
        hsMap.put("d", 4);
        hsMap.put("e", 3);

//        maxKey1(hsMap);
//        maxKey2(hsMap);
        mayByStream(hsMap);

    }

    static void mayByStream(Map<String, Integer> hsMap) {
        hsMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(x -> System.out.println(x.getKey()));

        hsMap.entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);
    }

    static void maxKey2(Map<String, Integer> hsMap) {
        Map.Entry<String, Integer> maxEntrySet = Collections.max(
                hsMap.entrySet(),
                Map.Entry.comparingByValue()
        );

        System.out.println("Key: " + maxEntrySet.getKey() + " value: " + maxEntrySet.getValue());
    }


    static void maxKey1(Map<String, Integer> hsMap) {
        int max = 0;
        String maxKey="";
        for(Map.Entry<String, Integer> entry : hsMap.entrySet()) {
            if (entry.getValue() > max) {
                maxKey = entry.getKey();
                max = entry.getValue();
            }
        }

        System.out.println("Max Key: " + maxKey + " and Value: " + max);
    }
}
