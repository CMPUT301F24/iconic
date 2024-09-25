package com.example.iconic;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(Integer x, Integer y, double base, double height) {
        super(x, y);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "x=" + x +
                ", y=" + y +
                ", base=" + base +
                ", height=" + height +
                ", color=" + color +
                '}';
    }
}
