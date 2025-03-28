package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    public void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle("A", 2.5, 3.0);
        assertEquals(rectangle.calculateArea(), 7.5, 0.01);
    }

    @Test
    public void shouldCalculatePerimeter() {
        Rectangle rectangle = new Rectangle("A", 2.5, 3.0);
        assertEquals(rectangle.calculatePerimeter(), 11, 0.01);
    }
}
