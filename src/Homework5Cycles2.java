public class Homework5Cycles2 {
    public static void main(String[] args) {
    }

    private static void task1() {
        int attachments = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + attachments;
            month++;
            System.out.println("Месяц " + month + " , сумма накоплений равна" + total + " рублей");
        }
    }

    private static void task2() {
        int numbers = 0;
        while (numbers <= 10) {
            System.out.print(numbers);
        }
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);

        }
    }

    private static void task3() {
        int populationY = 12_000_000;
        int years = 0;
        while (years <= 10) {
            int fertility = (populationY / 1000) * 17;
            int mortality = (populationY / 1000) * 8;
            populationY = populationY + fertility - mortality;
            years++;
            System.out.println("Год " + years + " , счисленность населения составляет" + populationY + " человек");
        }
    }

    private static void task4() {
        int capitalInitial = 15_000;
        double annualInterest = 0.07;
        double capitalNew = 0;
        int Month = 0;
        while (capitalNew <= 12_000_000) {
            capitalNew = capitalInitial + capitalInitial * annualInterest;
            System.out.println("Месяц " + Month + " , новый капитал" + capitalNew + " руб.");
        }
    }

    private static void task5() {
        int capitalInitial = 15_000;
        double annualInterest = 0.07;
        double capitalNew = 0;
        int month = 0;
        for (; capitalNew <= 12_000_000; month++) ;
        capitalNew = capitalNew + capitalInitial * annualInterest;
        if (month % 6 == 0) {
            System.out.println("Месяц " + month + " , новый капитал" + capitalNew + " руб.");
        }
    }

    private static void task6() {
        int capitalInitial = 15_000;
        double annualInterest = 0.07;
        double capitalNew = 0;
        int year = 9;
        int month = 0;
        while (month <= year * 12) {
            capitalNew = capitalInitial + capitalInitial * annualInterest;
            month++;
            System.out.println("Месяц 6й " + month + " , новый капитал6" + capitalNew + " руб.");
        }
    }

    private static void task7() {
        int fridayReport = 5;
        int numbers = 0;
        while (fridayReport <= 31) {
                System.out.println("Сегодня пятница " + fridayReport + "-е число. Необходимо подготовить отчет" + numbers);
            fridayReport = fridayReport + 7;
            }
    }

    private static void task8() {
        int cometFlies = 79;
        for (int years = 0; years <= 2123; years += cometFlies) {
            if (years >= 1823) {
                System.out.println(years);
            }
        }
    }
    private static void task9() {
        for (int i = 0; i < 12; i++) {
            System.out.println(i);
        }
    }
}



