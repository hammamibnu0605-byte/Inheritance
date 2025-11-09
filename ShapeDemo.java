package inheritance;

abstract class Shape {
    abstract double area();

    void printArea() {
        System.out.println("Area = " + area());
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Triangle(4, 5),
            new Rectangle(3, 6),
            new Circle(2.5)
        };

        double totalArea = 0;
        for (Shape s : shapes) {
            s.printArea();
            totalArea += s.area();
        }

        System.out.println("Total area = " + totalArea);
    }
}
