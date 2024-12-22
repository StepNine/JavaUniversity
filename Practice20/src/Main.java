import java.util.Arrays;

// Джинерик для мин и максимума
class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T Minimum() {
        return Arrays.stream(array).min(Comparable::compareTo).orElse(null);
    }

    public T Maximum() {
        return Arrays.stream(array).max(Comparable::compareTo).orElse(null);
    }
}


class Calculator {
    //Джинерик для сложения
    public static <T extends Number, U extends Number> double sum(T a, U b) {
        return a.doubleValue() + b.doubleValue();
    }

    // Джинерик для вычитания
    public static <T extends Number, U extends Number> double subtract(T a, U b) {
        return a.doubleValue() - b.doubleValue();
    }

    // Джинерик для умножения
    public static <T extends Number, U extends Number> double multiply(T a, U b) {
        return a.doubleValue() * b.doubleValue();
    }

    // Джинерик для деления
    public static <T extends Number, U extends Number> double divide(T a, U b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Деление на нуль");
        }
        return a.doubleValue() / b.doubleValue();
    }
}

public class Main {
    public static void main(String[] args) {
        // Тест мин макс
        Integer[] mass = {5, 2, 8, 1, 3};
        MinMax<Integer> intMinMax = new MinMax<>(mass);
        System.out.println("Минимум: " + intMinMax.Minimum());
        System.out.println("Максимум: " + intMinMax.Maximum());

        String[] stringArray = {"яблоко", "апельсин", "банан", "персик"};
        MinMax<String> strminmax = new MinMax<>(stringArray);
        System.out.println("Минимум: " + strminmax.Minimum());
        System.out.println("Максимум: " + strminmax.Maximum());

        // Тест калькулятора
        double sum = Calculator.sum(5, 2.5);
        double subtract = Calculator.subtract(10, 4.2);
        double multiply = Calculator.multiply(3, 4);
        double divide = Calculator.divide(15, 3);

        System.out.println("\nРезультат:");
        System.out.println("Сумма: " + sum);
        System.out.println("Вычитание: " + subtract);
        System.out.println("Умножение: " + multiply);
        System.out.println("Деление: " + divide);
    }
}
