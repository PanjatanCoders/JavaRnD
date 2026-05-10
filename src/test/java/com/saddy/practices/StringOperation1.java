package com.saddy.practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//remove the digits from a String and print the string in reverse
public class StringOperation1 {
    static String str = "abc123lmn456xyz";

    static void main() {
//        approach1();
//        approach2();
        approach3();
    }

    static void approach3() {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String finalStr = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!Character.isDigit(arr[i])) {
                finalStr += arr[i];
            }
        }
        System.out.println(finalStr);
    }

    static void approach2() {
        str = str.replaceAll("\\d", "");
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }

    static void approach1() {
        char[] chArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's',  't', 'u', 'v', 'w', 'x', 'y', 'z'};

        List<Character> chList = new ArrayList<>();
        for (char ch : chArray) chList.add(ch);

        char[] chArr = str.toCharArray();
        Arrays.sort(chArr);

//        System.out.println(Arrays.toString(chArr));
        List<Character> newList = new ArrayList<>();
        for (int i = 0; i < chArr.length; i++) {
            if (chList.contains(chArr[i])) {
                newList.add(chArr[i]);
            }
        }

        Collections.reverse(newList);
        String result = "";
        for (int i = 0; i < newList.size(); i++) {
            result += newList.get(i);
        }
        System.out.println("Final result: " + result);
    }
}

