public class Homework8Lines {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        String firstName = " Ivan";
        String middleName = " Ivanovich";
        String lastName = "Ivanov";
        lastName = lastName + firstName + middleName;
        System.out.println(lastName);
    }
    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println(fullName.toUpperCase());
    }
    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String fullName1 = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName1);
    }
}
