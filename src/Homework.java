import java.sql.SQLOutput;

public class Homework {
    public static void main(String[] args) {
    }
    private static void task1() {
        int stars = 3000000;
        byte redApple = 100;
        short blackPen = 32000;
        long grainSand = 900000000L;
        float laborProductivity = 45_45;
        double turtleSpeed = 1_25789;
        System.out.println("Звёзды = " + stars + "ед");
        System.out.println("Яблоко красное = " + redApple + "кг");
        System.out.println("Ручка чёрная = " + blackPen + "шт");
        System.out.println("Крупинок песка = " + grainSand + "пылинок");
        System.out.println("Производительность труда = " + laborProductivity + "чел/ час");
        System.out.println("Скорость черепахи = " + turtleSpeed + "км/ ч");
    }
    private static void task2() {
        float a = 27_12;
        long b = 987678965549L;
        double c = 2_786;
        short d = -159;
        short e = 27897;
        byte f = 67;
    }
    private static void task3() {
        byte a = 23;
        byte b = 27;
        byte c = 30;
        short e = 480;
        int f = (a + b + c) / e;
        System.out.println("На каждого ученика рассчитано = " + f + "листов бумаги");
    }
    private static void task4() {
        byte bottleMakingMachinePerformance2minutes = 16;
        int bottleMakingMachinePerformance20minutes = bottleMakingMachinePerformance2minutes * 10;
        int bottleMakingMachinePerformance1hour = bottleMakingMachinePerformance20minutes * 3;
        int bottleMakingMachinePerformanceDay = bottleMakingMachinePerformance1hour * 24;
        int bottleMakingMachinePerformance3Day = bottleMakingMachinePerformanceDay * 3;
        int bottleMakingMachinePerformanceMonth = bottleMakingMachinePerformance3Day * 10;
        System.out.println("За 20 минут машина произвела = " + bottleMakingMachinePerformance20minutes + "шт бутылок");
        System.out.println("За 1 час машина произвела = " + bottleMakingMachinePerformance1hour + "шт бутылок");
        System.out.println("За 1 день машина произвела = " + bottleMakingMachinePerformanceDay + "шт бутылок");
        System.out.println("За 3 дня машина произвела = " + bottleMakingMachinePerformance3Day + "шт бутылок");
        System.out.println("За 1 месяц машина произвела = " + bottleMakingMachinePerformanceMonth + "шт бутылок");
    }
    private static void task5() {
        byte cansPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int whiteBrownPaint = whitePaint + brownPaint;
        int totalClasses = cansPaint / whiteBrownPaint;
        int totalWhitePaint = totalClasses * whitePaint;
        int totalBrownPaint = totalClasses * brownPaint;
        System.out.println("В школе, где " + totalClasses + "классов" + "нужно "
                + totalWhitePaint + "банок белой краски" + "и " + totalBrownPaint + "банок коричневой краски");
    }
    private static void task6() {
        byte banana = 5;
        byte weightBanana = 80;
        var totalWeightBanana = banana * weightBanana;
        byte milk100Ml = 105;
        byte milkPc = 2;
        var totalWeightMilk = milk100Ml * milkPc;
        byte iceCreamIceCream = 2;
        byte weight1CreamIceCream = 100;
        var totalWeightCreamIceCream = iceCreamIceCream * weight1CreamIceCream;
        var rawEggs = 4;
        var weight1rawEgge = 70;
        var totalWeightRawEgge = rawEggs * weight1rawEgge;
        var WeightSportsBreakfast = totalWeightBanana + totalWeightMilk + totalWeightCreamIceCream + totalWeightRawEgge;
    }
    private static void task7() {
        var totalLoseWeight = 7000;
        var loseWeightDay = 250;
        var loseWeightDay2 = 500;
        var daysWeightLossWhenResetting250 = totalLoseWeight / loseWeightDay;
        var daysWeightLossWhenResetting500 = totalLoseWeight / loseWeightDay2;
        System.out.println("При похудении на 250 грамм в день, понадобится спортсмену "
                + daysWeightLossWhenResetting250 + "дней");
        System.out.println("При похудении на 500 грамм в день, понадобится спортсмену "
                + daysWeightLossWhenResetting500 + "дней");
    }
}
public class Homework2 {
    public static void main(String[] args) {
    }
    private static void task1() {
        int age = 25;
        if (age >= 18) {
            System.out.println("Он совершеннолетний");
        } else {
            System.out.println("Он не совершеннолетний");
        }
    }
    private static void task2() {
        int temp = 5;
        if (temp < 5) {
            System.out.println("На улице холодно нужно одеть шапку");
        } else {
            System.out.println("На улице тепло можно без шапки");
        }
    }
    private static void task3() {
        int speed = 60;
        if (speed > 60) {
            System.out.println("Придется заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }
    }
    private static void task4() {
        int age = 22;
        if (age >= 2@@ age <=6){
            System.out.println("Нужно ходить в детский сад");
        }
        if (age >= 6 @ @age <=18){
            System.out.println("Нужно ходить в школу");
        }
        if (age >= 18 @ @age <=24){
            System.out.println("Нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Нужно ходить на работу");
        }
    }
    private static void task5() {
        int age = 5;
        if (age < 5) {
            System.out.println("Не может кататься на аттракционе");
        }
        if (age >= 5 @ @age <14){
            System.out.println("Может кататься только в сопровождении взрослого");
        }
        if (age > 14) {
            System.out.println("Может кататься без сопровождения взрослого");
        }
    }
    private static void task6() {
        int totalPlace = 102;
        int seatCount = 60;
        int standCount = totalPlace - seatCount;
        int busy = 70;
        if (busy >= totalPlace) {
            System.out.println("Полностью забит вагон");
        }
    }
    private static void task7() {
        int one = 1;
        int two = 2;
        int three = 3;
        int max;
        if (one > two) {
            max = one;
        } else {
            max = two;
        }
        if (max > three) {
            System.out.println(max);
            System.out.println(three);
        }
    }
}