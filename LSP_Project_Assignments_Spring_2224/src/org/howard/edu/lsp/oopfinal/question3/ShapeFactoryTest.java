// Rickelle Jones
package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShapeFactoryTest {
    @Test
    public void testCreateCircle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("Circle");
        assertEquals(circle.getClass(), Circle.class);
    }

    @Test
    public void testCreateRectangle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.createShape("Rectangle");
        assertEquals(rectangle.getClass(), Rectangle.class);
    }
}
