package ru.geekbrains.java.lesson22;

public class MyArrayDataException extends MyArrayException{

    public MyArrayDataException (int arrayErrorIndexX, int arrayErrorIndexY){
        super("Неверный формат данных элемента массива с индексом ["+arrayErrorIndexX+"]["+arrayErrorIndexY+"]");
    }
}
