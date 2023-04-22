public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Разница весов бойцов");
        var fightersWeight = 82.7;
        fightersWeight = fightersWeight - 78.2;
        System.out.println("Разница весов бойцов" + fightersWeight + "кг");
    }

    public static void task2() {
        System.out.println("Разница (мощность) веса бойца");
        var overload = (82.7 % 78.2);
        System.out.println("Разница (мощность) веса бойца" + overload + "кг");
    }
}