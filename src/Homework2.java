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
        if (age >= 2 && age <= 6) {
            System.out.println("Нужно ходить в детский сад");
        }
        if (age >= 6 && age <= 18) {
            System.out.println("Нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
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
        if (age >= 5 && age < 14) {
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
        int standBusy = 40;
        int seatBusy = 20;
        if (seatBusy < seatCount && standBusy < standCount) {
            System.out.println("В вагоне есть " + (seatCount - seatBusy) + " сидячих мест, и " +
                    (standCount - standBusy) + " стоячих мест");
        } else if (seatBusy >= seatCount && standBusy < standCount) {
            System.out.println("В вагоне есть " + (standCount - standBusy) + " стоячих мест");
        } else if (seatBusy < seatCount && standBusy >= standCount) {
            System.out.println("В вагоне есть " + (seatCount - seatBusy) + " сидячих мест");
        } else {
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

