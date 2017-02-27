package ru.geekbrains.java.lesson22;

public class MyArraySizeException extends MyArrayException {

    public MyArraySizeException() {
        super("Возникли проблемы с размерностью переданного массива");
    }
}
