package org.example;

import java.util.Objects;

class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(String title, double length, double width) {
        super(title);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle other = (Rectangle) obj;
        return title.equals(other.title) && this.length == other.length && this.width == other.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, length, width, length);
    }

}
