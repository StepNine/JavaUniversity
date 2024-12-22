public class Second {
    public static void main(String[] args) {

        Double value = Double.valueOf("10.5"); //Создание объекта

        // Преобразование значения типа String к типу double
        String str_to_double = "15.5";
        double doubleMain = Double.parseDouble(str_to_double);
        System.out.println("String в double методом .parseDouble(): " + doubleMain);

        // Преобразование объекта класса Double ко всем примитивным типам
        double primitiveDouble = value.doubleValue();
        float primitiveFloat = value.floatValue();
        long primitiveLong = value.longValue();
        int primitiveInt = value.intValue();
        short primitiveShort = value.shortValue();
        byte primitiveByte = value.byteValue();

        // Вывод объекта Double
        System.out.println("Значение объекта Double: " + value);
        System.out.println("Примитивный тип double: " + primitiveDouble);
        System.out.println("Примитивный тип float: " + primitiveFloat);
        System.out.println("Примитивный тип long: " + primitiveLong);
        System.out.println("Примитивный тип int: " + primitiveInt);
        System.out.println("Примитивный тип short: " + primitiveShort);
        System.out.println("Примитивный тип byte: " + primitiveByte);

        // Преобразование литерала double к строке
        String d = Double.toString(3.14);
        System.out.println("Преобразованное значение double в String: " + d);
    }
}