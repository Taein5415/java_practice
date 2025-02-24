package com.polymorphism.level01.basic;

public class Circle extends Shape implements Resizable{
    double radius;
    public final static double PI = 3.14;
    @Override
    double calculateArea() {
        return radius*radius*PI;
    }

    @Override
    double calculatePerimeter() {
        return PI*2*radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }

    @Override
    String getName() {
        return "Circle";
    }
}
