//  Интерфейс Chair
interface Chair {
    void sit();
}


class VictorianChair implements Chair {
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void sit() {
        System.out.println("Сидит на Victorian Chair, возраст: " + age);
    }
}


class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Магия!");
    }

    @Override
    public void sit() {
        System.out.println("Сидит на Magic Chair.");
    }
}


class FunctionalChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void sit() {
        System.out.println("Сидит на a Functional Chair.");
    }
}


interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);

    MagicChair createMagicChair();

    FunctionalChair createFunctionalChair();
}


class ChairFactory implements AbstractChairFactory {
    @Override
    public VictorianChair createVictorianChair(int age) {
        return new VictorianChair(age);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}


class Client {
    private Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void sit() {
        if (chair != null) {
            chair.sit();
        } else {
            System.out.println("Не задан стул!");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory();
        Client client = new Client();

        // Создание VictorianChair
        VictorianChair victorianChair = factory.createVictorianChair(120);
        client.setChair(victorianChair);
        client.sit();
        System.out.println("Возраст Victorian Chair: " + victorianChair.getAge());

        // Создание MagicChair
        MagicChair magicChair = factory.createMagicChair();
        client.setChair(magicChair);
        client.sit();
        magicChair.doMagic();

        // Создание FunctionalChair
        FunctionalChair functionalChair = factory.createFunctionalChair();
        client.setChair(functionalChair);
        client.sit();
        System.out.println("Сумма '3' и '4': " + functionalChair.sum(3, 4));
    }
}
