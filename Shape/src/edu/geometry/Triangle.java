package edu.geometry;

import static java.lang.Math.sin;

public class Triangle implements Shape {
    private double s1;
    private double s2;
    private double angle;

    public Triangle(double s1, double s2, double angle) {
        this.s1 = s1;
        this.s2 = s2;
        this.angle = angle;
    }

    public double Area(){
        double angleInRadians = Math.toRadians(getAngle());
        // Calculate the area using the SAS formula
        double area = 0.5 * s1 * s2 * Math.sin(angleInRadians);
        return Double.parseDouble(String.format("%.2f", area));
    }

    public double Perimeter(){
        double perimeter = Math.pow(getS1(), 2) + Math.pow(getS2(), 2) - (2*getS1()*getS2())*Math.cos(getAngle());
        return Double.parseDouble(String.format("%.2f", perimeter));
    }

    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }

    public double getAngle() {
        return angle;
    }

    public String toString(){
        return String.format("Traingle: side1 = %s, side2 = %s, angle = %.2f%n", getS1(), getS2(), getAngle());
    }
}