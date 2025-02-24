package com.polymorphism.level01.basic;

public class Rectangle extends Shape implements Resizable{
    double width;
    double height;
    @Override
    public void resize(double factor) {
        width*=factor;
        height*=factor;
    }

    @Override
    double calculateArea() {
        return width*height;
    }

    @Override
    String getName() {
        return "Rectangle";
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculatePerimeter() {
        return 2*width + 2*height;
    }
}
