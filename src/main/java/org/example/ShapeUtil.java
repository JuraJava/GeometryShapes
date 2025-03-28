package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class ShapeUtil {

    private Random random = new Random();

    public Circle createRandomCircle() {
        double radius = random.nextDouble(10);
        return new Circle("Circle", radius);
    }

    public Square createRandomSquare() {
        double side = random.nextDouble(10);
        return new Square("Square", side);
    }

    public Rectangle createRandomRectangle() {
//        double length = random.nextDouble(10);
//        double width = random.nextDouble(10);
        double length = random.nextInt(10); // Так у преподавателя
        double width = random.nextInt(10); // Так у преподавателя
        return new Rectangle("Rectangle", length, width);
    }

    public Shape createRandomShape() {
        int randomNumber = random.nextInt(3);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else {
            return createRandomRectangle();
        }
    }

    public double calculateAreaOfAll(Shape[] shapes) {
        double areaSum = 0;
        for (Shape shape : shapes) {
            areaSum += shape.calculateArea();
        }
        return areaSum;
    }

    public double calculatePerimeterOfAll(Shape[] shapes) {
        double perimeterSum = 0;
        for (Shape shape : shapes) {
            perimeterSum += shape.calculatePerimeter();
        }
        return perimeterSum;
    }

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    public List<Shape> findEquals(List<Shape> allShapes, Shape shapeToCompare) {
//        List<Shape> result = new ArrayList<>();
//        for (Shape shape : allShapes) {
//            if (shape.equals(shapeToCompare)) {
//                result.add(shape);
//            }
//        }
//        return result;
        return allShapes.stream().
                filter(shape -> shape.equals(shapeToCompare))
                .collect(Collectors.toList()); // Так у преподавателя

    }
}

