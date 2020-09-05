package ru.mirea.pr3.task_2;

public class ShapeTest {
    public static void main(String[] args) {
        Square square = new Square(5, "blue", true);
        System.out.println("**Square**");
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println(square);
        square.setSide(13);
        System.out.println("After setting another side: " + square.getSide());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println(square);
        square.setLength(2);
        System.out.println("Square -> Rectangle: " + square.getWidth() + " " + square.getLength());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        Rectangle rectangle = new Rectangle(7.5, 12.5, "red", false);
        System.out.println("\n**Rectangle**");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println(rectangle);
        rectangle.setColor("orange");
        rectangle.setWidth(13.9);
        System.out.println("After setting another width & color: " + rectangle.getWidth() + " & " + rectangle.getColor());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println(rectangle);

        Circle circle = new Circle(4);
        System.out.println("\n**Circle**");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println(circle);
        circle.setColor("white");
        circle.setFilled(true);
        circle.setRadius(14);
        System.out.println("After setting another params");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println(circle);
    }
}
