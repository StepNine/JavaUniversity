import java.util.Scanner;

public class Main {

    // Задача 1
    public static void triangularSequence(int n) {
        System.out.println("Треугольный пордок:");
        int count = 0;
        for (int i = 1; count < n; i++) {
            for (int j = 0; j < i && count < n; j++) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
    }

    // Задача 2
    public static void printOneToN(int n) {
        System.out.println("Числа от 1 до " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Задача 3
    public static void printAtoB(int a, int b) {
        System.out.println("Числа от " + a + " до " + b + ":");
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1
        System.out.print("Введите n для порядка: ");
        int n = scanner.nextInt();
        triangularSequence(n);

        // Задача 2
        System.out.print("Введите n для 2 задания: ");
        int m = scanner.nextInt();
        printOneToN(m);

        // Задача 3
        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();
        printAtoB(a, b);

        scanner.close();
    }
}
