public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        task4();


        var wastes = generateRandomArray();
        int total = 0;
        for (int i = 0; i < wastes.length; i++) {
            total = total + wastes[i];
        }
        //System.out.println("Сумма трат за месяц составила " + total + " рублей.");
    }

    public static void task2() {
        var wastes = generateRandomArray();
        int max = wastes[0];
        int min = wastes[0];
        for (int i = 0; i < wastes.length; i++) {
            if (wastes[i] < min) {
                min = wastes[i];
            }

        }
        for (int i = 0; i < wastes.length; i++) {
            if (wastes[i] > max) {
                max = wastes[i];
            }
        }

        System.out.println("Максимальная сумма трат за день составила " + max + " рублей." + " Минимальная сумма трат за день соствила " + min + " рублей");
    }

    public static void task3() {
        var wastes = generateRandomArray();
        int total = 0;
        for (int i = 0; i < wastes.length; i++) {
            total = total + wastes[i];

        }
        System.out.print("Средняя сумма трат за месяц составила " + (float) +total / 30 + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
