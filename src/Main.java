public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Сумма вес бойцов");
        var fightersWeight = 78.2;
        fightersWeight = fightersWeight + 82.7;
        System.out.println("Вес бойцов" + fightersWeight + "кг");
    }

    public static void task2() {
        System.out.println("Разница веса бойцов");
        var fightersWeight = 78.2;
        fightersWeight = fightersWeight - 82.7;
        System.out.println("Вес бойцов" + fightersWeight + "кг");
    }
}