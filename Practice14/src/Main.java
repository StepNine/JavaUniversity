import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String string = "abcdefghijklmnopqrstuvwxyz18340";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        if (input.matches(string)) {
            System.out.println("Строка совпадает");
        } else {
            System.out.println("Строка не совпадает");
        }

        scanner.close();
    }
}
