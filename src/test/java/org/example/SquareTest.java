package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void shouldCalculateArea() {
        Square square = new Square("A", 2);
        assertEquals(square.calculateArea(), 4, 0.01);
    }

    @Test
    public void shouldCalculatePerimeter() {
        Square square = new Square("A", 2);
        assertEquals(square.calculatePerimeter(), 8, 0.01);
    }
}
