import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;


abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}


class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius * 2, radius * 2);
    }
}


class Rectangle extends Shape {
    private int width, height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}


class DrawingPanel extends JPanel {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private Random random = new Random();

    public DrawingPanel() {
        generateRandomShapes();
    }

    private void generateRandomShapes() {
        for (int i = 0; i < 20; i++) {
            int shapeType = random.nextInt(2);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(400);
            int y = random.nextInt(400);

            if (shapeType == 0) {
                int radius = random.nextInt(50) + 10;
                shapes.add(new Circle(color, x, y, radius));
            } else {
                int width = random.nextInt(50) + 10;
                int height = random.nextInt(50) + 10;
                shapes.add(new Rectangle(color, x, y, width, height));
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Рандомные формы");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(new DrawingPanel());
        frame.setVisible(true);
    }
}
