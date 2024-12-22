// Интерфейс Convertable, описывающий метод конвертации
interface Convertable {
    double convert(double temperature);
}

// Класс для конвертации Цельсия в Кельвин
class CelsiusToKelvin implements Convertable {
    @Override
    public double convert(double temperature) {
        return temperature + 273.15; // Конвертация в Кельвин
    }
}

// Класс для конвертации Цельсия в Фаренгейт
class CelsiusToFahrenheit implements Convertable {
    @Override
    public double convert(double temperature) {
        return (temperature * 9/5) + 32; // Конвертация в Фаренгейт
    }
}

// Класс для тестирования программы
public class Main {
    public static void main(String[] args) {
        double celsiusTemperature = 25.0; // Температура в Цельсиях

        // Конвертация в Кельвин
        Convertable celsiusToKelvin = new CelsiusToKelvin();
        double kelvin = celsiusToKelvin.convert(celsiusTemperature);
        System.out.println(celsiusTemperature + "°C = " + kelvin + "K");

        // Конвертация в Фаренгейт
        Convertable celsiusToFahrenheit = new CelsiusToFahrenheit();
        double fahrenheit = celsiusToFahrenheit.convert(celsiusTemperature);
        System.out.println(celsiusTemperature + "°C = " + fahrenheit + "°F");
    }
}
