import java.sql.SQLOutput;

public class Homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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
