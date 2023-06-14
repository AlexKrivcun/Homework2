
public class Homework6Arrays {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        int[] integerArray = new int[3];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;
        System.out.println(Arrays.toString(integerArray));
    }

    private static void task2() {
        double[] integerArray = new double[3];
        integerArray[0] = 1.57;
        integerArray[1] = 7.654;
        integerArray[2] = 9.986;
        System.out.println(Arrays.toString(integerArray));
    }

    private static void task3() {
        double[] height = {175.2, 176.3, 177.5, 178.9, 179.7, 180.1};
        System.out.println(Arrays.toString(height));
    }

    private static void task4() {
        int[] integerArray = {1, 2, 3};
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 != 0) {
                integerArray[i] += 1;
            }
        }
        System.out.println(Arrays.toString(integerArray));
    }
}