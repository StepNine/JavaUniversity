
class Point {
    private double x;
    private double y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

class Circle {
    private Point center;
    private double radius;

    // Конструктор
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[Center: " + center + ", Radius: " + radius + "]";
    }
}


class Tester {
    private Circle[] circles; // Массив объектов Circle
    private int count; // Количество элементов в массиве

    // Конструктор
    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    // Метод для добавления окружности в массив
    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив полон. Невозможно добавить окружность.");
        }
    }

    // Метод для отображения всех окружностей
    public void displayCircles() {
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }
}

// Главный класс для тестирования
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры точек
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);

        // Создаем окружности
        Circle c1 = new Circle(p1, 5);
        Circle c2 = new Circle(p2, 10);

        // Создаем тестер и добавляем окружности
        Tester tester = new Tester(5); // Массив на 5 окружностей
        tester.addCircle(c1);
        tester.addCircle(c2);

        // Отображаем окружности
        tester.displayCircles();
    }
}