package Lesson2;

import java.util.Arrays;

public class MyClass {

    public static void main(String[] args) {
        System.out.println("Пункт 1 ===============================================================================");
        byte[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Переданный массив:");
        for (byte i : a) { //цикл foreach - т.к. нет необходимости в индексах массива
            System.out.print(i + " ");
        }
        System.out.println("\nИнвертер в действии :-)");
        for (byte i : arrayInverter(a)) {
            System.out.print(i + " ");
        }

        System.out.println("\nПункт 2 ===============================================================================");
        int[] b = new int[8]; // создание пустого массива
        System.out.println("Поглядим, что получили при заполнении массива");
        for (int i : arrayFiller(b)) {
            System.out.print(i + " ");
        }

        System.out.println("\nПункт 3 ===============================================================================");
        int[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Наш массив до изменений:");
        for (int i : c) {
            System.out.print(i + " ");
        }
        System.out.println("\nПоглядим, что с ним сотворил arrayChanger");
        for (int i : arrayChanger(c)) {
            System.out.print(i + " ");
        }

        System.out.println("\nПункт 4 ===============================================================================");
        int[][] d = new int[8][8];
        System.out.println("Передаем девственно чистый массив в метод, и глядим, что он с ним сотворил");
        for (int i[] :arrayDiagonalFiller(d)) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("Пункт 5 ===============================================================================");
        System.out.println("Используем обработанный массив с из пункта 3");
        arrayMinMaxFinder(c);

        System.out.println("Пункт 6 ===============================================================================");
        int [] e = {10,1,1,1,8,1};
        System.out.println(isBalance(e));

        System.out.println(Arrays.toString(arrayRotator(e,-6)));
    }

    public static byte [] arrayInverter(byte[] a) {
        for (int i = 0; i < a.length; i++)
            a[i]^=1;
        /*
        операция исключающее или (xor) с присваиванием выполняется быстрее чем сравнение
        if (a[i]==0) a[i]=1; else a[i]=0;
         */
        return a;
    }

    public static int[] arrayFiller(int[] a) {
        for (int i = 0; i < 8; i++)
            a[i] = i * 3;
        return a;
    }

    public static int [] arrayChanger(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) a[i] *= 2;
        }
        return a;
    }

    public static int [][] arrayDiagonalFiller(int[][] a) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i == j) || ((i + j) == 7))
                    a[i][j] = 1;
            }
        }
        return a;
    }

    public static void arrayMinMaxFinder(int [] a) {
        int max = Integer.MIN_VALUE; // минимальное значаение из всех int
        int min = Integer.MAX_VALUE; // максимальное значаение из всех int
        for (int i : a) {
            if (max < i) max = i;
            if (min > i) min = i;
        }
        System.out.println("Максимальное значение в массиве: " + max);
        System.out.println("Минимальное значение в массиве: " + min);
    }

    public static boolean isBalance(int[] a) {
        long left=0, right;
        for (int i = 0; i < a.length-1; i++) {
            left+=a[i];
            right=0;
            for (int j = a.length-1; j >i ; j--) {
                right+=a[j];
            }
            if (left==right) {
                System.out.printf("Левая часть содержит %d числа, а правая оставшиеся %d\n", i+1,a.length-(i+1));
                return true;
            }
        }
        return false;
    }

    public static int [] arrayRotator(int[] a, int n) {
        int temp;
        if (n>=0){
            for (int j = 0; j <n; j++) {
                temp = a[0];
                System.arraycopy(a, 1, a, 0, a.length - 1);
                a[a.length - 1] = temp;
            }
        } else {
            for (int j = n*-1; j >0; j--) {
                temp = a[a.length - 1];
                System.arraycopy(a, 0, a, 1, a.length - 1);
                a[0] = temp;
            }
        }
        return a;
    }
}