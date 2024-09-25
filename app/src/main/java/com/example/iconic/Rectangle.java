package com.example.iconic;

public class Rectangle extends Shape{
    private Integer width;
    private Integer height;
    public Rectangle(Integer x, Integer y, Integer width, Integer height){
        super(x,y);
        this.width = width;
        this.height = height;
    }
}
