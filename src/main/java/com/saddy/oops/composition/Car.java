package com.saddy.oops.composition;

public class Car {
    Engine engine;
    String name;

    public Car(Engine engine, String name) {
        this.engine = engine;
        this.name = name;
    }

    public void start() {
        engine.start();
        IO.println(name + " Car started");
    }

    public void stop() {
        engine.stop();
        IO.println(name + " Car stopped");
    }

    public void move() {
        IO.println(name + " Car moving");
    }

    public void makeSound() {
        IO.println(name + " Car making sound");
    }
}
