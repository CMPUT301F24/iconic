package com.example.iconic;

public class Square extends Shape {
    private Integer side;

    public Square(Integer x, Integer y, Integer sideLength) {
        super(x, y);
        this.side = sideLength;
    }

    public Integer getArea() {
        return this.side * this.side;
    }

    public Integer getSide() {
        return this.side;
    }
}
