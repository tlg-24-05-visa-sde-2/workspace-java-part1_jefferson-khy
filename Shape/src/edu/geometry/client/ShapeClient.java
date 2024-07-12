package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Triangle;

class ShapeClient {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("Area: " + circle.Area());
        System.out.println("Perimeter: " + circle.Perimeter());
        System.out.println(circle);
        System.out.println();

        Rectangle rectangle = new Rectangle(4, 4);
        System.out.println("Area: " + rectangle.Area());
        System.out.println("Perimeter: " + rectangle.Perimeter());
        System.out.println(rectangle);
        System.out.println();

        Triangle triangle = new Triangle(5, 6, 60);
        System.out.println("Area: " + triangle.Area());
        System.out.println("Perimeter: " + triangle.Perimeter());
        System.out.println(triangle);
        System.out.println();
    }
}