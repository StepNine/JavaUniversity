//Определение интерфейса
interface MathCalculable {
    double PI = 3.141592653589793;

    double power(double base, int exponent);

    double modulus(double real, double imaginary);

    double circumference(double radius);
}

// Выполнение класса
class MathFunc implements MathCalculable {

    @Override
    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double modulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    @Override
    public double circumference(double radius) {
        return 2 * PI * radius;
    }
}

// Тест функции
public class Main {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();


        System.out.println("2^3 = " + mc1.power(2, 3));


        System.out.println("Modulus of (3 + 4i) = " + mc1.modulus(3, 4));


        System.out.println("Circumference of a circle with radius 5 = " + mc1.circumference(5));


    }
}
