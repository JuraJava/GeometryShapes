package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeUtilTest {

    private ShapeUtil shapeUtil = new ShapeUtil();

    @Test
    public void shouldCalculateAreaOfAll() {
        Shape[] shapes = {
                new Circle("A", 4.0),
                new Square("B", 1.0),
                new Rectangle("C", 2.0, 3.0)
        };
        assertEquals(shapeUtil.calculateAreaOfAll(shapes), 57.2654824, 0.001);
    }

    @Test
    public void shouldCalculatePerimeterOfAll() {
        Shape[] shapes = {
                new Circle("A", 4.0),
                new Square("B", 1.0),
                new Rectangle("C", 2.0, 3.0)
        };
        assertEquals(shapeUtil.calculatePerimeterOfAll(shapes), 39.132741228, 0.001);
//        assertEquals( 39.132741228, shapeUtil.calculatePerimeterOfAll(shapes),0.001); // У преподавателя так
    }

    @Test
    public void shouldFindEqualCircles() {
        List<Shape> shapes = List.of(
                new Circle("A", 1.0),
                new Circle("B", 1.0),
                new Circle("A", 1.0),
                new Rectangle("A", 1.0, 2.0),
                new Square("A", 1.0)
        );
        Shape circle = new Circle("A", 1.0);
        List<Shape> equalCircles = shapeUtil.findEquals(shapes, circle);
        assertEquals(equalCircles.size(), 2);
    }

    @Test
    public void shouldFindEqualSquares() {
        List<Shape> shapes = List.of(
                new Square("A", 1.0),
                new Square("B", 1.0),
                new Square("A", 1.0),
                new Rectangle("A", 1.0, 2.0),
                new Circle("A", 1.0)
        );
        Shape square = new Square("A", 1.0);
        List<Shape> equalSquares = shapeUtil.findEquals(shapes, square);
        assertEquals(equalSquares.size(), 2);
    }

    @Test
    public void shouldFindEqualRectangles() {
        List<Shape> shapes = List.of(
                new Rectangle("A", 1.0, 2.0),
                new Rectangle("B", 1.0, 2.0),
                new Rectangle("A", 3.0, 2.0),
                new Rectangle("A", 1.0, 3.0),
                new Rectangle("A", 1.0, 2.0),
                new Square("B", 1.0),
                new Circle("A", 1.0)
        );
        Shape rectangle = new Rectangle("A", 1.0, 2.0);
        List<Shape> equalRectangles = shapeUtil.findEquals(shapes, rectangle);
        assertEquals(equalRectangles.size(), 2);
    }
}
