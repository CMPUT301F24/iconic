package com.example.iconic;

public abstract class Shape {
    protected Integer x;
    protected Integer y;

    // Edit the Shape class by adding a color string field. (String color = "blue";) (local your-own branch)
    protected String color = "green";
    public Shape(Integer x, Integer y) {
        this.x = x;
        this.y = y;

    }
}
