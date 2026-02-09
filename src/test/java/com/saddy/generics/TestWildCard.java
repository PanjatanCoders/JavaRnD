package com.saddy.generics;

import java.util.Arrays;
import java.util.List;

import static java.lang.IO.println;

public class TestWildCard {
    static void main() {
        println("*".repeat(40));
        WildCardDemo wildCardDemo = new WildCardDemo();
        List<String> fruits = Arrays.asList("apple", "orange", "banana", "grape", "pineapple");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        wildCardDemo.printList(fruits);
        wildCardDemo.printList(numbers);
    }
}
