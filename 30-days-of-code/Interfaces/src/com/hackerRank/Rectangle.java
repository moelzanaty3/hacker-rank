package com.hackerRank;

public class Rectangle implements Polygon {
    private static int numberOfSides = 4;
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public int getNumberOfSides() {
        return numberOfSides;
    }

    @Override
    public double getPerimeter() {
        return side1 + side1 + side2 + side2;
    }
}
