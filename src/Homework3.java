public class Homework3 {
    public static void main(String[] args) {
    }

    private static void task1() {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    private static void task2() {
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
                if (clientDeviceYear < 2015) {
                    System.out.println("становите облегченную версию приложения для Android по ссылке");
                }
            }
        }
    }

    private static void task3() {
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
                if (clientDeviceYear < 2015) {
                    System.out.println("становите облегченную версию приложения для Android по ссылке");
                }
            }
        }
    }

    private static void task4() {
        int year = 2023;
        if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static void task5() {
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка занимает " + days + " дней");
        }
        else if (deliveryDistance <= 60) {
            System.out.println("Доставка занимает " + (days + 1) + " дней");
        }
        else if (deliveryDistance <= 100) {
            System.out.println("Доставка занимает " + (days + 2) + " дней");
        }
        else {
            System.out.println("Нет доставки");
        }
    }

    private static void task6() {
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + "Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " Осень");
                break;
            default:
                System.out.println("Не выполняется программа");
        }
    }
}
