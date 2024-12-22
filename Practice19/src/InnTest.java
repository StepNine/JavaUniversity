import java.util.Scanner;

//Внесение класса
class InnError extends Exception {
    public InnError(String message) {
        super(message);
    }
}

public class InnTest {

    //Создание метода для проверки ИНН
    public static void tester(String inn) throws InnError {
        if (inn.length() != 10 || !inn.matches("\\d+")) {  // Example: INN must be 10 digits
            throw new InnError("Неправильный формат ИНН");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Введите полное имя: ");
            String name = scanner.nextLine();


            System.out.print("Введте ИНН: ");
            String inn = scanner.nextLine();

            tester(inn); //использование метода для проверки ИНН

            System.out.println("Order successfully created for " + name + " with INN " + inn);

        } catch (InnError e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
