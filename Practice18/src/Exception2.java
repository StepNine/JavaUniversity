import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите число (для просмотра исключения введите 0 или строку): ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Исключение (деление на 0)");
        } catch (NumberFormatException e) {
            System.out.println("Исключение (фомат ввода)");
        } catch (Exception e) {
            System.out.println("Общее исключение: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();
    }
}
