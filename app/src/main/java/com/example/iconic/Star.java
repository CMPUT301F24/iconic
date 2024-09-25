package com.example.iconic;

public abstract class Star extends Shape {
    private Integer points;

    public Star(Integer x, Integer y, Integer points) {
        super(x, y);
        this.points = points;
    }
}