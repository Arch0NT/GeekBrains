package ru.geekbrains.java.lesson22;

public class MyClass22 {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "3", "1", "2"},
                {"-8", "3", "2", "2"},
                {"5", "6", "7", "1"},
                //{"#", "3", "1", "0", "546"} //для тестовых целей MyArraySizeException
                //{"#", "3", "1", "0"} //для тестовых целей MyArrayDataException
                {"1","3","1","0"}
        };
        StringArrayToIntSumm str2int = null; //использовал вместо метода класс
        try {
            str2int = new StringArrayToIntSumm(arr);
        } catch (MyArrayException e) {
            e.printStackTrace();
        } finally {
            System.out.println((str2int != null) ? str2int.getSumm() : "Объект не создан");
        }
    }
}
