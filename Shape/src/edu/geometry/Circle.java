package edu.geometry;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double Area(){
        double area = Math.PI * getRadius() * getRadius();
        return Double.parseDouble(String.format("%.2f", area));
    }

    public double Perimeter(){
        double perimeter = 2 * Math.PI * getRadius();
        return Double.parseDouble(String.format("%.2f", perimeter));
    }

    public double getRadius() {
        return radius;
    }

    public String toString(){
        return String.format("Circle: radius = %.2f%n", getRadius());
    }
}