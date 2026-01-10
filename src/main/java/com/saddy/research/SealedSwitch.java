package com.saddy.research;

sealed interface Shape permits Circle, Rectangle{}

final class Circle implements Shape {
    double radius;
}

final class Rectangle implements Shape {
    double width, height;
}

//final class Triangle implements Shape {}

public class SealedSwitch {
    double area(Shape shape) {
        return switch (shape) {
            case Circle c -> Math.PI * c.radius * c.radius;
            case Rectangle r -> r.width * r.height;
        };
    }
}


