package Lesson5;

import java.util.Scanner;

public class MyClass5 {
    public static void main(String[] args) {
        Scanner scn;
        String[] dataStrings = new String[5];
        Employees[] employees = new Employees[5];
        dataStrings[0] = "Иванов Иван Иваныч, Инженер, ivanov.ivan@haven.sky, +7 (777) 777 77 76, 100000, 40";
        dataStrings[1] = "Петров Петр, Директор, petrov.petr@haven.sky, +7 (777) 777 77 78, 400000, 48";
        dataStrings[2] = "Андреев Андрей Андреевич, Исполнительный Директор, andreev.andrey@haven.sky, +7 (777) 777 77 79, 300000, 45";
        dataStrings[3] = "Петрова Анна Ивановна, Главный бухгалтер, petrova.anna@haven.sky, +7 (777) 777 77 80, 200000, 41";
        dataStrings[4] = "Шматько Григорий, Программист, shmatko.grigoriy@haven.sky, +7 (777) 777 77 77, 100000, 40";
        for (int i = 0; i < dataStrings.length; i++) {
            scn = new Scanner(dataStrings[i]).useDelimiter(", ");
            employees[i] = new Employees(scn.next(), scn.next(), scn.next(), scn.next(), scn.nextInt(), scn.nextInt());
        }
        for (Employees employee : employees) if (employee.getAge()>40) employee.printInfo();
    }
}
