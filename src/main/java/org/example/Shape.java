package org.example;

abstract class Shape {

    String title;

    public Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}

