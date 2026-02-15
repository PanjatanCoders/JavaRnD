package com.saddy.oops.composition;

public class TataNano {
    static void main() {
        Engine engine = new Engine();

        Car car = new Car(engine, "Tata Nano");

        car.start();
        car.move();
        car.stop();

    }
}
