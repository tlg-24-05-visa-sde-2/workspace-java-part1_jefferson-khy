package edu.geometry;

public class Rectangle implements Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double Area(){
        return getLength() * getWidth();
    }

    public double Perimeter(){
        return (getLength() * 2) + (getWidth() * 2);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public String toString() {
        return String.format("Rectangle: width = %.2f, length = %.2f%n", getWidth(), getLength());
    }
}