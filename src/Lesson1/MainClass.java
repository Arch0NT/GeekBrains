package Lesson1;

public class MainClass {

    public static void main(String[] args) {
        //Пункт 2 ======================================================================================================
        byte a = 120; // 8-bit
        System.out.println("byte: " + a);

        short b = (short) (a + 1); // 16-bit
        System.out.println("short: " + b);

        int c = a + 2; // 32-bit
        System.out.println("int: " + c);

        long d = a + 3; // 64-bit
        System.out.println("long: " + d);

        boolean bool; // логическое
        System.out.println("boolean: " + (bool = true));

        float piF = 3.1415926f;
        double piD = 3.1415926;
        System.out.println("piF: " + piF + "piD: " + piD);

        char ch = '\u6556';
        System.out.println("Символ: " + ch);

        System.out.println(abcd(a, b, c, (int) d)); // скастовали d как int, оставшиеся a,b - автоприведение к int

        System.out.println(interval(10, 5));

        printPositiveOrNegative(0);

        System.out.println(checkNegative(-1));

        printHello("Вася Пупкин");

        intercalaryYear(2400); //1900 - нет, 1804 - да, 2000 - да, 2400 - да

    }

    //Пункт 3 ==========================================================================================================
    public static int abcd(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    //Пункт 4 ==========================================================================================================
    public static boolean interval(int a, int b) {
        return ((a + b) > 10) && ((a + b) <= 20); //проверка на 10 исключительно, на 20 включительно
    }

    //Пункт 5 ==========================================================================================================
    public static void printPositiveOrNegative(int a) {
        //Тернарный оператор
        System.out.println(checkNegative(a) ? "Метод получил отрицательное число": "Метод получил положительное число");
    }

    //Пункт 6 ==========================================================================================================
    public static boolean checkNegative(int a) {
        return a < 0;
    }

    //Пункт 7 ==========================================================================================================
    public static void printHello(String name) {
        System.out.printf("Привет, %s!\n", name);
    }

    //Пункт 8 ==========================================================================================================
    public static void intercalaryYear(long year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
