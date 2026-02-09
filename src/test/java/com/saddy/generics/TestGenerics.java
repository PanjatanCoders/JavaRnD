package com.saddy.generics;

public class TestGenerics {
    static void main() {
        IO.println("*".repeat(40));
        Box<String> box = new Box<>();
        box.set("test");
        IO.println(box.get());

        IO.println("*".repeat(40));

        Box<Integer> box2 = new Box<>();
        box2.set(1);
        IO.println(box2.get());
        IO.println("*".repeat(40));
    }
}
