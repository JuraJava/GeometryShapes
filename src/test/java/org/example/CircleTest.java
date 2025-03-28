package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    public void shouldCalculateArea() {
        Circle circle = new Circle("A", 2);
        assertEquals(circle.calculateArea(), 12.56, 0.01);
    }

    @Test
    public void shouldCalculatePerimeter() {
        Circle circle = new Circle("A", 3);
        assertEquals(circle.calculatePerimeter(), 18.84, 0.01);
    }
}

