public class Homework4Cycles {
    public static void main(String[] args) {
    }

    private static void task1() {
        for (int Numbers = 1; Numbers <= 10; Numbers++) {
            System.out.println(Numbers);
        }
    }

    private static void task2() {
        for (int Numbers = 10; Numbers >= 1; Numbers++) {
            System.out.println(Numbers);
        }
    }

    private static void task3() {
        for (int Numbers = 0; Numbers <= 17; Numbers = Numbers + 2) {
            System.out.println(Numbers);
        }
    }

    private static void task4() {
        for (int Numbers = 10; Numbers <= -10; Numbers--) {
            System.out.println(Numbers);
        }
    }

    private static void task5() {
        for (int years = 1904; years <= 2096; years = years + 4) {
            System.out.println(years);
        }
    }

    private static void task6() {
        for (int Numbers = 7; Numbers <= 98; Numbers = Numbers + 7) {
            System.out.println(Numbers);
        }
    }

    private static void task7() {
        for (int Numbers = 1; Numbers <= 512; Numbers = Numbers * 2) {
            System.out.println(Numbers);
        }
    }

    private static void task8() {
        for (int Month = 1; Month <= 12; Month++) {
            int accumulation = 29000;
            int sumAccumulation = Month * 29000;
            System.out.println("Месяц " + Month + " , сумма накоплений равна" + sumAccumulation + " рублей");
        }
    }

    private static void task9() {
        for (int Month = 1; Month <= 12; Month++) {
            int accumulation = 29000;
            int interestAccumulation = Month * 29000 + (Month * 29000 * 0_01);
            System.out.println("Месяц " + Month + " , сумма накоплений равна" + interestAccumulation + " рублей");
        }
    }

    private static void task10() {
        for (int Numbers2 = 1; Numbers2 <= 20; Numbers2 = Numbers2 * 2) {
            System.out.println(Numbers2);
        }
    }
}