
abstract class Shape {
    public abstract String getType(); // Возвращает тип формы
    public abstract double getArea(); // Рассчет площади
    public abstract double getPerimeter(); // Периметр

    @Override
    public String toString() {
        return "Type: " + getType() +
                ", Area: " + getArea() +
                ", Perimeter: " + getPerimeter();
    }
}


class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Круг";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Радиус: " + radius;
    }
}


class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getType() {
        return "Прямоугольник";
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return super.toString() + ", Ширина: " + width + ", Длина: " + height;
    }
}


class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public String getType() {
        return "Square";
    }
}


public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(4);


        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(square);
    }

    public static void printShapeInfo(Shape shape) {
        System.out.println(shape);
    }
}
