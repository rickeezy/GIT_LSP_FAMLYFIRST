// Rickelle Jones
package org.howard.edu.lsp.oopfinal.question3;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create Circle using factory
        Shape circle = shapeFactory.createShape("Circle");
        circle.draw();

        // Create Rectangle using factory
        Shape rectangle = shapeFactory.createShape("Rectangle");
        rectangle.draw();
    }
}
