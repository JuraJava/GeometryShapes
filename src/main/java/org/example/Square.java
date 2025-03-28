package org.example;

import java.util.Objects;

class Square extends Shape {

    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }


    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Square)) return false;
        Square other = (Square) obj;
        return title.equals(other.title) && this.side == other.side;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, side);
    }
}

