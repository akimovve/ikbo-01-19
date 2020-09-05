package ru.mirea.pr3.task_3;

import ru.mirea.pr3.task_2.Shape;
import ru.mirea.pr3.task_2.Circle;
import ru.mirea.pr3.task_2.Rectangle;
import ru.mirea.pr3.task_2.Square;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // System.out.println(s1.getRadius());
        /*
        1. Таким образом нельзя поступить по той причине, что Circle наследуется от Shape.
        Соответственно, при вызове метода getRadius() виртуальная машина пытается найти его в классе-родителе (в Shape).
        Если находит, то вызывает его, либо переопределенный (если имеется).
        Однако вызвать метод, которого нет в родителе, невозможно.
         */

        Circle c1 = (Circle) s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        /*
        2. Поскольку изначально был создан объект класса Circle, то доункастинг сработал без ошибок.
        Такое возможно по причине наследственной связи Circle и Shape (Shape - родитель).
         */

        // Shape s2 = new Shape();
        /*
        3. По определению абстрактного класса создавать объекты этого класса невозможно.
        Роль абстрактных классов заключается исключительно в предоставлении базового функционала для классов-наследников.
        И уже производные классы реализуют весь опиисанный функционал.
         */

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // System.out.println(s3.getLength());
        /*
        4. Аналогично в п.1 для класса Rectangle и метода getLength().
         */

        Rectangle r1 = (Rectangle) s3; // Downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        /*
        5. Аналогично в п.2.
         */

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // System.out.println(s4.getSide());
        /*
        6. Аналогично в п.1 для класса Square и метода getSide().
         */

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide());
        System.out.println(r2.getLength());
        /*
        7. В данном примере происходит даункастинг Shape -> Rectangle и попытка получить метод класса Square,
        который является наследником класса Rectangle.
        Даункастинг отработает без ошибок, однако вызов метода из класса, который является наследником, невозможен.
        Причиной является то, что данный метод характерен исключительно для класса-наследника,
        а класс-родитель о нём не знает.
         */

        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
        /*
        8. Даункастинг Rectangle -> Square.
        Отработает без ошибок, потому что Square является наследником класса Rectangle.
         */
    }
}
