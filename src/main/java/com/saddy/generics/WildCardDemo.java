package com.saddy.generics;

import java.util.List;

public class WildCardDemo {
    public void printList(List<?> list) {
        list.forEach(System.out::println);
    }
}
