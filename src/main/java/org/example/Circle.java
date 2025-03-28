package org.example;

import java.util.Objects;

class Circle extends Shape {

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * (radius);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Circle)) return false;
        Circle other = (Circle) obj;
        return title.equals(other.title) && this.radius == other.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, radius);
    }
}

