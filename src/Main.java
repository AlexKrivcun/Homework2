public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        var staff = (640 / 8);
        System.out.println("Всего сотрудиков в компании" + staff + "человек");
    }

    public static void task2() {
        var staff = (640 / 8);
        staff = staff + 94;
        var total = (640 / staff);
        System.out.println("Если в компании работает" + staff + "человек");
        System.out.println("Всего" + total + "часов работы может быть поделено между сотрудниками");
    }
}