import java.time.LocalDate;

class Homework9Methods {

    public static void verifyLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void selectionOSVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        switch (clientOS) {
            case 1:
                System.out.println((clientDeviceYear < currentYear) ? "Установите облегченную версию приложения" +
                        " для Android по ссылке." : "Установите версию приложения для Android по ссылке.");
                break; //разные способы записи условного оператора в случае case 0 и case 1 - для повторения и закрепления материала
            case 0:
                if (clientDeviceYear < currentYear) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                }
                break;
            default:
                System.out.println("Сожалеем, Ваша опереционная система не поддерживается. " +
                        "Подерживаемые ОС: iOS и Android.");
        }
    }

    public static double checkDeliveryTime(int deliveryDistance) {
        double deliveryDays;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = Double.POSITIVE_INFINITY;
        }
        return deliveryDays;
    }
}

