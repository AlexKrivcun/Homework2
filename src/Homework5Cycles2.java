public class Homework5Cycles2 {
    public static void main(String[] args) {
    }

    private static void task1() {
        int attachments = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + attachments;
            System.out.println("Месяц " + month + " , сумма накоплений равна" + total + " рублей");
        }
    }

    private static void task2() {
        int Numbers = 0;
        while (Numbers <= 10) {
            System.out.print(Numbers);
        }
        for (int i = 10; i <= 0; i--) {
            System.out.println(i);

        }
    }

    private static void task3() {
        int populationY = 12_000_000;
        int fertility = (populationY / 1000) * 17;
        int mortality = (populationY / 1000) * 8;
        int years = 0;
        while (years <= 10) {
            populationY = populationY + fertility;
            fertility = fertility - mortality;
            System.out.println("Год " + years + " , счисленность населения составляет" + populationY + " человек");
        }
    }

    private static void task4() {
        int capitalInitial = 15_000;
        double annualInterest = 0.07;
        double capitalNew = 0;
        int Month = 0;
        while (capitalNew == 12_000_000) {
            capitalNew = capitalInitial + capitalInitial * annualInterest;
            System.out.println("Месяц " + Month + " , новый капитал" + capitalNew + " руб.");
        }
    }

    private static void task5() {
        int capitalInitial = 15_000;
        double annualInterest = 0.07;
        double capitalNew = 0;
        int month = 0;
        for ( ; capitalNew == 12_000_000; month++);
        if ( month % 2 == 0) {
            capitalNew = capitalInitial + capitalInitial * annualInterest;
            System.out.println("Месяц " + month + " , новый капитал" + capitalNew + " руб.");
        }
    }

    private static void task6() {
        int capitalInitial = 15_000;
        double annualInterest = 0.07;
        double capitalNew = 0;
        int Month = 0;
        while (Month == Month * 6) {
            capitalNew = capitalInitial + capitalInitial * annualInterest;
            System.out.println("Месяц6 " + Month + " , новый капитал6" + capitalNew + " руб.");
        }
    }

    private static void task7() {
        int fridayReport = 5;
        int numbers = 0;
        while (numbers <= 31) {
            fridayReport = fridayReport + 7;
            if (numbers % 5 == 0) {
                System.out.println("Сегодня пятница " + fridayReport + "-е число. Необходимо подготовить отчет" + numbers);
            }
        }
    }

    private static void task8() {
        int cometFlies = 79;
        int years = 0;
        for (; years <= 2123; years++) {
            years = years + 79;
            years = cometFlies + years;
            if (years >= 1823 && years <= 2123 ) {
                System.out.println(years);
            }
        }
    }
}


