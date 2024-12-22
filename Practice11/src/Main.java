import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Получение текущей даты и времени
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        // Отображние даты и времени
        System.out.println("Текущая дата и время: " + currentDateTime.format(formatter));

        // ВВод
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите д и в в формате 'yyyy-MM-dd HH:mm': ");

        try {
            String userInput = scanner.nextLine();
            LocalDateTime userDateTime = LocalDateTime.parse(userInput, formatter);

            // Сравнение
            if (userDateTime.isBefore(currentDateTime)) {
                System.out.println("Введеное спешит");
            } else if (userDateTime.isAfter(currentDateTime)) {
                System.out.println("Введеное опыздывает");
            } else {
                System.out.println("Даты и время совпали");
            }

        } catch (DateTimeParseException e) {
            // Проверка на формат ввода
            System.out.println("Ошибка формата");
        }
    }
}
